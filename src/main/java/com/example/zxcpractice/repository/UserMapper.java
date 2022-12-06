package com.example.zxcpractice.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.zxcpractice.common.pojo.UserDAO;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface UserMapper extends BaseMapper<UserDAO> {
}

