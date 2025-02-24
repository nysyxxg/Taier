/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dtstack.taier.develop.vo.develop.result;

import com.dtstack.taier.develop.vo.develop.query.BatchScheduleTaskResultVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

@ApiModel("任务信息")
public class BatchTaskGetTaskByIdResultVO {

    @ApiModelProperty(value = "任务周期 ID", example = "1")
    protected Integer taskPeriodId;

    @ApiModelProperty(value = "任务周期类别", example = "2")
    protected String taskPeriodType;

    @ApiModelProperty(value = "节点名称", example = "数据开发")
    private String nodePName;

    @ApiModelProperty(value = "用户 ID", example = "2")
    private Long userId;

    @ApiModelProperty(value = "锁版本", example = "11")
    private Integer lockVersion;

    @ApiModelProperty(value = "任务参数")
    private List<Map> taskVariables;

    @ApiModelProperty(value = "是否覆盖更新", example = "true")
    private Boolean forceUpdate = false;

    @ApiModelProperty(value = "数据源 ID", example = "2")
    private Long dataSourceId;

    @ApiModelProperty(value = "任务信息")
    private BatchScheduleTaskResultVO subNodes;

    @ApiModelProperty(value = "任务信息")
    private List<BatchScheduleTaskResultVO> relatedTasks;

    @ApiModelProperty(value = "租户名称", example = "dev租户")
    private String tenantName;

    @ApiModelProperty(value = "项目名称", example = "dev开发")
    private String projectName;

    @ApiModelProperty(value = "创建模式 0-向导模式，1-脚本模式", example = "0")
    private Integer createModel = 0;

    @ApiModelProperty(value = "操作模式 0-资源模式，1-编辑模式", example = "1")
    private Integer operateModel = 0;

    @ApiModelProperty(value = "python版本 2-python2.x,3-python3.x式", example = "2")
    private Integer pythonVersion = 0;

    @ApiModelProperty(value = "0-TensorFlow,1-MXNet", example = "1")
    private Integer learningType = 0;

    @ApiModelProperty(value = "输入数据文件的路径", example = "/usr/opt/a")
    private String input;

    @ApiModelProperty(value = "输出模型的路径", example = "/usr/opt/a")
    private String output;

    @ApiModelProperty(value = "脚本的命令行参数", example = "")
    private String options;

    @ApiModelProperty(value = "工作流名称", example = "数据同步test")
    private String flowName;

    @ApiModelProperty(value = "同步模式", example = "2")
    private Integer syncModel = 0;

    @ApiModelProperty(value = "自增字段")
    private String increColumn;

    @ApiModelProperty(value = "是否是当前项目", example = "true")
    private Boolean currentProject = false;

    @ApiModelProperty(value = "任务信息")
    private List<BatchScheduleTaskResultVO> taskVOS;

    @ApiModelProperty(value = "任务信息")
    private List<BatchScheduleTaskResultVO> subTaskVOS;

    @ApiModelProperty(value = "定时周期表达式", example = "* 0/1 * * * *")
    protected String cron;

    @ApiModelProperty(value = "是否发布到了生产环境", example = "1")
    private Long isPublishToProduce;

    @ApiModelProperty(value = "扩展信息")
    private String extraInfo;

    @ApiModelProperty(value = "任务 ID", example = "1")
    private Long taskId;

    @ApiModelProperty(value = "batchJob执行的时候的vesion版本", example = "23")
    private Integer versionId;

    @ApiModelProperty(value = "任务名称(name)必填", example = "dev_test")
    private String name;

    @ApiModelProperty(value = "任务类型(taskType)必填", example = "0")
    private Integer taskType;

    @ApiModelProperty(value = "计算类型 0实时，1 离线", example = "1")
    private Integer computeType;

    @ApiModelProperty(value = "执行引擎类型 0 flink, 1 spark", example = "1")
    private Integer engineType;

    @ApiModelProperty(value = "sql 文本", example = "select * from test")
    private String sqlText;

