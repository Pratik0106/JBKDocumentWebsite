import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringbootController {

	/*@RequestMapping("/getstring")
	public String getString()
	{
		return "hello Spring boot";
	}
	
	@RequestMapping("/getarraylist")
	public ArrayList<String> getArrayList()
	{
		ArrayList<String> arraylist=new ArrayList<>();
		arraylist.add("pqr");
		arraylist.add("str");
		arraylist.add("xyz");
		return arraylist;
	}
	
	@RequestMapping("/getint")
	public int getIntegervalue()
	{
		return 10;
	}
	
	@RequestMapping("/getintarray")
	public int[] getIntegerarray()
	{
		int array[]={10,20,30,40};
		return array;
	}
	
	@RequestMapping("/getintegerlist")
	public ArrayList<Integer> getIntegerlist()
	{
		ArrayList<Integer> list=new ArrayList<>();
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);
		return list;
	}
	
	@RequestMapping("/getstudent")
	public Student getStudent()
	{
		Student stud=new Student();
		stud.setRollno(111);
		stud.setName("abc");
		stud.setAge(25);
		return stud;
	}
	
	@RequestMapping("/getstudentlist")
	public ArrayList<Student> getArrayListStudent()
	{
		Student stud=new Student();
		stud.setRollno(222);
		stud.setName("pqr");
		stud.setAge(24);
		
		Student stud1=new Student();
		stud1.setRollno(111);
		stud1.setName("abc");
		stud1.setAge(25);
		
		ArrayList<Student> liststudent=new ArrayList<>();
		liststudent.add(stud);
		liststudent.add(stud1);
		
		return liststudent;
	}
	
	@RequestMapping("/gethashmapdata")
	public HashMap<Integer,ArrayList<Student>> getHashmapdata()
	{
		HashMap<Integer,ArrayList<Student>> hm=new HashMap<>();
		
		//Student data
		
		Student stud=new Student();
		stud.setRollno(11);
		stud.setName("Riya");
		stud.setAge(22);
		
		Student stud1=new Student();
		stud1.setRollno(12);
		stud1.setName("Pooja");
		stud1.setAge(23);
		
		ArrayList<Student> studlist=new ArrayList<>();
		studlist.add(stud);
		studlist.add(stud1);

		
		Student stud2=new Student();
		stud2.setRollno(11);
		stud2.setName("Divya");
		stud2.setAge(22);
		
		Student stud3=new Student();
		stud3.setRollno(12);
		stud3.setName("Harshada");
		stud3.setAge(23);
		
		ArrayList<Student> studlist1=new ArrayList<>();
		studlist1.add(stud2);
		studlist1.add(stud3);
		
		
		hm.put(1, studlist);
		hm.put(2, studlist1);
		return hm;
	}
	
	
	
	@PutMapping("/putdata")
	public String putStringData(@RequestBody String data)
	{
		String value="Hello";
		System.out.println("Existing Value:-"+value);
		
		value=data;
		System.out.println("Updated Value:-"+value);
		return "Value Updated";
	}
	
	@RequestMapping("/checkstudent/{rollno}")
	public String checkStudentbyRollNo(@PathVariable String rollno)
	{
		int rollno1=Integer.parseInt(rollno);
		
		Student stud=new Student();
		stud.setRollno(1);
		stud.setName("abc");
		stud.setAge(20);
		
		Student stud1=new Student();
		stud1.setRollno(2);
		stud1.setName("pqr");
		stud1.setAge(22);
		
		
		ArrayList<Student> studentlist=new ArrayList<>();
		studentlist.add(stud);
		studentlist.add(stud1);
		boolean flag=false;
		for(Student student:studentlist)
		{
			if(student.getRollno()==rollno1)
			{
				flag=true;
			}
		}
		if(flag==true)
	}
}
