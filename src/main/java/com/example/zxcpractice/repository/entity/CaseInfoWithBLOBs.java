package com.example.zxcpractice.repository.entity;

public class CaseInfoWithBLOBs extends CaseInfo {
    private String precondition;

    private String headers;

    private String requestParameter;

    private String validationRules;

    public String getPrecondition() {
        return precondition;
    }

    public void setPrecondition(String precondition) {
        this.precondition = precondition == null ? null : precondition.trim();
    }

    public String getHeaders() {
        return headers;
    }

    public void setHeaders(String headers) {
        this.headers = headers == null ? null : headers.trim();
    }

    public String getRequestParameter() {
        return requestParameter;
    }

    public void setRequestParameter(String requestParameter) {
        this.requestParameter = requestParameter == null ? null : requestParameter.trim();
    }

    public String getValidationRules() {
        return validationRules;
    }

    public void setValidationRules(String validationRules) {
        this.validationRules = validationRules == null ? null : validationRules.trim();
    }
}