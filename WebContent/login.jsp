<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String message = (String) request.getAttribute("message");
%>
<%=message%>
<form action="check">
username: <input type="text" name="username"><br>
password: <input type="text" name="password"><br><br>
<input type="submit" value="Login">
</form>
</body>
</html>