package com.example.school.service.build;

public class HouseClient {
    public static void main(String[] args) {
        CommonHouseBuilder commonHouseBuilder = new CommonHouseBuilder();
        commonHouseBuilder.buildHouse().setBase("地基");
        commonHouseBuilder.buildHouse().setWall("墙体");
        commonHouseBuilder.buildHouse().setRoofed("封顶");
        House commonHouse=new HouseDerector(commonHouseBuilder).constructHouse();
        System.out.println(commonHouse);

        HighHouseBuilder highHouseBuilder = new HighHouseBuilder();
        House highHouse=new HouseDerector(highHouseBuilder).constructHouse();

    }
}

