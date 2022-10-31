package com.tcs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class mylisterner
 *
 */
public class mylisterner implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public mylisterner() {
        // TODO Auto-generated constructor stub
    }

	public void contextDestroyed(ServletContextEvent sce) {
		ServletContext context =sce.getServletContext();
		Connection connection = (Connection)context.getAttribute("conn");
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	public void contextInitialized(ServletContextEvent sce) {
		
		 try {
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			 Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","shahid");
			 ServletContext context = sce.getServletContext();
			 context.setAttribute("conn", connection);
			 }
			 catch (Exception e) 
			 { // TODO Auto-generated catch block
			 e.printStackTrace();
			 }
			  }

    
	
}
