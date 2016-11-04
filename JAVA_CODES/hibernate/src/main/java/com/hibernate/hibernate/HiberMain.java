package com.hibernate.hibernate;


import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import java.io.File;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HiberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration();
		configuration.configure(new File("src/hibernate.cfg.xml"));
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
	/*	
	 * Done on #3rd November 
	 * Session session_1 = sessionFactory.openSession();
		Transaction trans = session_1.beginTransaction();
		Product pro = new Product("Play Station", 27999);
		session_1.save(pro);
		Product pro1 = new Product("Xbox", 30000);
		session_1.save(pro1);
		
		System.out.println(pro.getName());
		trans.commit();
		session_1.close();
		
		
		
		
		Session session_2 = sessionFactory.openSession();
		Transaction trans_2 = session_2.beginTransaction();
		Query query = session_2.createQuery("from Product");
		List<Product> results = query.list();
		
		for(Product p : results)
			System.out.println(p.getName()+"\n"+p.getPrice());
		trans_2.commit();
		
		
		
		
		Session session_3 = sessionFactory.openSession();
		Transaction trans_3 = session_3.beginTransaction();
		Query query2 = session_3.createQuery("from Product");
		Product pro2 = (Product)session_3.get(Product.class,pro1.getId());
		pro2.setName("DAbba");
		session_3.save(pro2);
		List<Product> res = query2.list();
		trans_3.commit();
		
		
		for(Product p : res )
				System.out.println(p.getName()+" "+p.getPrice());
		
		
		*/
		
		Session session_1 = sessionFactory.openSession();
		Product prod1 = new Product("Mobile",12000);
		Transaction trans1 = session_1.beginTransaction();
		//session_1.save(prod1);
	//	session_1.persist(prod1);
		trans1.commit();
		session_1.close();
		
	/*	Session session_2 = sessionFactory.openSession();
		SQLQuery sql = session_2.createSQLQuery("insert into product_master(p_id,name,cost)values(:pid,:name,:price)");
		sql.setParameter("pid", 12);
		sql.setParameter("name", "Samsung Curve ");
		sql.setParameter("price", 50000);
		Transaction trans2 = session_2.beginTransaction();
		sql.executeUpdate();
		trans2.commit();
		session_2.close();
	*/	
		
		
	/*	Session session_3 = sessionFactory.openSession();
		Employee e = new Employee("Jon", 450000, "Winterfell");
		Transaction trans3 = session_3.beginTransaction();
		//session_3.save(e);
		e = new Employee("Tryion", 100000, "Casterly Rock");
		//session_3.save(e);
		e = new Employee("Brandon", 4000, "Near the wall");
		//session_3.save(e);
		e = new Employee("Arya(No One)", 0, "No idea");
		session_3.save(e);
		e = new Employee("ashish", 400, "pune");
		session_3.save(e);
		e = new Employee("sagar", 1100, "pune");
		session_3.save(e);
		e = new Employee("kirti", 34000, "pune");
		session_3.save(e);
		trans3.commit();
		session_3.close();
		*/
		
	/*	Session session_4 = sessionFactory.openSession();
		Query query1 = session_4.createQuery("Select sum(salary) from Employee");
		Transaction trans4 = session_4.beginTransaction();
		List sum = query1.list();
		trans4.commit();
		session_4.close();
		System.out.println(sum);
		*/
		
		
		/*Session session_5 = sessionFactory.openSession();
		Query query2 = session_5.createQuery("from Employee E order by E.salary");
		Transaction trans5 = session_5.beginTransaction();
		List orderbySum = query2.list();
		trans5.commit();
		session_5.close();
		
		for(Object l : orderbySum)
			System.out.println(l);
		*/
		
		/*Session session_6 =sessionFactory.openSession();
		Transaction trans6 =session_6.beginTransaction();
		Criteria criteria = session_6.createCriteria(Employee.class);
		criteria.addOrder(Order.asc("salary"));
		List orderByCrit = criteria.list();
		trans6.commit();
		session_6.close();
		
		for(Object l : orderByCrit)
			System.out.println(l);
		*/
		
		
		Session session_7 = sessionFactory.openSession();
		Transaction trans7 = session_7.beginTransaction();
		Criteria criteria2 = session_7.createCriteria(Employee.class);
		ProjectionList projList = Projections.projectionList().add(Projections.property("city")).
				add(Projections.groupProperty("city"));
		
		/*projList.add(Projections.groupProperty("city"));
		criteria2.setProjection(Projections.property("name"));*/
		criteria2.setProjection(projList);
		
		
		//Query query3 =session_7.createQuery("from Employee as E group by E.city");
		List groupByCity = criteria2.list();
		trans7.commit();
		session_7.close();
		
		for(Object l : groupByCity)
			System.out.println(l);
		
		
	/*	Session session_8 = sessionFactory.openSession();
		Transaction trans8 = session_8.beginTransaction();
		Query query3 = session_8.createQuery("Select avg(salary) from Employee");
		List avgSal = query3.list();
		trans8.commit();
		session_8.close();
		
		System.out.println(avgSal);
		*/
		
		/*Session session_9 = sessionFactory.openSession();
		Transaction trans9 = session_9.beginTransaction();
		Criteria criteria3 = session_9.createCriteria(Employee.class);
		criteria3.add(Restrictions.gt("salary",5000.0));
		List gt = criteria3.list();
		trans9.commit();
		session_9.close();
		
		for(Object l : gt)
			System.out.println(l);
		
		
		*/
		
		/*
		Session session_10 = sessionFactory.openSession();
		Transaction trans10 = session_10.beginTransaction();
		Query query4 = session_10.getNamedQuery("Distinct Records");
		List namedQ = query4.list();
		trans10.commit();
		session_10.close();
		
		for(Object o : namedQ)
			System.out.println(o);
		*/
		
		sessionFactory.close();
		
		
		
		
		
	}

}
