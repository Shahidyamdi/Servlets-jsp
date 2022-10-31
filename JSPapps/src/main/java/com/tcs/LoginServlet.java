package com.tcs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends javax.servlet.http.HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("User Name:"+username);
		System.out.println("Password:"+password);
		//Perform (or Invoke) Business Logic
		if(username.equalsIgnoreCase("shahid") && password.equals("sha"))
		{ //Invoke Success response page.
		RequestDispatcher rd = request.getRequestDispatcher("/Success.jsp");
		rd.forward(request, response);
		}
		else
		{ //Invoke Failure response page.
		RequestDispatcher rd = request.getRequestDispatcher("/Failure.jsp");
		rd.forward(request, response);
		}
		}
	}


