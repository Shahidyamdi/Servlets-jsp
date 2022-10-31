package com.cg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class myservlet
 */
@WebServlet(urlPatterns = {"/myservlet"},initParams={@WebInitParam(name ="user1",value="shahid"),
	@WebInitParam(name ="user2",value="sameer"),})

public class myservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public myservlet() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      response.setContentType("text/html");
	      PrintWriter writer = response.getWriter();
	      ServletConfig config = this.getServletConfig();
	      writer.println("init param-1="+config.getInitParameter("user1"));
	      writer.println("<br>");
	      writer.println("init param-2="+config.getInitParameter("user2"));
	     
	
	
	
	}
	
	
	
	



}
