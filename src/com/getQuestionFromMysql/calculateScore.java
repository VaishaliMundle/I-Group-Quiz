package com.getQuestionFromMysql;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Connection;

public class calculateScore {
	public static void userInput() {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your Answer>>");
		String userAns=scn.next();
	}
	
	public static void calScore() {
		//storing score in databse
		try {
			int count=0;
			
			Class.forName("com.mysql.jdbc.Driver");
			//step2:establish connection
			String url="jdbc:mysql://localhost:3306/quizdb?characterEncoding=utf8";
			Connection connection=(Connection) DriverManager.getConnection(url, "root", "V@ishali7");
			String sql="select * from questionset where que_no=?";
			PreparedStatement pst;
			pst = connection.prepareStatement(sql);
			for(int i=1;i<=10;i++) {
			pst.setInt(1, i);
			
			Scanner scn=new Scanner(System.in);
			System.out.println("Enter your Answer>>");
			String userAns=scn.next();
			
			ResultSet rs=pst.executeQuery();
			
			String str = userAns;
			while (rs.next()) {
			String compareTo = rs.getString(7);
			if(str.equals(compareTo )){
			System.out.println("Strings match!!");
			count++;
			//result=result+count;
			
			}
//			while(rs.next()) {
//				
//				System.out.println(rs.getString(7));
//				
//				if(userAns==rs.getString(7)) {
//					count++;
//					result=result+count;
//				}
				
			}
			
			}System.out.println("Your score is>>"+count+"/"+"10");}
			catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
public static void main(String[] args) {
	calculateScore obj=new calculateScore();
	obj.calScore();
}
}
