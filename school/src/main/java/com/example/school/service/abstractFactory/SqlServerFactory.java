package com.example.school.service.abstractFactory;

public class SqlServerFactory implements IFactory{

    @Override
    public IUser CreatUser() {
        return new SqlserverUserImpl();
    }

    @Override
    public IDepartment creatDepartment() {

        return new SQLServerDepartment();
    }
}