    @ApiModelProperty(value = "任务参数", example = "job.executor:1")
    private String taskParams;

    @ApiModelProperty(value = "调度配置")
    private String scheduleConf;

    @ApiModelProperty(value = "周期类型", example = "1")
    private Integer periodType;

    @ApiModelProperty(value = "调度状态", example = "2")
    private Integer scheduleStatus;

    @ApiModelProperty(value = "启动:0 停止:1", example = "0")
    private Integer projectScheduleStatus;

    @ApiModelProperty(value = "提交状态", example = "0")
    private Integer submitStatus;

    @ApiModelProperty(value = "最后修改task的用户", example = "5")
    private Long modifyUserId;

    @ApiModelProperty(value = "新建task的用户", example = "3")
    private Long createUserId;

    @ApiModelProperty(value = "负责人id", example = "3")
    private Long ownerUserId;

    @ApiModelProperty(value = "节点 id", example = "13")
    private Long nodePid;

    @ApiModelProperty(value = "任务描述", example = "测试任务")
    private String taskDesc;

    @ApiModelProperty(value = "入口类")
    private String mainClass;

    @ApiModelProperty(value = "启动参数")
    private String exeArgs;

    @ApiModelProperty(value = "所属工作流id", example = "32")
    private Long flowId;

    @ApiModelProperty(value = "平台类型", example = "11")
    private Integer appType;

    @ApiModelProperty(value = "租户 ID", example = "3")
    private Long tenantId;

    @ApiModelProperty(value = "项目 ID", example = "5")
    private Long projectId;

    @ApiModelProperty(value = "主键 ID", example = "1")
    private Long id = 0L;

    @ApiModelProperty(value = "创建时间", example = "2020-12-29T11:39:13.000+00:00")
    private Timestamp gmtCreate;

    @ApiModelProperty(value = "修改时间", example = "2020-12-29T11:39:13.000+00:00")
    private Timestamp gmtModified;

    @ApiModelProperty(value = "是否删除", example = "0")
    private Integer isDeleted = 0;

    @ApiModelProperty(value = "")
    private  String EMPYT = "";

    @ApiModelProperty(value = "组件版本", example = "1.8")
    private String componentVersion;

    @ApiModelProperty(value = "")
    private List<BatchResourceResultVO> resourceList;

    @ApiModelProperty(value = "")
    private List<BatchResourceResultVO> refResourceList;

    @ApiModelProperty(value = "任务版本信息")
    private List<BatchTaskVersionDetailResultVO> taskVersions;

    @ApiModelProperty(value = "工作流父任务版本号 ")
    private Integer parentReadWriteLockVersion ;

    @ApiModelProperty(value = "读写锁信息")
    private ReadWriteLockResultVO readWriteLockVO;

    @ApiModelProperty(value = "task 版本")
    private Integer version;

    @ApiModelProperty(value = "任务创建人信息")
    private BatchUserGetTaskByIdResultVO createUser;

    @ApiModelProperty(value = "任务修改人信息")
    private BatchUserGetTaskByIdResultVO modifyUser;

    @ApiModelProperty(value = "任务责任人信息")
    private BatchUserGetTaskByIdResultVO ownerUser;

    public Integer getTaskPeriodId() {
        return taskPeriodId;
    }

    public void setTaskPeriodId(Integer taskPeriodId) {
        this.taskPeriodId = taskPeriodId;
    }

    public String getTaskPeriodType() {
        return taskPeriodType;
    }

    public void setTaskPeriodType(String taskPeriodType) {
        this.taskPeriodType = taskPeriodType;
    }

    public String getNodePName() {
        return nodePName;
    }

