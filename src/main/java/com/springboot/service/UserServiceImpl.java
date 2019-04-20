package com.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.UserDao;
import com.springboot.domain.User;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired // @Resource也可以
	private UserDao userdao;

	@Override
	public void save(User user) {
		userdao.save(user);
	}

	@Override
	public User get(Long id) {
		return userdao.get(id);
	}

}
