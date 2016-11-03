package com.hibernate.hibernate;


import org.hibernate.cfg.Configuration;

import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HiberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration();
		configuration.configure(new File("src/hibernate.cfg.xml"));
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		Session session_1 = sessionFactory.openSession();
		Product pro = new Product("Play Station", 27999);
		session_1.save(pro);
		System.out.println(pro.getName());
		

	}

}
