package com.example.school.service.build;

public class CommonHouseBuilder extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("common buildbasic");
    }

    @Override
    public void buildWall() {
        System.out.println("common buildwall");
    }

    @Override
    public void roofed() {
        System.out.println("common roofed");
    }
}
