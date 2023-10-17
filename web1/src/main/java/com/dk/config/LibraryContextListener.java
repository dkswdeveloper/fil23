package com.dk.config;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class LibraryContextListener
 *
 */
@WebListener
public class LibraryContextListener implements ServletContextListener {
    public LibraryContextListener() {
        // TODO Auto-generated constructor stub
    }
    public void contextDestroyed(ServletContextEvent sce)  {
    	System.out.println("application stopping");
    	System.out.println("you can close db connection");
    	try {
			DbConnection.getConnection().close();
			System.out.println("connection closed");
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
    public void contextInitialized(ServletContextEvent sce)  {
    	System.out.println("application starting");
    	System.out.println("we can create db/nw/virutal dirve connection");
    	ServletContext servletContext = sce.getServletContext();
    	String dburl = servletContext.getInitParameter("dburl");
    	String dbuser = servletContext.getInitParameter("dbuser");
    	String dbpassword = servletContext.getInitParameter("dbpassword");
    	Connection connection = DbConnection.getConnection(dburl, dbuser,dbpassword);
    }
	
}
