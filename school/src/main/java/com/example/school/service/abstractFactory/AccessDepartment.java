package com.example.school.service.abstractFactory;

import com.example.school.service.abstractFactory.DTO.Department;

public class AccessDepartment implements IDepartment{
    @Override
    public void Insert(Department department) {
        System.out.println("access表中插入数据");
    }

    @Override
    public Department GetDepartment(int id) {
        System.out.println("access表中根据id获取数据");
        return null;
    }
}
