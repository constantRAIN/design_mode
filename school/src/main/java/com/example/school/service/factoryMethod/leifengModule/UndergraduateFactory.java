package com.example.school.service.factoryMethod.leifengModule;

public class UndergraduateFactory implements IFactory{

    @Override
    //使用Undergraduate 作为返回值，是因为该类只是继承了
    public LeiFeng creatLeiFeng() {
        return new Undergraduate();
    }
}
