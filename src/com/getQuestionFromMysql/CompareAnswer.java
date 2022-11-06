package com.getQuestionFromMysql;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class CompareAnswer {
	

	private static java.sql.Connection con;

	public static void getScore() {
		
		int count=0;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Your Option>>");
		String ans=scn.next();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//step2:establish connection
			String url="jdbc:mysql://localhost:3306/quizdb?characterEncoding=utf8";
			Connection connection=(Connection) DriverManager.getConnection(url, "root", "V@ishali7");
			
			
			
			Statement myStmt = (Statement) con.createStatement();
            ResultSet rs;
            for(int i=1;i<=10;i++) {
            rs = myStmt.executeQuery("SELECT currect_ans FROM quizbd.questionset WHERE que_no="+i);
           /* while (rs.next()) {
            	rs.getString("que_no")*/;
            	while (rs.next()) { 
			        String compareTo = rs.getString("currect_ans");
			        if(scn.next().equals(compareTo )) {
						count++;
						}  
				}
            	
            
            }

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		System.out.println("Your score is>>"+count+"/"+"10");
	
	}

}
