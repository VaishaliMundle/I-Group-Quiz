package com.getQuestionFromMysql;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.jdbcConnection.JdbcConnection;
import com.mysql.jdbc.Connection;

public class Questionset {
	public static int count=0;
	public  static int result=0;
	public  static void retriveData() {
				
		try {
			
			//we retriving data from databse and showing in console
			//step1: register driver class
			Class.forName("com.mysql.jdbc.Driver");
			
			//step2:establish connection
			String url="jdbc:mysql://localhost:3306/quizdb?characterEncoding=utf8";
			Connection connection=(Connection) DriverManager.getConnection(url, "root", "V@ishali7");
			
			String sql="select * from questionset where que_no=?";
			PreparedStatement pst;
			pst = connection.prepareStatement(sql);
			for(int i=1;i<=10;i++) {
			pst.setInt(1, i);
			
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				System.out.println("queNo>>"+rs.getInt(1));
				System.out.println("question>>"+rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
				System.out.println(rs.getString(5));
				System.out.println(rs.getString(6));

				 Scanner scn=new Scanner(System.in);
				  System.out.println("Enter your Answer>>"); 
				  String userAns=scn.next();
				  String str = userAns;
					//while (rs.next()) {
					String compareTo = rs.getString(7);
					if(str.equals(compareTo )){
					result=count++;
			
					}}}
			System.out.println("Your score is>>"+result+"/"+"10");
			if(result>=8) {
				System.out.println("You pass by->class A ");
				
			}else if(result>=6&&result<8) {
				System.out.println("You pass by->class B");
			}else if(result==5) {
				System.out.println("You pass by->class C");
			}else {
				System.out.println("Your result is fail");
			}
			
		}catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
  
  }
 