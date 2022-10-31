package com.shahid.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateUserServlet
 */
@WebServlet("/deleteServlet")
public class deleteUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
private Connection connection;
	public void init() {
		try {
			System.out.println("init()");
			Class.forName("com.mysql.jdbc.Driver");
			 connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","shahid2812");
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		System.out.println("doPost()");
		String email = request.getParameter("email");
	
		
		try {
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate("delete  from user where email= '"+email+"'");
			
		PrintWriter out = response.getWriter();
		if(result>0) {
		
		out.println("<H1>DELETED</H1>");
	
		}else {
			out.println("<H1>NO USER FOUND</H1>");
			
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
