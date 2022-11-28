package com.example.school.service.abstractFactory;


public class SqlserverUserImpl implements SqlserverUser {
    public void Insert(User user){
        System.out.println("插入数据");
    }
    public User GetUser(int id){
        System.out.println("查询数据");
        return null;
    }
}
