package com.springboot.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.springboot.domain.User;

@Repository
public class UserDao {

	@Autowired
	private JdbcTemplate jdbc;

	public void save(User user) {
		jdbc.update("insert into t_user(name) values(?)", user.getName());
	}

	public User get(Long id) {

		RowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);
		return jdbc.queryForObject("select * from t_user where id=?", rowMapper, id);
	}

}
