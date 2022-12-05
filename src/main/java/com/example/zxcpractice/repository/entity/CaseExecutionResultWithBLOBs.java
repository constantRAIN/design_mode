package com.example.zxcpractice.repository.entity;

public class CaseExecutionResultWithBLOBs extends CaseExecutionResult {
    private String requestParameter;

    private String interfaceResponse;

    private String validationRules;

    private String validateResult;

    public String getRequestParameter() {
        return requestParameter;
    }

    public void setRequestParameter(String requestParameter) {
        this.requestParameter = requestParameter == null ? null : requestParameter.trim();
    }

    public String getInterfaceResponse() {
        return interfaceResponse;
    }

    public void setInterfaceResponse(String interfaceResponse) {
        this.interfaceResponse = interfaceResponse == null ? null : interfaceResponse.trim();
    }

    public String getValidationRules() {
        return validationRules;
    }

    public void setValidationRules(String validationRules) {
        this.validationRules = validationRules == null ? null : validationRules.trim();
    }

    public String getValidateResult() {
        return validateResult;
    }

    public void setValidateResult(String validateResult) {
        this.validateResult = validateResult == null ? null : validateResult.trim();
    }
}