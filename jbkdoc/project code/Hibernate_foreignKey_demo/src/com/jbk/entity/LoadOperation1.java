package com.jbk.entity;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LoadOperation1 {

	public static void main(String[] args) {
	
		Configuration cfg=new Configuration();
		cfg.configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Country.class);
		
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
		Query query=session.createQuery("from Employee");
		List<Employee> listemp=query.list();
		
		for(Employee emp:listemp)
		{
			System.out.print(emp.getName()+" ");
			System.out.print(emp.getPhoneno()+" ");
			System.out.print(emp.getDepartmentit()+" ");
			System.out.print(emp.getStatus()+" ");
			System.out.println("");
		}
		
		/*Employee emp=session.get(Employee.class, 1);
		System.out.println(emp.getName());
		System.out.println(emp.getPhoneno());
		System.out.println(emp.getDepartmentit());
		System.out.println(emp.getStatus());
		System.out.println(emp.getCountry().getCid());
		System.out.println(emp.getCountry().getCname());*/
		
//		Country country=session.get(Country.class, 1);
//		System.out.println(country.getCid());
//		System.out.println(country.getCname());
	}
}