    public void setNodePName(String nodePName) {
        this.nodePName = nodePName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getLockVersion() {
        return lockVersion;
    }

    public void setLockVersion(Integer lockVersion) {
        this.lockVersion = lockVersion;
    }

    public List<Map> getTaskVariables() {
        return taskVariables;
    }

    public void setTaskVariables(List<Map> taskVariables) {
        this.taskVariables = taskVariables;
    }

    public Boolean getForceUpdate() {
        return forceUpdate;
    }

    public void setForceUpdate(Boolean forceUpdate) {
        this.forceUpdate = forceUpdate;
    }

    public Long getDataSourceId() {
        return dataSourceId;
    }

    public void setDataSourceId(Long dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    public BatchScheduleTaskResultVO getSubNodes() {
        return subNodes;
    }

    public void setSubNodes(BatchScheduleTaskResultVO subNodes) {
        this.subNodes = subNodes;
    }

    public List<BatchScheduleTaskResultVO> getRelatedTasks() {
        return relatedTasks;
    }

    public void setRelatedTasks(List<BatchScheduleTaskResultVO> relatedTasks) {
        this.relatedTasks = relatedTasks;
    }

    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Integer getCreateModel() {
        return createModel;
    }

    public void setCreateModel(Integer createModel) {
        this.createModel = createModel;
    }

    public Integer getOperateModel() {
        return operateModel;
    }

    public void setOperateModel(Integer operateModel) {
        this.operateModel = operateModel;
    }

    public Integer getPythonVersion() {
        return pythonVersion;
    }

    public void setPythonVersion(Integer pythonVersion) {
        this.pythonVersion = pythonVersion;
    }

    public Integer getLearningType() {
        return learningType;
    }

    public void setLearningType(Integer learningType) {
        this.learningType = learningType;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public String getFlowName() {
        return flowName;
    }

    public void setFlowName(String flowName) {
        this.flowName = flowName;
    }

    public Integer getSyncModel() {
        return syncModel;
    }

    public void setSyncModel(Integer syncModel) {
        this.syncModel = syncModel;
    }

    public String getIncreColumn() {
        return increColumn;
    }

    public void setIncreColumn(String increColumn) {
        this.increColumn = increColumn;
    }

    public Boolean getCurrentProject() {
        return currentProject;
    }

    public void setCurrentProject(Boolean currentProject) {
        this.currentProject = currentProject;
    }

    public List<BatchScheduleTaskResultVO> getTaskVOS() {
        return taskVOS;
    }

    public void setTaskVOS(List<BatchScheduleTaskResultVO> taskVOS) {
        this.taskVOS = taskVOS;
    }

    public List<BatchScheduleTaskResultVO> getSubTaskVOS() {
        return subTaskVOS;
    }

    public void setSubTaskVOS(List<BatchScheduleTaskResultVO> subTaskVOS) {
        this.subTaskVOS = subTaskVOS;
    }

    public String getCron() {
        return cron;
    }

    public void setCron(String cron) {
        this.cron = cron;
    }

    public Long getIsPublishToProduce() {
        return isPublishToProduce;
    }

    public void setIsPublishToProduce(Long isPublishToProduce) {
        this.isPublishToProduce = isPublishToProduce;
    }

    public String getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Integer getVersionId() {
        return versionId;
    }

    public void setVersionId(Integer versionId) {
        this.versionId = versionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTaskType() {
        return taskType;
    }

    public void setTaskType(Integer taskType) {
        this.taskType = taskType;
    }

    public Integer getComputeType() {
        return computeType;
    }

    public void setComputeType(Integer computeType) {
        this.computeType = computeType;
    }

    public Integer getEngineType() {
        return engineType;
    }

    public void setEngineType(Integer engineType) {
        this.engineType = engineType;
    }

    public String getSqlText() {
        return sqlText;
    }

    public void setSqlText(String sqlText) {
        this.sqlText = sqlText;
    }

    public String getTaskParams() {
        return taskParams;
    }

    public void setTaskParams(String taskParams) {
        this.taskParams = taskParams;
    }

    public String getScheduleConf() {
        return scheduleConf;
    }

    public void setScheduleConf(String scheduleConf) {
        this.scheduleConf = scheduleConf;
    }

    public Integer getPeriodType() {
        return periodType;
    }

    public void setPeriodType(Integer periodType) {
        this.periodType = periodType;
    }

    public Integer getScheduleStatus() {
        return scheduleStatus;
    }

    public void setScheduleStatus(Integer scheduleStatus) {
        this.scheduleStatus = scheduleStatus;
    }

    public Integer getProjectScheduleStatus() {
        return projectScheduleStatus;
    }

    public void setProjectScheduleStatus(Integer projectScheduleStatus) {
        this.projectScheduleStatus = projectScheduleStatus;
    }

    public Integer getSubmitStatus() {
        return submitStatus;
    }

    public void setSubmitStatus(Integer submitStatus) {
        this.submitStatus = submitStatus;
    }

    public Long getModifyUserId() {
        return modifyUserId;
    }

    public void setModifyUserId(Long modifyUserId) {
        this.modifyUserId = modifyUserId;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Long getOwnerUserId() {
        return ownerUserId;
    }

    public void setOwnerUserId(Long ownerUserId) {
        this.ownerUserId = ownerUserId;
    }

    public Long getNodePid() {
        return nodePid;
    }

    public void setNodePid(Long nodePid) {
        this.nodePid = nodePid;
    }

    public String getTaskDesc() {
        return taskDesc;
    }

    public void setTaskDesc(String taskDesc) {
        this.taskDesc = taskDesc;
    }

    public String getMainClass() {
        return mainClass;
    }

    public void setMainClass(String mainClass) {
        this.mainClass = mainClass;
    }

    public String getExeArgs() {
        return exeArgs;
    }

    public void setExeArgs(String exeArgs) {
        this.exeArgs = exeArgs;
    }

    public Long getFlowId() {
        return flowId;
    }

    public void setFlowId(Long flowId) {
        this.flowId = flowId;
    }

    public Integer getAppType() {
        return appType;
    }

    public void setAppType(Integer appType) {
        this.appType = appType;
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Timestamp gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Timestamp getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Timestamp gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getEMPYT() {
        return EMPYT;
    }

    public void setEMPYT(String EMPYT) {
        this.EMPYT = EMPYT;
    }

    public String getComponentVersion() {
        return componentVersion;
    }

    public void setComponentVersion(String componentVersion) {
        this.componentVersion = componentVersion;
    }

    public List<BatchResourceResultVO> getResourceList() {
        return resourceList;
    }

    public void setResourceList(List<BatchResourceResultVO> resourceList) {
        this.resourceList = resourceList;
    }

    public List<BatchResourceResultVO> getRefResourceList() {
        return refResourceList;
    }

    public void setRefResourceList(List<BatchResourceResultVO> refResourceList) {
        this.refResourceList = refResourceList;
    }

    public List<BatchTaskVersionDetailResultVO> getTaskVersions() {
        return taskVersions;
    }

    public void setTaskVersions(List<BatchTaskVersionDetailResultVO> taskVersions) {
        this.taskVersions = taskVersions;
    }

    public Integer getParentReadWriteLockVersion() {
        return parentReadWriteLockVersion;
    }

    public void setParentReadWriteLockVersion(Integer parentReadWriteLockVersion) {
        this.parentReadWriteLockVersion = parentReadWriteLockVersion;
    }

    public ReadWriteLockResultVO getReadWriteLockVO() {
        return readWriteLockVO;
    }

    public void setReadWriteLockVO(ReadWriteLockResultVO readWriteLockVO) {
        this.readWriteLockVO = readWriteLockVO;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public BatchUserGetTaskByIdResultVO getCreateUser() {
        return createUser;
    }

    public void setCreateUser(BatchUserGetTaskByIdResultVO createUser) {
        this.createUser = createUser;
    }

    public BatchUserGetTaskByIdResultVO getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(BatchUserGetTaskByIdResultVO modifyUser) {
        this.modifyUser = modifyUser;
    }

    public BatchUserGetTaskByIdResultVO getOwnerUser() {
        return ownerUser;
    }

    public void setOwnerUser(BatchUserGetTaskByIdResultVO ownerUser) {
        this.ownerUser = ownerUser;
    }
}
