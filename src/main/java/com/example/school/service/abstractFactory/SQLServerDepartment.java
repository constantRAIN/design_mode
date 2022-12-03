package com.example.school.service.abstractFactory;

import com.example.school.service.abstractFactory.DTO.Department;

public class SQLServerDepartment implements IDepartment{
    @Override
    public void Insert(Department department) {
        System.out.println("sqlSever表中增加department数据");
    }

    @Override
    public Department GetDepartment(int id) {
        System.out.println("sqlSever表，根据id得到表中的数据");
        return null;
    }

}
