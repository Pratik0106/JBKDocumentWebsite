package com.jbk.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.entity.Admin;
import com.jbk.entity.Student;
import com.jbk.entity.Subject;


@Repository
public class SpringDao {
	
	@Autowired
	SessionFactory sessionfactory;

	public Boolean checkLogin(Admin admin) {
		System.out.println(admin.getUsername());
		System.out.println(admin.getPassword());
		
		String username=admin.getUsername();
		String password=admin.getPassword();
		
		Session session=sessionfactory.openSession();
		Criteria criteria=session.createCriteria(Admin.class);
		criteria.add(Restrictions.eq("username", username));
		criteria.add(Restrictions.eq("password", password));
		
		List<Admin> listuser=criteria.list();
		if(!listuser.isEmpty())
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

	public boolean deleteUser(int userid) {
		System.out.println("DeleteUserMethod()-----Dao");
		System.out.println("User id:-"+userid);
		
		Session session=sessionfactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Criteria criteria=session.createCriteria(Student.class);
		List<Student> liststudent=criteria.list(); //1
		int flag=1;
		for(Student student:liststudent)
		{//1,2
			//2 delete userid=2
			if(student.getSid()==userid)
			{
				session.delete(student);
				transaction.commit();
				flag=0;
				System.out.println("flag"+flag);
			}
			
		}
		//Student student=session.get(Student.class, userid);
		
		if(flag==1)
		{
			return false;
		}
		else
		{
			return true;
		}
		
		
		
	}

	public List<Student> loadUser() {
		System.out.println("load user method");
		Session session=sessionfactory.openSession();
		List<Student> listuser=session.createCriteria(Student.class).list();
		if(!listuser.isEmpty())
		{
			return listuser;
		}
		else
		{
			return null;
		}
		
	}

	public boolean saveUser(Student student) {
		
		Session session=sessionfactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(student);
		
		transaction.commit();
		
		
		return true;
	}

	public List<Subject> listSubject()
	{
		Session session=sessionfactory.openSession();
		Criteria criteria=session.createCriteria(Subject.class);
		List<Subject> subjectlist=criteria.list();
		return subjectlist;
	}

	public List<Student> ShowEditRecord(int stud_id) {
		Session session=sessionfactory.openSession();
		
		Criteria criteria=session.createCriteria(Student.class);
		
		criteria.add(Restrictions.eq("sid", stud_id));
		List<Student> studentlist=criteria.list();
		return studentlist;
	}

	public boolean UpdateStudent(Student student) {
		Session session=sessionfactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.saveOrUpdate(student);
		transaction.commit();
	
		
		return true;
	}

	public boolean MakeStudentSuspend(Student student) {
		String status="suspend";
		
		Session session=sessionfactory.openSession();
		Transaction transaction=session.beginTransaction();
		Query query=session.createQuery("update Student set status=:status where sid=:sid");
	
		query.setParameter("status", status);
		query.setParameter("sid",student.getSid());
		int i=query.executeUpdate();
		transaction.commit();
		if(i>0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

	public boolean deletestudentbycheckbox(int[] sid) {
			System.out.println(1);
		Session session=sessionfactory.openSession();
		Transaction transaction=session.beginTransaction();
		System.out.println(2);
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<sid.length;i++)
		{
			list.add(sid[i]);
		System.out.println(sid[i]);
		}
		System.out.println(list);
		Query query = session.createQuery("DELETE Student stud WHERE sid IN (:sid)");
		System.out.println(3);
		//query.setParameter("sid", sid);
		
		query.setParameterList("sid", list);
		//query.setParameterList("sid", sid);
		
		query.executeUpdate();
		System.out.println(4);
		 transaction.commit();
			System.out.println(5);
		 	System.out.println(6);
			 return true;
		
		
		
	}

	public boolean suspendStudnetbycheckbox(int[] sid) {
		System.out.println(1);
		Session session=sessionfactory.openSession();
		Transaction transaction=session.beginTransaction();
		System.out.println(2);
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<sid.length;i++)
		{
			list.add(sid[i]);
		System.out.println(sid[i]);
		}
		String status="suspend";
		System.out.println(list);
		Query query = session.createQuery("UPDATE Student SET status=:status WHERE sid IN (:sid)");
		System.out.println(3);
		//query.setParameter("sid", sid);
		query.setParameter("status", status);
		query.setParameterList("sid", list);
		//query.setParameterList("sid", sid);
		
		query.executeUpdate();
		System.out.println(4);
		 transaction.commit();
			System.out.println(5);
		 	System.out.println(6);
			 return true;
		
	}
	
}
