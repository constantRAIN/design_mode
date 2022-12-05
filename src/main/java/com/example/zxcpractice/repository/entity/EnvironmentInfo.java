package com.example.zxcpractice.repository.entity;

import lombok.*;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class EnvironmentInfo {
    private Long id;

    private String serviceLineName;

    private String serviceName;

    private Byte environmentType;

    private String domainName;

    private Integer deleted;

    private String creatorName;

    private Date createTime;

    private String updatorName;

    private Date updateTime;
}