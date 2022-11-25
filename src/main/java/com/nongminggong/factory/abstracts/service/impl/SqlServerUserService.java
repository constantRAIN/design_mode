package com.nongminggong.factory.abstracts.service.impl;

import com.nongminggong.factory.abstracts.dto.User;
import com.nongminggong.factory.abstracts.service.UserService;

/**
 * @author : zxliuyu
 * @date : 2022-11-25 21:43
 */
public class SqlServerUserService implements UserService {
	@Override
	public void insert(User user) {
		System.out.println("在sql server 执行插入用户成功");
	}

	@Override
	public User getUser() {
		System.out.println("在sql server 获取用户信息成功");
		return null;
	}
}
