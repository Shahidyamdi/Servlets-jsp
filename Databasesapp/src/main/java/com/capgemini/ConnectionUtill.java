package com.capgemini;

import org.apache.commons.dbcp.BasicDataSource;

public class ConnectionUtill {
	public static BasicDataSource  dataSource = null;
	static {
		dataSource = new BasicDataSource();
		dataSource = new BasicDataSource();
		dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("system");
		dataSource.setPassword("shahid");
		dataSource.setMaxActive(10);

		
		
	}
	

}
