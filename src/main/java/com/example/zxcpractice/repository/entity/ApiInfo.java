package com.example.zxcpractice.repository.entity;

import java.util.Date;

public class ApiInfo {
    private Long id;

    private String serviceLineName;

    private String serviceName;

    private String apiName;

    private String requestMethod;

    private String requestPath;

    private String apiPriority;

    private String apiManager;

    private String yapiUrl;

    private Integer deleted;

    private String creatorName;

    private Date createTime;

    private String updatorName;

    private Date updateTime;

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

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName == null ? null : apiName.trim();
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod == null ? null : requestMethod.trim();
    }

    public String getRequestPath() {
        return requestPath;
    }

    public void setRequestPath(String requestPath) {
        this.requestPath = requestPath == null ? null : requestPath.trim();
    }

    public String getApiPriority() {
        return apiPriority;
    }

    public void setApiPriority(String apiPriority) {
        this.apiPriority = apiPriority == null ? null : apiPriority.trim();
    }

    public String getApiManager() {
        return apiManager;
    }

    public void setApiManager(String apiManager) {
        this.apiManager = apiManager == null ? null : apiManager.trim();
    }

    public String getYapiUrl() {
        return yapiUrl;
    }

    public void setYapiUrl(String yapiUrl) {
        this.yapiUrl = yapiUrl == null ? null : yapiUrl.trim();
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
}