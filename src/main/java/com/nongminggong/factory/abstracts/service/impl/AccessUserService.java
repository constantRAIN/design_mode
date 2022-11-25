package com.nongminggong.factory.abstracts.service.impl;

import com.nongminggong.factory.abstracts.dto.User;
import com.nongminggong.factory.abstracts.service.UserService;

/**
 * @author : zxliuyu
 * @date : 2022-11-25 21:43
 */
public class AccessUserService implements UserService {
	@Override
	public void insert(User user) {
		System.out.println("在access 执行插入用户成功");
	}

	@Override
	public User getUser() {
		System.out.println("在access 获取用户信息成功");
		return null;
	}
}
