package com.example.zxcpractice.repository.entity;

import lombok.*;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
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
}