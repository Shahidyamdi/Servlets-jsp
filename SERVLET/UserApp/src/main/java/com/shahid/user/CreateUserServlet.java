package com.shahid.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateUserServlet
 */
@WebServlet("/addServlet")
public class CreateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection connection;
	Statement statement;

	public void init(ServletConfig config) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "shahid2812");
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		try {
			statement = connection.createStatement();
		 int update = statement.executeUpdate("insert  into user values('" + firstName + "','" + lastName + "','"
					+ email + "','" + password + "')");

			PrintWriter out = response.getWriter();
			if (update > 0) {
				out.println("<h1>Data sucess");
			}

			else if (update == 0)
				connection.close();
			statement.close();
			{

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void destroy() {

	}

}
