package com.dk.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class LogFilter
 */
@WebFilter(urlPatterns = "/*", asyncSupported = true)
public class LogFilter implements Filter {

  	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// place your code here
		try
		{
			HttpServletRequest req = (HttpServletRequest) request;
			System.out.println(req.getContextPath());
			System.out.println(req.getRequestURI());
			System.out.println(req.getRequestURL());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
