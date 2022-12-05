package com.example.zxcpractice.repository.entity;

import java.util.Date;

public class TaskInfo {
    private Long id;

    private String serviceLineName;

    private String serviceName;

    private String taskName;

    private String taskId;

    private Byte environmentType;

    private String caseNumbers;

    private String interfaceNumbers;

    private Integer deleted;

    private String creatorName;

    private Date createTime;

    private String updatorName;

    private Date updateTime;

    private String caseIdList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServiceLineName() {
        return serviceLineName;
    }

    public void setServiceLineName(String serviceLineName) {
        this.serviceLineName = serviceLineName == null ? null : serviceLineName.trim();
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName == null ? null : serviceName.trim();
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName == null ? null : taskName.trim();
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }

    public Byte getEnvironmentType() {
        return environmentType;
    }

    public void setEnvironmentType(Byte environmentType) {
        this.environmentType = environmentType;
    }

    public String getCaseNumbers() {
        return caseNumbers;
    }

    public void setCaseNumbers(String caseNumbers) {
        this.caseNumbers = caseNumbers == null ? null : caseNumbers.trim();
    }

    public String getInterfaceNumbers() {
        return interfaceNumbers;
    }

    public void setInterfaceNumbers(String interfaceNumbers) {
        this.interfaceNumbers = interfaceNumbers == null ? null : interfaceNumbers.trim();
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName == null ? null : creatorName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdatorName() {
        return updatorName;
    }

    public void setUpdatorName(String updatorName) {
        this.updatorName = updatorName == null ? null : updatorName.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCaseIdList() {
        return caseIdList;
    }

    public void setCaseIdList(String caseIdList) {
        this.caseIdList = caseIdList == null ? null : caseIdList.trim();
    }
}