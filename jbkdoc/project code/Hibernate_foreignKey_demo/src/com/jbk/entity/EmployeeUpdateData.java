package com.jbk.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeUpdateData {

	public static void main(String[] args) {

		Configuration cfg=new Configuration();
		cfg.configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Country.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		
		Employee emp=session.get(Employee.class, 4);
		emp.setStatus("inactive");
		session.update(emp);
		tx.commit();
		System.out.println("Employee Updated Successfully");
	}
}
