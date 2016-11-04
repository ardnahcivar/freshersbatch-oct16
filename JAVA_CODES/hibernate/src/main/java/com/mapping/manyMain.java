package com.mapping;

import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class manyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration();
		configuration.configure(new File("src/hibernate.cfg.xml"));
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session1 = sessionFactory.openSession();
		session1.beginTransaction();
		Market market = new Market();
		market.setCollaborators("Good");
		
		Stock stock = new Stock();
		stock.setNameOfStock("TATA");
		stock.setMarket(market);

		Stock stock1 = new Stock();
		stock1.setNameOfStock("INFY");
		stock1.setMarket(market);
		
		
		session1.persist(market);
		
		
		session1.getTransaction().commit();
		session1.close();
		sessionFactory.close();
		
	
	}
	
	

}
