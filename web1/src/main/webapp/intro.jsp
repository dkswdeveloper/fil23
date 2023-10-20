<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, com.dk.model.User" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> JSP Demo</h1>

<% out.println(request.getAttribute("list")); %> <br>
${list } <br>
request, session, application, page 
Expression Language <br>

<c:if test="${list.size() > 10}"> 
	You have a list of data <br> 
</c:if>
<h3> Users</h3>
<ol>
<c:forEach items="${users }" var="myvar" varStatus="index">
<li>User with name = ${myvar.username }, password = ${myvar.password }
, ${myvar.demo }
</li> 
</c:forEach>
</ol>
<ol>
<% List<User> users = (List<User>)request.getAttribute("users");
	for(User user : users)
	{
		out.println("<li>" + "user with name " + user.getUsername() + 
				" and password " + user.getPassword() + "</li>");
	}
%>
</ol>




<%@ include file="menu.jsp" %>
<jsp:include page="menu.jsp"></jsp:include>

<% int x; 
int y;
x = 5; y = 4;
out.println("<p> " + (x+y) + "</p>") ; 
%>
<%= "<p> " + (x+y) + "</p>" %>
<%! int count = 101; %>
<p> You are visitor number <%= count++ %> </p>

<%-- 
<a href="deleteMessage?msgid=${msgid }">Delete</a>

<ol>
	<c:forEach items="${messages }" var="msg">
	<li> ${msg.id }, ${msg.to }, ${msg.from } 
		<form action="deleteMessage" method="post">
			<input type="submit" value="Delete"/>
			<input type="hidden" name="msgid" value="${msg.id }" />
		</form>
	 </li>
</c:forEach>
</ol>
 --%>
 http://localhost:8080/web1/deleteMessage?msgid=101
<ol>
	<li> 1, dinesh, abhimanyu, message app,
	<form action="deleteMessage" method="get">
			<input type="submit" value="Delete"/>
			<input type="hidden" name="msgid" value="101" />
		</form>
	</li>
	<li> 2, dinesh, abhimanyu, message web app,
	<form action="deleteMessage" method="get" id=">
			<input type="submit" value="Delete"/>
			<input type="hidden" name="msgid" value="102" />
		</form>
	</li>
	
</ol>
<a href="deleteMessage?id=502" > <button>Delete</button></a>










</body>
</html>