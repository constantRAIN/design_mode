package com.example.school.service.sql;

import com.example.school.bean.User;

public interface IUser {
    void Insert(User user);
    User GetUser(int id);
}
