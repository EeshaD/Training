<%@page import="com.pojo.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Employees</title>
</head>
<body>
<%
	List <Employee> employeeList = (List <Employee>) request.getAttribute("employees");
%>
<table border="1">
<%
	for(Employee e : employeeList) {
%>
<tr>
	<td><% out.println(e.getEmpId()); %></td>
	<td><% out.println(e.getName()); %></td>
	<td><% out.println(e.getSalary()); %></td>
</tr>
<% } %>
</table>
</body>
</html>