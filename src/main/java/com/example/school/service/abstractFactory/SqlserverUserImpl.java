package com.example.school.service.abstractFactory;


import com.example.school.service.abstractFactory.DTO.User;

public class SqlserverUserImpl implements IUser {
    public void Insert(User user){
        System.out.println("在sql server插入数据");
    }
    public User GetUser(int id){
        System.out.println("在sql server查询数据");
        return null;
    }
}
