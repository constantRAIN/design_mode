package com.example.zxcpractice.common.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author xuce.zhang
 * @date 2022/12/6
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Accessors(chain = true)
//@ColumnWidth(15)   @ColumnWidth：用于设置表格列的宽度；
public class ApiInfoListVO {
    private Long apiId;
}
