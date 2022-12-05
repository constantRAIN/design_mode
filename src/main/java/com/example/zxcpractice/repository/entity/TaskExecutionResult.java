package com.example.zxcpractice.repository.entity;

import java.util.Date;

public class TaskExecutionResult {
    private Long id;

    private String taskName;

    private String taskId;

    private String executionId;

    private Byte environmentType;

    private Integer executionStatus;

    private Date startTime;

    private Date finishTime;

    private Date executionDuration;

    private Integer casesPasscount;

    private Integer casesFailcount;

    private Integer casesSkippedcount;

    private Integer casesSumcount;

    private String reportUrl;

    private String buildUser;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Integer getExecutionStatus() {
        return executionStatus;
    }

    public void setExecutionStatus(Integer executionStatus) {
        this.executionStatus = executionStatus;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public Date getExecutionDuration() {
        return executionDuration;
    }

    public void setExecutionDuration(Date executionDuration) {
        this.executionDuration = executionDuration;
    }

    public Integer getCasesPasscount() {
        return casesPasscount;
    }

    public void setCasesPasscount(Integer casesPasscount) {
        this.casesPasscount = casesPasscount;
    }

    public Integer getCasesFailcount() {
        return casesFailcount;
    }

    public void setCasesFailcount(Integer casesFailcount) {
        this.casesFailcount = casesFailcount;
    }

    public Integer getCasesSkippedcount() {
        return casesSkippedcount;
    }

    public void setCasesSkippedcount(Integer casesSkippedcount) {
        this.casesSkippedcount = casesSkippedcount;
    }

    public Integer getCasesSumcount() {
        return casesSumcount;
    }

    public void setCasesSumcount(Integer casesSumcount) {
        this.casesSumcount = casesSumcount;
    }

    public String getReportUrl() {
        return reportUrl;
    }

    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl == null ? null : reportUrl.trim();
    }

    public String getBuildUser() {
        return buildUser;
    }

    public void setBuildUser(String buildUser) {
        this.buildUser = buildUser == null ? null : buildUser.trim();
    }
}