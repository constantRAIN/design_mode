package com.example.zxcpractice.common.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("zzz_user")
public class UserDAO {
    @TableId(value = "user_name",type = IdType.AUTO)
    private String userName;
    @TableField("sex")
    private String sex;
    @TableField("age")
    private int age;
    @TableField("city")
    private String city;
}

