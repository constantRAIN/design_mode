package com.example.school.service.factoryMethod;

public class Undergraduate extends LeiFengImpl {
    public void action(){
        LeiFeng leiFeng = new LeiFengImpl();
        leiFeng.buyRice();
        leiFeng.sweep();
    }
}
