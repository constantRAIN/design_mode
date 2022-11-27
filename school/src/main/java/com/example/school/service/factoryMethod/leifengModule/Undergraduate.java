package com.example.school.service.factoryMethod.leifengModule;

public class Undergraduate extends LeiFeng {
    public void action(){
        LeiFeng leiFeng = new LeiFeng();
        leiFeng.buyRice();
        leiFeng.sweep();
    }
}
