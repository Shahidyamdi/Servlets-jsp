package com.capgemini;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
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

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		try {
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","shahid");
		Connection connection = ConnectionUtill.dataSource.getConnection();
		Statement statement = connection.createStatement();
		ResultSet set = statement.executeQuery("select * from customer");
		writer.println("<b>FirstName  LastName  Email  Mobile  Address</b>");
		writer.println("<br>");
		while(set.next())
		{ writer.println(set.getString(1) +"  "+ set.getString(2) +"  "+ set.getString(3) +"  "+ set.getString(4) + 
		"  "+ set.getString(5));
		writer.println("<br>");
		}
		writer.println("<a href='customer.html'>Click here to Add records..</a>");
		} catch (Exception e) {
		e.printStackTrace();
		}
		}
		}


