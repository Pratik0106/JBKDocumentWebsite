package com.jbk.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDeleteOperation {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Country.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		
		Employee emp=session.get(Employee.class, 4);
		
		session.delete(emp);
		tx.commit();
		System.out.println("Employee Deleted Successfully");
	}
}
