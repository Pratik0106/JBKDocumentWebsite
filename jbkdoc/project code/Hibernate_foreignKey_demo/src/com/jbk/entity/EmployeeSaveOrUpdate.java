package com.jbk.entity;

import java.util.Date;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeSaveOrUpdate {
	public static void main(String[] args) {
	
		Configuration cfg=new Configuration();
		cfg.configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Country.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		
		Country country=session.get(Country.class, 3);
		System.out.println(country.getCid());
		System.out.println(country.getCname());
		
		
		Employee emp=new Employee();
		emp.setId(3);
		emp.setName("Akash");
		emp.setPhoneno("888888");
		emp.setDepartmentit("Marketing");
		emp.setStatus("active");
		Date date=new Date();
		emp.setCreateddtm(date);
		emp.setCreatedby("Kiran Sir");
		emp.setUpdateddtm(date);
		emp.setUpdatedby("Kiran Sir");
		emp.setCountry(country);
		
		session.saveOrUpdate(emp);
		transaction.commit();
		System.out.println("Employee Updated Successfully!");
		
	}
}
