package com.example.school.service.factory;


public class Women implements Person{
    @Override
    public void create() {
        System.out.println("创建女人");
    }
}
