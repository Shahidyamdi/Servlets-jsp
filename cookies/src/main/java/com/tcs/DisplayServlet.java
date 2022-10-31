package com.tcs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayServlet
 */
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	Cookie cookie[] =	request.getCookies();
	response.setContentType("text/html");
	PrintWriter writer = response.getWriter();
	String mobile = request.getParameter("mobile");
	String email = request.getParameter("email");
	
	writer.println("<html>");
	writer.println("<body bgcolor='teal'>");
	writer.println("<center><h1>");
	writer.println("*******Complete details*******");
	writer.println("<br><br>");
	writer.println("User Name          : " +cookie[0].getValue());
	writer.println("<br>");
	writer.println("User Age           : " +cookie[1].getValue());
	writer.println("<br>");
	writer.println("User Qualification : " +cookie[2].getValue());
	writer.println("<br>");
	writer.println("User Designation   : " +cookie[3].getValue());
	writer.println("<br>");
	writer.println("User Mobile        : " +mobile);
	writer.println("<br>");
	writer.println("User Email         : " +email);
	writer.println("<br>");
	writer.println("</h1>");
	writer.println("</body> </center>");
	writer.println("</html>");
	
	
	
	}

}
