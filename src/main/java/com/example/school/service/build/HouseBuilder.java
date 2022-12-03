package com.example.school.service.build;

//抽象的建造者
public abstract class HouseBuilder {
    protected House house=new House();
    //将建造的流程写好，抽象的方法
    public abstract void buildBasic();
    public abstract void buildWall();
    public abstract void roofed();

    //建造
    // TODO: 2022/12/1   为啥在这  能对house类中的值进行get、set呢
    public House buildHouse(){
        house.getBase();
        return house;
    }
}

