package com.ravi.rest.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.ravi.rest.dao.createUserDaoImp;
import com.ravi.rest.entity.User;

public class createUserservice implements createUserInterface{
	
	@Autowired
	private createUserDaoImp createUserDaoImp;
	
	public User createUser(User user){
		
		return createUserDaoImp.createUser(user);
	}
}
