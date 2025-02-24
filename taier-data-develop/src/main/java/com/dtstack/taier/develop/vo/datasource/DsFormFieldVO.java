package com.dtstack.taier.develop.vo.datasource;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 数据源表单属性视图类
 * @description:
 * @author: liuxx
 * @date: 2021/3/9
 */
@ApiModel("数据源表单属性")
public class DsFormFieldVO implements Serializable {

    /**
     * 表单属性名称
     */
    @ApiModelProperty("表单属性名称")
    private String name;

    /**
     * 属性前label名称
     */
    @ApiModelProperty("属性前label名称")
    private String label;

    /**
     * 属性格式
     */
    @ApiModelProperty("属性格式")
    private String widget;

    /**
     * 是否必填
     */
    @ApiModelProperty("是否必填 0-非必填 1-必填")
    private Integer required;

    /**
     * 是否为隐藏
     */
    @ApiModelProperty("是否为隐藏 0-否 1-隐藏")
    private Integer invisible;

    /**
     * 表单属性中默认值
     */
    @ApiModelProperty("表单属性中默认值")
    private String defaultValue;

    /**
     * 输入框placeHold, 默认为空'
     */
    @ApiModelProperty("输入框placeHold, 默认为空")
    private String placeHold;

    /**
     * 请求数据Api接口地址，一般用于关联下拉框类型，如果不需要请求则为空
     */
    @ApiModelProperty("请求数据Api接口地址，一般用于关联下拉框类型，如果不需要请求则为空")
    private String requestApi;

    /**
     * 是否为数据源需要展示的连接信息字段。0-否; 1-是
     */
    @ApiModelProperty("是否为数据源需要展示的连接信息字段。0-否; 1-是")
    private Integer isLink;

    /**
     * 校验返回信息文案
     */
    @ApiModelProperty("校验返回信息文案")
    private String validInfo;

    /**
     * 输入框后问号的提示信息
     */
    @ApiModelProperty("输入框后问号的提示信息")
    private String tooltip;

    /**
     * 前端表单属性style参数
     */
    @ApiModelProperty("前端表单属性style参数")
    private String style;

    /**
     * 正则校验表达式
     */
    @ApiModelProperty("正则校验表达式")
    private String regex;

    @ApiModelProperty("select组件下拉内容")
    private List<Map> options;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getWidget() {
        return widget;
    }

    public void setWidget(String widget) {
        this.widget = widget;
    }

    public Integer getRequired() {
        return required;
    }

    public void setRequired(Integer required) {
        this.required = required;
    }

    public Integer getInvisible() {
        return invisible;
    }

    public void setInvisible(Integer invisible) {
        this.invisible = invisible;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getPlaceHold() {
        return placeHold;
    }

    public void setPlaceHold(String placeHold) {
        this.placeHold = placeHold;
    }

    public String getRequestApi() {
        return requestApi;
    }

    public void setRequestApi(String requestApi) {
        this.requestApi = requestApi;
    }

    public Integer getIsLink() {
        return isLink;
    }

    public void setIsLink(Integer isLink) {
        this.isLink = isLink;
    }

    public String getValidInfo() {
        return validInfo;
    }

    public void setValidInfo(String validInfo) {
        this.validInfo = validInfo;
    }

    public String getTooltip() {
        return tooltip;
    }

    public void setTooltip(String tooltip) {
        this.tooltip = tooltip;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    public List<Map> getOptions() {
        return options;
    }

    public void setOptions(List<Map> options) {
        this.options = options;
    }
}
