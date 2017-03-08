package com.dtstack.rdos.engine.entrance.service;

import java.util.Map;

import com.dtstack.rdos.common.util.HttpClient;
import com.dtstack.rdos.common.util.PublicUtil;
import com.dtstack.rdos.common.util.UrlUtil;
import com.dtstack.rdos.engine.entrance.enumeration.RequestStart;
import com.dtstack.rdos.engine.entrance.http.Urls;
import com.dtstack.rdos.engine.entrance.service.paramObject.ParamAction;
import com.dtstack.rdos.engine.entrance.sql.SqlParser;
import com.dtstack.rdos.engine.entrance.zk.ZkDistributed;
import com.dtstack.rdos.engine.entrance.zk.data.BrokerDataNode;
import com.dtstack.rdos.engine.execution.base.JobClient;
import com.dtstack.rdos.engine.execution.base.enumeration.RdosTaskStatus;

/**
 * 
 * Reason: TODO ADD REASON(可选)
 * Date: 2017年03月03日 下午1:25:18
 * Company: www.dtstack.com
 * @author sishu.yss
 *
 */
public class ActionServiceImpl{
	
	private ZkDistributed zkDistributed = ZkDistributed.getZkDistributed();
	
	public void start(Map<String,Object> params) throws Exception{
		ParamAction paramAction = PublicUtil.mapToObject(params, ParamAction.class);
		String address = zkDistributed.getExcutionNode();
		if(paramAction.getRequestStart()==RequestStart.NODE.getStart()||zkDistributed.getLocalAddress().equals(address)){
			BrokerDataNode brokerDataNode = BrokerDataNode.initBrokerDataNode();
			brokerDataNode.getMetas().put(paramAction.getTaskId(), RdosTaskStatus.UNSUBMIT.getStatus().byteValue());
			zkDistributed.updateSynchronizedBrokerData(zkDistributed.getLocalAddress(),brokerDataNode, false);
			zkDistributed.updateLocalMemTaskStatus(brokerDataNode);
			new JobClient(SqlParser.parser(paramAction)).submit();
		}else{
			paramAction.setRequestStart(RequestStart.NODE.getStart());
			HttpClient.post(UrlUtil.getHttpUrl(address, Urls.START), PublicUtil.ObjectToMap(paramAction));
		}
	}
	
	public void stop(Map<String,Object> params) throws Exception{
		ParamAction paramAction = PublicUtil.mapToObject(params, ParamAction.class);
		JobClient.stop(paramAction.getEngineTaskId());
	}
}
