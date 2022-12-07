package com.example.zxcpractice.entity;

import lombok.*;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
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
}