package com.dk.config;

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
    }
    public void contextInitialized(ServletContextEvent sce)  {
    	System.out.println("application starting");
    	System.out.println("we can create db/nw/virutal dirve connection");
    }
	
}
