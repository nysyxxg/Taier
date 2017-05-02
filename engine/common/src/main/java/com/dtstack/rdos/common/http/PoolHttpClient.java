package com.dtstack.rdos.common.http;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.LayeredConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.util.EntityUtils;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dtstack.rdos.commom.exception.ExceptionUtil;

/**
 * 
 * Reason: TODO ADD REASON(可选)
 * Date: 2017年03月10日 下午1:16:37
 * Company: www.dtstack.com
 * @author sishu.yss
 *
 */
public class PoolHttpClient {

	private static final Logger logger = LoggerFactory
			.getLogger(HttpClient.class);

	private static int SocketTimeout = 10000;// 10秒

	private static int ConnectTimeout = 10000;// 10秒

	// 将最大连接数增加到100
	private static int maxTotal = 100;
	
	// 将每个路由基础的连接增加到20
	private static int maxPerRoute = 20;
	
	private static Boolean SetTimeOut = true;

	private static ObjectMapper objectMapper = new ObjectMapper();
	
	private static CloseableHttpClient httpClient = getHttpClient();
	
	private static Charset charset = Charset.forName("UTF-8");

	private static CloseableHttpClient getHttpClient() {
		ConnectionSocketFactory plainsf = PlainConnectionSocketFactory
				.getSocketFactory();
		LayeredConnectionSocketFactory sslsf = SSLConnectionSocketFactory
				.getSocketFactory();
		Registry<ConnectionSocketFactory> registry = RegistryBuilder
				.<ConnectionSocketFactory> create().register("http", plainsf)
				.register("https", sslsf).build();
		PoolingHttpClientConnectionManager cm = new PoolingHttpClientConnectionManager(
				registry);
		cm.setMaxTotal(maxTotal);
		cm.setDefaultMaxPerRoute(maxPerRoute);
        return HttpClients.custom()
                .setConnectionManager(cm).setRetryHandler(new RdosHttpRequestRetryHandler()).build();
	}

	public static String post(String url, Map<String, Object> bodyData) {
		String responseBody = null;
		CloseableHttpResponse response = null;
		try {
			HttpPost httPost = new HttpPost(url);
			setConfig(httPost);
			if (bodyData != null && bodyData.size() > 0) {
				httPost.setEntity(new StringEntity(objectMapper
						.writeValueAsString(bodyData)));
			}
			// 请求数据
			response = httpClient.execute(httPost);
			int status = response.getStatusLine().getStatusCode();
			if (status == HttpStatus.SC_OK) {
				HttpEntity entity = response.getEntity();
				// FIXME 暂时不从header读取
				responseBody = EntityUtils.toString(entity,charset);
			} else {
				logger.warn("request url:{} fail:{}",url,response.getStatusLine().getStatusCode());
			}
		} catch (Exception e) {
			logger.error("url:{}--->http request error:{}",url,ExceptionUtil.getErrorMessage(e));
		}finally{
			if(response!=null)
				try {
					response.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		} 
		return responseBody;
	}

	private static void setConfig(HttpRequestBase httpRequest){
		if (SetTimeOut) {
			RequestConfig requestConfig = RequestConfig.custom()
					.setSocketTimeout(SocketTimeout)
					.setConnectTimeout(ConnectTimeout).build();// 设置请求和传输超时时间
			httpRequest.setConfig(requestConfig);
		}
	}
	
	public static String get(String url) {
		String respBody = null;
		HttpGet httpGet = null; 
		CloseableHttpResponse response = null;
		try {
			httpGet = new HttpGet(url);
			setConfig(httpGet);
			response = httpClient.execute(httpGet);
			if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
				HttpEntity entity = response.getEntity();
				respBody = EntityUtils.toString(entity,charset);
			}else{
				logger.warn("request url:{} fail:{}",url,response.getStatusLine().getStatusCode());
			}
		} catch (IOException e) {
			logger.error("url:{}--->http request error:{}",url,ExceptionUtil.getErrorMessage(e));
		}finally{
			if(response!=null)
				try {
					response.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		} 
		return respBody;
	}
	
	public static void main(String[] args){
		for(int i=0;i<10;i++){
			System.out.println(PoolHttpClient.get("https://www.baidu.com/"));
		}
	}
}
