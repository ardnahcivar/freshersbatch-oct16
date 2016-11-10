package com.ravi.rest.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.ravi.rest.entity.User;


public class createUserDaoImp implements createUserDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public User createUser(User user){
		hibernateTemplate.save(user);
		return user;
	}
}
	