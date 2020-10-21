package com.jbk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.SpringDao;
import com.jbk.entity.Admin;
import com.jbk.entity.Student;
import com.jbk.entity.Subject;


@Service
public class SpringService {

	@Autowired
	SpringDao springdao;
	
	public boolean checkLogin(Admin admin) {
		boolean result=springdao.checkLogin(admin);
		return result;
		
		
	}

	public boolean deleteUser(int userid) {
		System.out.println("DeleteUserMethod()------Service");
	      boolean result=springdao.deleteUser(userid);
		return result;
	}

	public List<Student> loadUser() {
		List<Student> listuser=springdao.loadUser();
		return listuser;
	}

	public boolean saveUser(Student student) {
		boolean result=springdao.saveUser(student);
		return result;
	}
	
	public List<Subject> listSubject()
	{
		List<Subject> listsubject=springdao.listSubject();
		return listsubject;
	}

	public List<Student> ShowEditRecord(int stud_id) {
		List<Student> liststudent=springdao.ShowEditRecord(stud_id);
		return liststudent;
	}

	public boolean UpdateStudent(Student student) {
		boolean result=springdao.UpdateStudent(student);
		return result;
	}

	public boolean MakeStudentSuspend(Student student) {
		boolean result=springdao.MakeStudentSuspend(student);
		return result;
	}

	public boolean deletestudentbycheckbox(int[] sid) {
		boolean result=springdao.deletestudentbycheckbox(sid);
		return result;
	}

	public boolean suspendStudnetbycheckbox(int[] sid) {
		boolean result=springdao.suspendStudnetbycheckbox(sid);
		return result;
	}

}
