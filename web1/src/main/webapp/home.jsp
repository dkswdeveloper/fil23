<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Data for <%out.println(request.getAttribute("username")); %></h1>
<%out.println(request.getAttribute("data")); %>
<ol>
	<li>one</li>
	<li>one</li>
	<li>one</li>
	<li>one</li>
	
</ol>
</body>
</html>