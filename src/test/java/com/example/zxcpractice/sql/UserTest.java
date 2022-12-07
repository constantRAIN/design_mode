package com.example.zxcpractice.sql;

import com.example.zxcpractice.common.pojo.UserDAO;
import com.example.zxcpractice.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class UserTest {
    @Resource
    private UserMapper userMapper;
    @Test
    public void ceshi(){
        for (UserDAO userDAO : userMapper.selectList(null)) {
            System.out.println(userDAO.toString());
        }
    }
}

