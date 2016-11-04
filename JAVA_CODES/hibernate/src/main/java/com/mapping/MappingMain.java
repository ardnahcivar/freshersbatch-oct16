package com.mapping;

import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import net.sf.ehcache.hibernate.HibernateUtil;



public class MappingMain {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration();
		configuration.configure(new File("src/hibernate.cfg.xml"));
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		saveEnquiry(session);
		
		
		session.getTransaction().commit();
		session.close();
		
		sessionFactory.close();
		
	}
	*/
	
	public static void saveEnquiry(Session session){
		Customer customer = new Customer("ravi");
		Enquiry enquiry = new Enquiry("Banking",customer);
		session.persist(enquiry);
		System.out.println("Enquiry Saved");
	}
	public static void removeEnquiry(Session session)
	{
		
	}

}
