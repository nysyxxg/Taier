package com.dtstack.taier.develop.vo.datasource;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 数据表单模版视图类
 * @description:
 * @author: liuxx
 * @date: 2021/3/9
 */
@ApiModel("数据表单模版视图类")
public class DsFormTemplateVO implements Serializable {

    @ApiModelProperty(value = "数据源类型", notes = "具体查看com.dtstack.pubsvc.common.enums.datasource.DsType枚举类")
    private String dataType;

    @ApiModelProperty("数据源版本 可为空")
    private String dataVersion;

    @ApiModelProperty("模版表单属性详情列表")
    private List<DsFormFieldVO> fromFieldVoList;


    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getDataVersion() {
        return dataVersion;
    }

    public void setDataVersion(String dataVersion) {
        this.dataVersion = dataVersion;
    }

    public List<DsFormFieldVO> getFromFieldVoList() {
        return fromFieldVoList;
    }

    public void setFromFieldVoList(List<DsFormFieldVO> fromFieldVoList) {
        this.fromFieldVoList = fromFieldVoList;
    }
}
