<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
 <%@ page import="java.util.List" %>
  <%@ page import="com.jbk.entity.Subject" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h4>Add Student</h4>
<form action="save" method="post">
<table border="1">
<tr>
<td>Enter Name:-</td>
<td><input type="text" name="name"></td>

</tr>
<tr>
<td>Enter Address:-</td>
<td><input type="text" name="address"></td>

</tr>
<tr>
<td>Enter Contact:-</td>
<td><input type="text" name="contact"></td>

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
<td><input type="text" name="username"></td>

</tr>
<tr>
<td>Enter Password:-</td>
<td><input type="password" name="password"></td>

</tr>
<tr>
<td>Enter Status</td>
<td><input type="text" name="status"></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Submit"></td>

</tr>
</table>
</form>
<a href="list">List User</a>
</center>
</body>
</html>