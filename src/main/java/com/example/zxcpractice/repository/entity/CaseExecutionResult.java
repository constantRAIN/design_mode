package com.example.zxcpractice.repository.entity;

import lombok.*;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
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
}