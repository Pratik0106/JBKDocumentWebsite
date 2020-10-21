<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.List" %>
    <%@ page import="com.jbk.entity.Student" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
   <!--script src="/resources/bootstrap/js/jQuery-3.5.1.min.js"></script-->
     <!--  script src="/resources/bootstrap/js/bootstrap.min.js"></script>-->
<title>Insert title here</title>
<script type="text/javascript">

	function validate()
	{
		var x=document.formid.sid;
		var valid=false;

		for(var i=0;i<x.length;i++)
			{

				 if(x[i].checked)
					 {
					 		valid=true;
					 		break;
					 }
				
			}

		if(valid)
			{
			   alert("Validation Success")
			}
		else
			{
			   //alert("Please select radio button")
			   document.getElementById("msg").innerHTML="**Please select radio button**";
			   document.getElementById("msg").style.color="red";
			   return false;
			}
		
	}
</script>
</head>
<body>



<center>
<a href="add_user">Add user</a>
<a href="checkboxlist">List of Student with Checkbox</a>
<h2>Userlist</h2>
<% List<Student> listuser=(List<Student>)request.getAttribute("list"); %>
<%String msg=(String)request.getAttribute("msg"); %>
<%if(msg!=null) 
{ %>
	<% out.println(msg); %>
<% } %>
<div >
<p id="msg"></p>
</div>
<form name="formid" id="formid" action="#" method="post" onsubmit="return validate()">
<table border="1">
<tr>
<th>Select</th>
<th>Sr. No</th>
<th>Name</th>
<th>Address</th>
<th>Contact</th>
<th>Username</th>
<th>Course</th>
<th>Status</th>

</tr>
<% for(Student student:listuser)
	{
	%>
<tr>
<td><input type="radio" name="sid" value="<%out.println(student.getSid()); %>"></td>
<td><%out.println(student.getSid()); %></td>
<td><%out.println(student.getName()); %></td>
<td><%out.println(student.getAddress()); %></td>
<td><%out.println(student.getContact()); %></td>
<td><%out.println(student.getUsername()); %></td>
<td><%out.println(student.getSubject().getSubName()); %></td>
<td><%out.println(student.getStatus()); %></td>
<!--  td><a href="delete?sid=<%//=student.getSid() %>">Delete</a></td>
<td><a href="edit?sid=<%//=student.getSid()  onclick="formid.action='deleteuser';" %>">Edit</a></td>-->
</tr>
<%} %>
</table>
<input type="submit" value="Delete" onclick="formid.action='deleteuser';">
<input type="submit" value="Update" onclick="formid.action='edit';">
<input type="submit" value="Supend" onclick="formid.action='suspend';">
<input type="submit" value="Upadate Phone no" onclick="formid.action='editphone';">
</form>

</center>

</body>
</html>