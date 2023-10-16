package com.dk.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.LoginService;
import service.LoginServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(
		description = "This will handle login", 
		urlPatterns = { "/login" }, 
		initParams = { 
				@WebInitParam(name = "key", value = "mykey")
		})
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	LoginService loginService =new LoginServiceImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		PrintWriter out = response.getWriter();
		System.out.println(username + ", " + password);
		if(loginService.checkLogin(username, password))
		{
			System.out.println("Login successful");
			request.setAttribute("username", username);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("DataFetcher");
			requestDispatcher.forward(request, response);
		}
		else {
			System.out.println("login failed");
//			RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
//			requestDispatcher.forward(request, response);
			response.sendRedirect("index.jsp");
		}
	}

}
