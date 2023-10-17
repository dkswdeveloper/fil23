<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> My First Web Project</h1>
<h2> ${cookie.interest.value }</h2>
<p>
	<% if (request.getParameter("msg") != null)
		out.println("Please Login to Continue");
	%>
</p>
<form action="Hello" method="post">
	<input type="submit" value="Send post request"/>
</form>
<form action="login" method="post">
	<input type="text" name="username" /> <br>
	<input type="password" name="password" /> <br>
	<input type="submit" value="Login"/>
</form>

</body>
</html>