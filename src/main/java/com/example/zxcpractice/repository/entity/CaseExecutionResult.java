package com.example.zxcpractice.repository.entity;

import java.util.Date;

public class CaseExecutionResult {
    private Long id;

    private String caseId;

    private String caseName;

    private String serviceLineName;

    private String serviceName;

    private String apiName;

    private String executionId;

    private Byte environmentType;

    private Date caseStarttime;

    private Long caseDuration;

    private Date caseEndtime;

    private Integer resultStatus;

    private Date createTime;

    private Date updateTime;

    private String buildUser;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId == null ? null : caseId.trim();
    }

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName == null ? null : caseName.trim();
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

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName == null ? null : apiName.trim();
    }

    public String getExecutionId() {
        return executionId;
    }

    public void setExecutionId(String executionId) {
        this.executionId = executionId == null ? null : executionId.trim();
    }

    public Byte getEnvironmentType() {
        return environmentType;
    }

    public void setEnvironmentType(Byte environmentType) {
        this.environmentType = environmentType;
    }

    public Date getCaseStarttime() {
        return caseStarttime;
    }

    public void setCaseStarttime(Date caseStarttime) {
        this.caseStarttime = caseStarttime;
    }

    public Long getCaseDuration() {
        return caseDuration;
    }

    public void setCaseDuration(Long caseDuration) {
        this.caseDuration = caseDuration;
    }

    public Date getCaseEndtime() {
        return caseEndtime;
    }

    public void setCaseEndtime(Date caseEndtime) {
        this.caseEndtime = caseEndtime;
    }

    public Integer getResultStatus() {
        return resultStatus;
    }

    public void setResultStatus(Integer resultStatus) {
        this.resultStatus = resultStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getBuildUser() {
        return buildUser;
    }

    public void setBuildUser(String buildUser) {
        this.buildUser = buildUser == null ? null : buildUser.trim();
    }
}