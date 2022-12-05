package com.example.zxcpractice.repository.entity;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class CaseInfoWithBLOBs extends CaseInfo {
    private String precondition;

    private String headers;

    private String requestParameter;

    private String validationRules;
}