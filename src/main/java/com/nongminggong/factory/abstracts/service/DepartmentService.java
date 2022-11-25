package com.nongminggong.factory.abstracts.service;

import com.nongminggong.factory.abstracts.dto.Department;

public interface DepartmentService {
	void insert(Department department);
	Department getDepartment();
}
