package com.example.school.service.factory;

public class Man implements Person{

    @Override
    public void create() {
        System.out.println("创建男人");
    }
}
