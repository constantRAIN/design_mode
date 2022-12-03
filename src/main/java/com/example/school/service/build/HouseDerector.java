package com.example.school.service.build;

//指挥者 指定制作流程 返回产品
public class HouseDerector {
    HouseBuilder houseBuilder;
    //构造器传入housebuilder
    public HouseDerector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
    //setter 传入housebuilder
    public void setHouseBuilder(HouseBuilder houseBuilder){
        this.houseBuilder=houseBuilder;
    }
    //如何处理建造房子的流程，交给指挥者
    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWall();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}

