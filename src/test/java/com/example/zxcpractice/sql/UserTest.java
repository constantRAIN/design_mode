package com.example.zxcpractice.sql;

import com.example.zxcpractice.common.pojo.UserDAO;
import com.example.zxcpractice.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void ceshi(){
        for (UserDAO userDAO : userMapper.selectList(null)) {
            System.out.println(userDAO.toString());
        }
    }
}

