<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> My First Web Project</h1>
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