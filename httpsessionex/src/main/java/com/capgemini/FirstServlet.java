package com.capgemini;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String uage = request.getParameter("uage");
		
		HttpSession session = request.getSession();
		session.setAttribute("uname", uname);
		session.setAttribute("uage", uage);
		RequestDispatcher dispatcher = request.getRequestDispatcher("form2.html");
		dispatcher.forward(request, response);
	}

}
