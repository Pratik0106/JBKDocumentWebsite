<%@page import="com.jbk.entity.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
   <!-- script src="/resources/bootstrap/js/bootstrap.min.js"></script>
   <script type="text/javascript" src="/resources/static/bootstrap/js/jquery-3.5.1.min.js">
   </script>
   <script type="text/javascript" src="/resources/static/plugins/jQuery/jQuery-2.1.4.min.js">
   </script> -->
   
<script type="text/javascript">
	
	
function checkAll()
{
    var parent=document.getElementById("parentcheck");
    var input=document.getElementsByTagName("input");

     //var parent=document.formid.parencheck;
     //var input=document.formid.input;
    if(parent.checked === true)
    {
    	 for(var i=0;i< input.length;i++)
 	     {
 	   			if(input[i].type=="checkbox" && input[i].id=="sid" && input[i].checked==false)
 	 	   			{
 	 	   				input[i].checked=true;
 	 	   			}
 	     }
     }
    else if(parent.checked === false)
    {
    	 for(var i=0;i< input.length;i++)
 	     {
 	   			if(input[i].type=="checkbox" && input[i].id=="sid" && input[i].checked==true)
 	 	   			{
 	 	   				input[i].checked=false;
 	 	   			}
 	     }
     }
   
    
}



</script>

</head>
<body>
<a href="add_user">Add user</a>
<h2>Userlist</h2>
<% List<Student> listuser=(List<Student>)request.getAttribute("list"); %>
<%String msg=(String)request.getAttribute("msg"); %>
<%if(msg!=null) 
{ %>
	<% out.println(msg); %>
<% } %>
<div >
<p id="msg"></p>
</div><div>
<p id="value"></p>
</div>
<form name="formid" id="formid" action="#" method="post">
<table border="1">
<tr>
<th><input type="checkbox" onclick="checkAll()" id="parentcheck" name="parentcheck" /></th>
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
<td><input type="checkbox" id="sid" name="sid" value="<%out.println(student.getSid());  %>" checked  onclick="return limitfun()"/></td>

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
<input type="submit" value="Delete" onclick="formid.action='deletestudent';">
<input type="submit" value="Suspend" onclick="formid.action='suspendstudent';">

</form>

</center>
<!--script>

$("#parentcheck").change(function()
{
	$("$sid").prop("checked",$(this).prop("checked"))
	}

		)
</script-->
<script type="text/javascript">

function limitfun()
{


	var x=document.getElementsByName('sid');
	var newvar=0;
	var count;
	for(count=0;count<x.length;count++)
		{
			if(x[count].checked == true)
			{
				newvar= newvar + 1;
			}
				
		}
	if(newvar<1)
		{
			document.getElementById('value').innerHTML="Please select at least 2 checkbox";
			document.getElementById('value').style.color="red";
			// alert("Please select at least 2 checkboxes")
			return false;
		}
	else if(newvar >=1)
		{
		document.getElementById('value').innerHTML="You can perform operation now..";
		document.getElementById('value').style.color="blue";
		}
}

</script>
</body>
</html>