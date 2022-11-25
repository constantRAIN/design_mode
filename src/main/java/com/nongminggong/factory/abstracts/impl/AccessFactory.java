package com.nongminggong.factory.abstracts.impl;

import com.nongminggong.factory.abstracts.AbstractFactory;
import com.nongminggong.factory.abstracts.service.DepartmentService;
import com.nongminggong.factory.abstracts.service.UserService;
import com.nongminggong.factory.abstracts.service.impl.AccessDepartmentService;
import com.nongminggong.factory.abstracts.service.impl.AccessUserService;

/**
 * @author : zxliuyu
 * @date : 2022-11-25 21:41
 */
public class AccessFactory implements AbstractFactory {
	@Override
	public UserService createUser() {
		return new AccessUserService();
	}

	@Override
	public DepartmentService createDepartment() {
		return new AccessDepartmentService();

	}
}
