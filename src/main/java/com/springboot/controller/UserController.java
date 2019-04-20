package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.domain.User;
import com.springboot.service.IUserService;

@RestController
public class UserController {

	@Autowired // @Resource也可以
	private IUserService userService;

	@RequestMapping("/save")
	public String save(String name) {

		userService.save(new User(name));
		return "saved sucess!!";
	}

	@RequestMapping("/get")
	public User get(Long id) {
		return userService.get(id);
	}
}
