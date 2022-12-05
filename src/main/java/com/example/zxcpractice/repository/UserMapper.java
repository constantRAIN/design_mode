package com.example.zxcpractice.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.zxcpractice.common.pojo.UserDAO;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<UserDAO> {
}

