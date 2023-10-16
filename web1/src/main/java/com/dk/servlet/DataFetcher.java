package com.dk.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.DataService;
import service.DataServiceImpl;
@WebServlet("/DataFetcher")
public class DataFetcher extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DataService dataService = new DataServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String username2 =(String) request.getAttribute("username");
		//get data from db for username
		List<String> data = dataService.getData(username2);
		request.setAttribute("data", data);
		RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
