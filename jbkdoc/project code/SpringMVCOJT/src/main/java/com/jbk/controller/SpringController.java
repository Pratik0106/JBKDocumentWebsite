package com.jbk.controller;

import java.util.List;

import javax.jws.WebParam.Mode;

import org.hibernate.stat.spi.StatisticsImplementor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jbk.entity.Admin;
import com.jbk.entity.Student;
import com.jbk.entity.Subject;
import com.jbk.service.SpringService;

@Controller
public class SpringController {

	@Autowired
	SpringService springservice;
	
	/*
	@RequestMapping("/loginpage")
	public String openIndexPage()
	{
		return "loginpg"; 
	}
	
	@RequestMapping("/login")
	public ModelAndView checkLogin(@ModelAttribute Admin admin)
	{
		ModelAndView mv=new ModelAndView();
		System.out.println(admin.getUsername());
		System.out.println(admin.getPassword());
		boolean result=springservice.checkLogin(admin);
		if(result)
		{
			mv.setViewName("dashboard");
		}
		else
		{
			mv.setViewName("loginpg");
		}
		
		return mv;
	}

	*/

	@RequestMapping("/loginpage")
	public String openloginpage()
	{
		return "login"; 
	}
	
	@RequestMapping("/login")
	public ModelAndView checkLogin(@ModelAttribute Admin admin)
	{
		
		// servlet jsp
		
		//String name=request.getParameter("username");
		
		//@ModelAttribute user.getUsername() ,password() 
		
		System.out.println(admin.getUsername());
		System.out.println(admin.getPassword());
		System.out.println("Inside the check login page");
		boolean result=springservice.checkLogin(admin);
		
			
		ModelAndView mv=new ModelAndView();
		//request.getRequestDispatcher("index.jsp")
		//rd.forward(request,response);
		//setAttribute();
		if(result)
		{
			
			mv.setViewName("home");
		}
		else
		{
			mv.addObject("msg", "something went wrong");
			mv.setViewName("login");
		}
	
		
		
		return mv;
		
	}
	
	
	@RequestMapping("/add_user")
	public ModelAndView openAdduserPage()
	{
		ModelAndView mv=new ModelAndView();
		List<Subject> subjectlist=springservice.listSubject();
		mv.addObject("subjectlist",subjectlist);
		mv.setViewName("add_user");
		
		return mv;
	}
	
	@RequestMapping("/save")
	public ModelAndView saveUser(@ModelAttribute Student student)
	{
		System.out.println(student.getUsername());
		System.out.println(student.getName());
		System.out.println("==========================");
		System.out.println(student.getSubject().getSubId());
		System.out.println("==========================");
		ModelAndView mv=new ModelAndView();
		boolean result=springservice.saveUser(student);
		if(result)
		{
			List<Student> listuser=springservice.loadUser();
			mv.addObject("list", listuser);
			mv.setViewName("list");
		}
		else
		{
			mv.setViewName("add_user");
		}
		
		return mv;
		
	}

	
	@RequestMapping("/delete")
	public ModelAndView deleteUser(@RequestParam String sid)
	{
		System.out.println("DeleteUserMethod()------Controller");
		int userid=Integer.parseInt(sid);
		//int userid=id;
		boolean result=springservice.deleteUser(userid);
		
		List<Student> listuser=springservice.loadUser();
		
		ModelAndView mv=new ModelAndView();
		if(result)
		{
			mv.addObject("list", listuser);
			mv.setViewName("list");
		}
		
		
		return mv;
	}
	
	
	@RequestMapping("/list")
	public ModelAndView ShowStudentList()
	{
		ModelAndView mv=new ModelAndView();
		List<Student> liststudent=springservice.loadUser();
		
		if(!liststudent.isEmpty())
		{
			mv.addObject("list", liststudent);
			mv.setViewName("list");
		}
		return mv;
	}
	
	@RequestMapping("/edit")
	public ModelAndView ShowEditRecord(@RequestParam("sid") String id)
	{
		ModelAndView mv=new ModelAndView();
		
		int stud_id=Integer.parseInt(id);
		List<Student> studentlist=springservice.ShowEditRecord(stud_id);
		
		List<Subject> subjectlist=springservice.listSubject();
		if(!studentlist.isEmpty())
		{
			mv.addObject("list",studentlist);
			mv.addObject("subjectlist",subjectlist);
			mv.setViewName("update");
		}
		return mv;
	}
	
