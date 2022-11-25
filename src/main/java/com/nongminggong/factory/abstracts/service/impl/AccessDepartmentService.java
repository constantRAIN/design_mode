package com.nongminggong.factory.abstracts.service.impl;

import com.nongminggong.factory.abstracts.dto.Department;
import com.nongminggong.factory.abstracts.dto.User;
import com.nongminggong.factory.abstracts.service.DepartmentService;
import com.nongminggong.factory.abstracts.service.UserService;

/**
 * @author : zxliuyu
 * @date : 2022-11-25 21:43
 */
public class AccessDepartmentService implements DepartmentService {
	@Override
	public void insert(Department department) {
		System.out.println("在access 执行插入员工成功");
	}

	@Override
	public Department getDepartment() {
		System.out.println("在Access 获取员工信息成功");
		return null;
	}
}
