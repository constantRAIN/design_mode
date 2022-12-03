package com.example.school.service.build;

public class HighHouseBuilder extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("highhouse buildbasic");
    }

    @Override
    public void buildWall() {
        System.out.println("high buildwall");
    }

    @Override
    public void roofed() {
        System.out.println("high roofed");
    }
}
