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
<h2> <% out.println(session.getAttribute("username")); %></h2>
<h2> <% out.println(request.getAttribute("offers")); %></h2>
<a href="whatsnewmobile" >What is new Mobile in the market ?</a> <br>
<a href="homeappilances"> Any new Home Appliances ? </a>

<p><a href="logout?msg=">Logout</a></p>
<!-- https://www.google.com/search?q=hello  -->

<%out.println(request.getAttribute("data")); %>

<ol>
	<li>one</li>
	<li>one</li>
	<li>one</li>
	<li>one</li>
	
</ol>

</body>
</html>