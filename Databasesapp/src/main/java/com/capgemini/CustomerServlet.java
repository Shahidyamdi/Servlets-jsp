package com.capgemini;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CustomerServlet
 */
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public CustomerServlet() {
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		String firstname = request.getParameter("firstName");
		String lastname = request.getParameter("lastName");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		String[] s = request.getParameterValues("t1");
		StringBuffer buffer = new StringBuffer();
		for(String ss : s)
		{ buffer.append(ss+",");
		}
		String caddr = buffer.toString();
		
		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","shahid");
		
			Connection connection = ConnectionUtill.dataSource.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("insert into customer values(?,?,?,?,?)");
					preparedStatement.setString(1, firstname);
					preparedStatement.setString(2, lastname);
					preparedStatement.setString(3, email);
					preparedStatement.setString(4, mobile);
					preparedStatement.setString(5, caddr);
					int a = preparedStatement.executeUpdate();
					if (a == 1) {
					writer.println("Data inserted successfully....");
					writer.println("<br>");
					writer.println("<a href='DisplayServlet'>Click here to Display allrecords..</a>");

					}
		}catch(Exception e) {
						e.printStackTrace();
					}
					
					}
}
	
		
