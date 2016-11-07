package com.inheritance.perSub;

import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainSub {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure(new File("src/hibernate.cfg.xml"));
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Vehicle vehicle = new  Vehicle("Blue");
		Car car = new Car("Black", "Audi A6");
		Bike bike = new  Bike("White","Apache 200");
		Transaction transaction = session.beginTransaction();
		session.save(vehicle);
		session.save(car);
		session.save(bike);
		transaction.commit();
		session.close();
		sessionFactory.close();
		System.out.println("Data Saved");
	}

}
