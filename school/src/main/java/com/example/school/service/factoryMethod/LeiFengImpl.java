package com.example.school.service.factoryMethod;

public class LeiFengImpl implements LeiFeng {

    @Override
    public void sweep() {
        System.out.println("扫地");
    }

    @Override
    public void wash() {
        System.out.println("洗衣服");
    }

    @Override
    public void buyRice() {
        System.out.println("买米");
    }
}
