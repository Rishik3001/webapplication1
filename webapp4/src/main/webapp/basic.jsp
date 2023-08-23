<%@page import="com.tadigital.com.webapp4.user.entity.Entity"%>
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
	Entity name = (Entity)session.getAttribute("MAIL");
	%>
        <h2>WELCOME <%= name.getEmployeeName()%> </h2>
</body>
</html>