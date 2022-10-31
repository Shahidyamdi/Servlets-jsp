package com.shahid.init;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateUserServlet
 */
@WebServlet(urlPatterns ="/addServlet",initParams = {
		                                           @WebInitParam(name ="dbUrl",value ="jdbc:mysql://localhost/mydb"),
		                                           @WebInitParam(name ="dbsuser",value ="root"),
                                                   @WebInitParam(name ="dbpassword",value ="shahid2812")})
public class CreateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
private Connection connection;
	public void init(ServletConfig config) {
		try {
			System.out.println("init()");
			Class.forName("com.mysql.jdbc.Driver");
			 connection = DriverManager.getConnection(config.getInitParameter("dbUrl"),config.getInitParameter("dbuser"),config.getInitParameter("dbpassword"));
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doPost()");
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		try {
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate("insert  user value('"+ firstName +"','"+ lastName +"','" + email + "','"+ password + "')");
			
		PrintWriter out = response.getWriter();
		if(result > 0) {
		
		out.println("<H1>DATA CREATED SUCESSFULLY</H1>");
		} 
		else  {
			out.println("<H1>ERROR OCCURED</H1>");
			
		}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void destroy() {
		try {
			System.out.println("destroy()");
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
