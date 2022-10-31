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
 * Servlet Filter implementation class myfilter2
 */
public class myfilter2 implements Filter {

    /**
     * Default constructor. 
     */
    public myfilter2() {
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
		String uaddr = request.getParameter("uaddr");
		if(uaddr.equalsIgnoreCase("hyderabad"))
		{ chain.doFilter(request, response);
		}
		else
		{ writer.println("this application only for hyd person");
		request.getRequestDispatcher("form.html").include(request, response);
	
	}
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
