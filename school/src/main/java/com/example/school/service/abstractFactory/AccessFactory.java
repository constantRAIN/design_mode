package com.example.school.service.abstractFactory;

public class AccessFactory implements IFactory {

    @Override
    public IUser CreatUser() {
        return null;
    }

    @Override
    public IDepartment creatDepartment() {
        return new AccessDepartment();
    }
}
