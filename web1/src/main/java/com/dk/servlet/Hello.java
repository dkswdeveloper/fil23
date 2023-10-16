package com.dk.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
@WebServlet(urlPatterns = "/Hello", loadOnStartup = 23)
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int count = 1;
    public Hello() {
    	System.out.println("Hello created");
    }
    @Override
    public void init()
    {
    	ServletConfig servletConfig = this.getServletConfig();
    	String key = servletConfig.getInitParameter("key");
    	System.out.println("key:" + key);
    	String keyfromInit = this.getInitParameter("key");
    	System.out.println("Key from init " + keyfromInit);
    	System.out.println("hello initialized");
    }
    @Override
    public void destroy()
    {
    	System.out.println("hello destroyed");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Enumeration<String> headerNames = request.getHeaderNames();
		while(headerNames.hasMoreElements())
		{
			String name = headerNames.nextElement();
			String value = request.getHeader(name);
			System.out.println(name +":" + value);
		}
		ServletContext servletContext = this.getServletContext();
    	String contextPath = servletContext.getContextPath();
		out.println("Hello, How are you ? Time is already : "  + new Date());
		out.println("Request number:" + count++);
		out.println("Server running at " + contextPath);
		String dburl = servletContext.getInitParameter("dburl");
		out.println("will contact to " + dburl);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html><body> Hello to all");
		out.println("<h1> This is the header");
		out.println("<p>para</p>");
		out.println("Hello, Reponse to post request");
		out.println("Request number:" + count++);
		out.println("</body></html>");
	}

}
