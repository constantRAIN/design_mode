package com.nongminggong.factory.abstracts;

import com.nongminggong.factory.abstracts.dto.Department;
import com.nongminggong.factory.abstracts.dto.User;
import com.nongminggong.factory.abstracts.impl.AccessFactory;
import com.nongminggong.factory.abstracts.impl.SqlServerFactory;
import com.nongminggong.factory.abstracts.service.DepartmentService;
import com.nongminggong.factory.abstracts.service.UserService;

/**
 * @author : zxliuyu
 * @date : 2022-11-25 21:50
 */
public class OperationClient {
	public static void main(String[] args) {
		AbstractFactory sqlServerFactory = new SqlServerFactory();
		UserService sqlServerUser = sqlServerFactory.createUser();
		sqlServerUser.insert(new User());
		sqlServerUser.getUser();

		DepartmentService sqlServerDepartment = sqlServerFactory.createDepartment();
		sqlServerDepartment.insert(new Department());
		sqlServerDepartment.getDepartment();

		AbstractFactory accessFactory = new AccessFactory();
		UserService accessUser = accessFactory.createUser();
		accessUser.insert(new User());
		accessUser.getUser();

		DepartmentService accessDepartment = accessFactory.createDepartment();
		accessDepartment.insert(new Department());
		accessDepartment.getDepartment();
	}
}
