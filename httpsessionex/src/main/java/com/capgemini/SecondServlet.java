package com.capgemini;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SecondServlet
 */
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uqual = request.getParameter("uqual");
		String udes = request.getParameter("udes");
		
		HttpSession session = request.getSession(false);
		session.setAttribute("uqual", uqual);
		session.setAttribute("udes", udes);
		RequestDispatcher dispatcher = request.getRequestDispatcher("form3.html");
		dispatcher.forward(request, response);
	}

}
