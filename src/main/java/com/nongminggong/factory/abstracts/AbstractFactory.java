package com.nongminggong.factory.abstracts;

import com.nongminggong.factory.abstracts.service.DepartmentService;
import com.nongminggong.factory.abstracts.service.UserService;

public interface AbstractFactory {
	UserService createUser();
	DepartmentService createDepartment();
}
