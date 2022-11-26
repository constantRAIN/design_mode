package com.example.school.service.sql.sqlUser;

import com.example.school.bean.User;
import com.example.school.service.sql.IUser;

public class IUserImpl implements IUser {
    @Override
    public void Insert(User user) {
        System.out.println("插入数据");
//        Console.WriteLine("插入数据");
    }

    @Override
    public User GetUser(int id) {
        System.out.println("查询数据");
//        Console.writeLine("查询数据");
        return null;
    }


}
