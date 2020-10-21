<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.jbk.entity.Subject" %>
    <%@ page import="java.util.List" %>
     <%@ page import="com.jbk.entity.Student" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h4>Edit Student</h4>

<% List<Student> listuser=(List<Student>)request.getAttribute("list"); %>
<form action="updatephone" method="post">
<%for(Student student:listuser) 
{
	

%>
<table border="1">
<tr>
<td>
<input type="text" name="sid" value="<%out.println(student.getSid()); %>" readonly>
</td></tr>
<tr>

<td>Enter Name:-</td>
<td><input type="text" name="name" value="<%out.println(student.getName());%>"  readonly></td>

</tr>
<tr>
<td>Enter Address:-</td>
<td><input type="text" name="address" value="<%out.println(student.getAddress());%>"  readonly></td>

</tr>
<tr>
<td>Enter Contact:-</td>
<td><input type="text" name="contact" value="<%out.println(student.getContact());%>" ></td>

</tr>
<tr>
<% List<Subject> listsubject=(List<Subject>)request.getAttribute("subjectlist"); %>
<td>Enter Subject:-</td>
<td>
<select name="subject.subId">
<%for(Subject subject:listsubject)
	{
	%>

<option value="<%=subject.getSubId()%>"><%out.println(subject.getSubName());%></option>


<%} %>
</select>
</td>
</tr>

<tr>
<td>Enter Username:-</td>
<td><input type="text" name="username" value="<%out.println(student.getUsername());%>"  readonly></td>

</tr>
<tr>
<td>Enter Password:-</td>
<td><input type="password" name="password" value="<%out.println(student.getPassword());%>"  readonly></td>
</tr>
<tr>
<td>Enter Status</td>
<td><input type="text" name="status" value="<%out.println(student.getStatus()); %>" readonly></td>
</tr>
<tr>
<td></td>

<td><input type="submit" value="Submit"></td>

</tr>
</table>
<%
}
%>
</form>
<a href="list">List User</a>
</center>
</body>
</html>