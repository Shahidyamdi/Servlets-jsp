package com.capgemini;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class myfilter1
 */
public class myfilter1 implements Filter {

    /**
     * Default constructor. 
     */
    public myfilter1() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		int age = Integer.parseInt(request.getParameter("uage"));
		if(age>20)
		{
		chain.doFilter(request, response);
		}
		else
		{ writer.println("u r not eligible for mrg u age is below 20 years");
		request.getRequestDispatcher("form.html").include(request, response);
	}
	}
	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
