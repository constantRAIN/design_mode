package com.example.school.service.factoryMethod;

public class VolunteerFactory implements IFactory{

    @Override
    public LeiFeng creatLeiFeng() {
        return new Volunteer();
    }
}
