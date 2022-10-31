package com.capgemini;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginservlet
 */
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public loginservlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		String username =request.getParameter("username");
		String password = request.getParameter("password");
//		
//		if(username.equals("shahid")&&password.equals("shah")) {
//			writer.println("Login Success");
//		}
//		else {
//			writer.println("Fail!");
//		
		
		
		if(username.equalsIgnoreCase("shahid")&&password.equals("shah")) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("successservlet");
			dispatcher.forward(request, response);
			
		}
		else {
			writer.println("Invaild! please try again");
		}
			RequestDispatcher dispatcher = request.getRequestDispatcher("login.html");
			dispatcher.include(request, response);
		}
			
		
//		if(username.equals("shahid")&&password.equals("shah")) {
//			writer.println("<a href='http://www.facebook.com'>Cilck here for facebook page</a>");
//		}
//		else {
//			writer.println("<a href='failservlet'>Cilck here for failservlet page</a>");
//			
//		}
//		
//		
	
		

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
