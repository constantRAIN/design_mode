package com.nongminggong.factory.abstracts.service;

import com.nongminggong.factory.abstracts.dto.User;

public interface UserService {
	void insert(User user);
	User getUser();
}
