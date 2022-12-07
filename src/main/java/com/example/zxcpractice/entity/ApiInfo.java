package com.example.zxcpractice.entity;

import lombok.*;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
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
}