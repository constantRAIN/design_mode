package com.example.school.service.factoryMethod.leifengModule;

public class VolunteerFactory implements IFactory{

    @Override
    public LeiFeng creatLeiFeng() {
        return new Volunteer();
    }
}
