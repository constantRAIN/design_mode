package com.example.school.service.abstractFactory;

import com.example.school.service.abstractFactory.DTO.User;

public interface IUser {
    void Insert(User user);
     User GetUser(int id);
}
