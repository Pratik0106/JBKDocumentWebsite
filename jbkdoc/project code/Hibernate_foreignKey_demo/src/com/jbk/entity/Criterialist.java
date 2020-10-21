package com.jbk.entity;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Criterialist {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Country.class);
	
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		
		Criteria criteria=session.createCriteria(Employee.class);
		List<Employee>listemp=criteria.list();
		
		System.out.println("Employee Details");
		for(Employee emp:listemp)
		{
			System.out.print(emp.getName()+" ");
			System.out.print(emp.getPhoneno()+" ");
			System.out.print(emp.getDepartmentit()+" ");
			System.out.print(emp.getStatus()+" ");
			System.out.println(" ");
		}
		
		
	}
}
