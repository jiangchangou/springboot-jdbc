package com.springboot.service;

import com.springboot.domain.User;

public interface IUserService {

	void save(User user);

	User get(Long id);
}
