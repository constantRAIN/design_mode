package com.example.school.service.factoryMethod;

public class Volunteer extends LeiFengImpl {
    public void action(){
        LeiFeng leiFeng = new LeiFengImpl();
        leiFeng.buyRice();
        leiFeng.sweep();
    }
}
