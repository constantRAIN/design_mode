package com.nongminggong.factory.abstracts.impl;

import com.nongminggong.factory.abstracts.AbstractFactory;
import com.nongminggong.factory.abstracts.service.DepartmentService;
import com.nongminggong.factory.abstracts.service.UserService;
import com.nongminggong.factory.abstracts.service.impl.SqlServerDepartmentService;
import com.nongminggong.factory.abstracts.service.impl.SqlServerUserService;

/**
 * @author : zxliuyu
 * @date : 2022-11-25 21:41
 */
public class SqlServerFactory implements AbstractFactory {
	@Override
	public UserService createUser() {
		return new SqlServerUserService();
	}

	@Override
	public DepartmentService createDepartment() {
		return new SqlServerDepartmentService();
	}
}
