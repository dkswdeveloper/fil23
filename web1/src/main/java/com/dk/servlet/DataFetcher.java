package com.dk.servlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dk.service.DataService;
import com.dk.service.DataServiceImpl;
@WebServlet("/DataFetcher")
public class DataFetcher extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DataService dataService = new DataServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String username2 =(String) request.getAttribute("username");
		HttpSession session = request.getSession(false);
		if(session == null || session.getAttribute("username") == null)
		{
			//forward response.redirect
			response.sendRedirect("index.jsp");
			return;
		}
		//get data from db for username	
		String username3 = (String)session.getAttribute("username");
		List<String> data = dataService.getData(username3);
		request.setAttribute("data", data);
		Cookie[] cookies = request.getCookies();
		Cookie ck = null;
		if(cookies != null)
		for(Cookie ckar : cookies)
		{
			if(ckar.getName().equals("interest"))
			{
				ck = ckar;
				break;
			}
		} 
		if(ck == null) ck = new Cookie("interest", "");
//		Cookie cookie = Arrays.stream(cookies)
//			.filter(ck -> ck.getName().equals("interest"))
//			.findFirst()
//			.orElseGet(() -> new Cookie("interest", ""));
		request.setAttribute("offers", "Here are new Offers on " + ck.getValue());
		RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
