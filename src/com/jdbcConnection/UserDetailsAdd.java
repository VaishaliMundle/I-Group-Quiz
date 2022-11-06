package com.jdbcConnection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Scanner;

import com.getQuestionFromMysql.Questionset;
import com.mysql.jdbc.Connection;

public class UserDetailsAdd extends Questionset{
	public static void AddDetails() {
		//get studName and id from user 
		Scanner scn=new Scanner(System.in);
		
			System.out.println("Enter your Name>>");
			String name=scn.nextLine();
			
			System.out.println("Enter your Id>>");
			int id=scn.nextInt();
			
			
		try {
			// storing the user details in databse
			//step1: register driver class
			Class.forName("com.mysql.jdbc.Driver");
			
			//step2:establish connection
			String url="jdbc:mysql://localhost:3306/quizdb?characterEncoding=utf8";
			Connection connection=(Connection) DriverManager.getConnection(url, "root", "V@ishali7");
			String sql= "insert into stud_score(id,name,score) values(?,?,?)";
			PreparedStatement pst=connection.prepareStatement(sql);
			pst.setInt(1, id);
			pst.setString(2, name);
			
			System.out.println("**Your Quiz Started**");
			Questionset.retriveData();
			
			pst.setInt(3, result);
			int inserted=pst.executeUpdate();
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
			
		
		
		}
	}
	


