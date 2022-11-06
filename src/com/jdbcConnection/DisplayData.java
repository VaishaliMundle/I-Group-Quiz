package com.jdbcConnection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class DisplayData {
	public static void displayData() {
				//Display data from database
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			//step2:establish connection
			String url="jdbc:mysql://localhost:3306/quizdb?characterEncoding=utf8";
			Connection connection=(Connection) DriverManager.getConnection(url, "root", "V@ishali7");
			
			String sql="select * from quizdb.stud_score order by score";
			PreparedStatement pst;
		           pst=connection.prepareStatement(sql);
		
				ResultSet rs=pst.executeQuery();
				while(rs.next()) {
					System.out.print("Id>>"+rs.getInt(1));
					System.out.print("    "+"Name>>"+rs.getString(2));
					System.out.print("    "+"Score>>"+rs.getInt(3));
					System.out.println(" ");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		
	}

}
