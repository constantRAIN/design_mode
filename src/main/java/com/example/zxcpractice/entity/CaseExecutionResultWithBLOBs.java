package com.example.zxcpractice.entity;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CaseExecutionResultWithBLOBs extends CaseExecutionResult {
    private String requestParameter;

    private String interfaceResponse;

    private String validationRules;

    private String validateResult;
}