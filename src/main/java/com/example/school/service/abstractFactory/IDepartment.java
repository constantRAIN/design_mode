package com.example.school.service.abstractFactory;

import com.example.school.service.abstractFactory.DTO.Department;

public interface IDepartment {
    void Insert(Department department);

    Department GetDepartment(int id);
}
