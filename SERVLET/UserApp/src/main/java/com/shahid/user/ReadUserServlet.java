package com.shahid.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
@WebServlet("/ReadServlet")
public class ReadUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
private Connection connection;
private Statement statement;
	public void init() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","shahid2812");
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		System.out.println("doPost()");
		
		try {
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from user");
		PrintWriter out = response.getWriter();
		out.print("<table>");
		out.print("<tr>");
		out.print("<th>");
		out.print("first Name");
		out.print("</th>");
		out.print("<th>");
		out.print("last Name");
		out.print("</th>");
		out.print("<th>");
		out.print("email");
		out.print("</th>");
		out.print("</tr>");
		
		while(resultSet.next()) {
			out.print("<tr>");
			out.print("<td>");
			out.print(resultSet.getString(1));
			out.print("</td>");
			out.print("<td>");
			out.print(resultSet.getString(2));
			out.print("</td>");
			out.print("<td>");
			out.print(resultSet.getString(3));
			out.print("</td>");
			out.print("</tr>");
		}
		out.print("</table>");
		
	
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
