package com.dtstack.taier.dao.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.sql.Timestamp;
import java.util.Objects;

/**
 * Reason:
 * Date: 2017/5/20
 * Company: www.dtstack.com
 *
 * @ahthor xuchao
 */
@TableName("schedule_job_graph_trigger")
public class JobGraphTrigger {
    
    /**
     * 唯一标识
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    
    /**
     * 触发创建jobGraph的时间
     */
    private Timestamp triggerTime;
    
    /**
     * 0:正常调度 1补数据
     */
    private Integer triggerType;
    
    /**
     * 创建时间
     */
    private Timestamp gmtCreate;
    
    /**
     * 修改时间
     */
    private Timestamp gmtModified;
    
    /**
     * 是否逻辑删除
     */
    private Integer isDeleted;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Timestamp getTriggerTime() {
        return triggerTime;
    }
    
    public void setTriggerTime(Timestamp triggerTime) {
        this.triggerTime = triggerTime;
    }
    
    public Integer getTriggerType() {
        return triggerType;
    }
    
    public void setTriggerType(Integer triggerType) {
        this.triggerType = triggerType;
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
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobGraphTrigger that = (JobGraphTrigger) o;
        return Objects.equals(id, that.id) && Objects.equals(triggerTime, that.triggerTime) && Objects.equals(triggerType, that.triggerType) && Objects.equals(gmtCreate, that.gmtCreate) && Objects.equals(gmtModified, that.gmtModified) && Objects.equals(isDeleted, that.isDeleted);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id, triggerTime, triggerType, gmtCreate, gmtModified, isDeleted);
    }
    
    @Override
    public String toString() {
        return "JobGraphTrigger{" +
                "id=" + id +
                ", triggerTime=" + triggerTime +
                ", triggerType=" + triggerType +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