	@RequestMapping("/update")
	public ModelAndView UpdateStudent(@ModelAttribute Student student)
	{
		ModelAndView mv=new ModelAndView();
		boolean result=springservice.UpdateStudent(student);
		List<Student> liststudent=springservice.loadUser();
		if(result)
		{
			mv.addObject("list", liststudent);
			mv.setViewName("list");
		}
		
		return mv;
	}


	
	@RequestMapping("/deleteuser")
	public ModelAndView deleteUserUsingButton(@RequestParam int sid)
	{
		System.out.println("DeleteUserMethod()------Controller");
		//int userid=Integer.parseInt(sid);
		//int userid=id;
		boolean result=springservice.deleteUser(sid);
		
		List<Student> listuser=springservice.loadUser();
		
		ModelAndView mv=new ModelAndView();
		if(result)
		{
			mv.addObject("list", listuser);
			mv.setViewName("list");
		}
		else
		{
			mv.addObject("msg", "You have already deleted student");
			mv.addObject("list", listuser);
			mv.setViewName("list");
		}
		
		return mv;
	}
	
	@RequestMapping("/checkboxlist")
	public ModelAndView showstudentlistwithcheckbox()
	{
		ModelAndView mv=new ModelAndView();
		List<Student> liststudent=springservice.loadUser();
		
		if(!liststudent.isEmpty())
		{
			mv.addObject("list", liststudent);
			mv.setViewName("checklist");
		}
		return mv;
	}
	
	@RequestMapping("/deletestudent")
	public ModelAndView deletestudentbycheckbox(@RequestParam("sid") int[] sid)
	{
		ModelAndView mv=new ModelAndView();
		boolean value=springservice.deletestudentbycheckbox(sid);
		List<Student> liststudent=springservice.loadUser();
		
		if(value)
		{
			//mv.addObject("list", liststudent);
			//mv.setViewName("checklist");
			mv.setViewName("home");
		}
		return mv;
	}
	
	
	@RequestMapping("/suspendstudent")
	public ModelAndView suspendStudnetbycheckbox(@RequestParam("sid") int[] sid)
	{
		ModelAndView mv=new ModelAndView();
		boolean value=springservice.suspendStudnetbycheckbox(sid);
		List<Student> liststudent=springservice.loadUser();
		
		if(value)
		{
			mv.addObject("list", liststudent);
			mv.setViewName("checklist");
		}
		return mv;
	}
	
	@RequestMapping("/edit")
	public ModelAndView ShowEditRecord(@RequestParam("sid") int stud_id)
	{
		ModelAndView mv=new ModelAndView();
		
		//int stud_id=Integer.parseInt(id);
		List<Student> studentlist=springservice.ShowEditRecord(stud_id);
		
		List<Subject> subjectlist=springservice.listSubject();
		if(!studentlist.isEmpty())
		{
			mv.addObject("list",studentlist);
			mv.addObject("subjectlist",subjectlist);
			mv.setViewName("update");
		}
		return mv;
	}
	
	@RequestMapping("/suspend")
	public ModelAndView MakeStudentSuspend(@ModelAttribute Student student)
	{
		student.getSid();
		ModelAndView mv=new ModelAndView();
		boolean result=springservice.MakeStudentSuspend(student);
		List<Student> liststudent=springservice.loadUser();
		if(result)
		{
			mv.addObject("list", liststudent);
			mv.setViewName("list");
		}
		
		return mv;
	}
	
	
	@RequestMapping("/editphone")
	public ModelAndView ShowPhoneRecord(@RequestParam("sid") int stud_id)
	{
		ModelAndView mv=new ModelAndView();
		
		//int stud_id=Integer.parseInt(id);
		List<Student> studentlist=springservice.ShowEditRecord(stud_id);
		
		List<Subject> subjectlist=springservice.listSubject();
		if(!studentlist.isEmpty())
		{
			mv.addObject("list",studentlist);
			mv.addObject("subjectlist",subjectlist);
			mv.setViewName("updatephone");
		}
		return mv;
	}
	//updatephone
	@RequestMapping("/updatephone")
	public ModelAndView UpdateStudentPhone(@ModelAttribute Student student)
	{
		ModelAndView mv=new ModelAndView();
		boolean result=springservice.UpdateStudent(student);
		List<Student> liststudent=springservice.loadUser();
		if(result)
		{
			mv.addObject("list", liststudent);
			mv.setViewName("list");
		}
		
		return mv;
	}


	
}
