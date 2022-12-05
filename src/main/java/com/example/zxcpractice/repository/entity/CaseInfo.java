package com.example.zxcpractice.repository.entity;

import lombok.*;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class CaseInfo {
    private Long id;

    private String caseName;

    private String apiId;

    private Byte environmentId;

    private Integer deleted;

    private String creatorName;

    private Date createTime;

    private String updatorName;

    private Date updateTime;
}