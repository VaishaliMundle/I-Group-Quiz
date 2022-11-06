package com.jdbcConnection;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class JdbcConnection {
	public static Connection getConnection() {
		try {
			//connection establish with dababase
			//step1: register driver class
			Class.forName("com.mysql.jdbc.Driver");
			
			//step2:establish connection
			String url="jdbc:mysql://localhost:3306/quizdb?characterEncoding=utf8";
			Connection connection;
			connection=(Connection) DriverManager.getConnection(url, "root", "V@ishali7");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection connection=null;
		return connection;
		
		
	}

}
