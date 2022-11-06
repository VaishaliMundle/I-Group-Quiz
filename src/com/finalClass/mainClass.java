package com.finalClass;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

import com.getQuestionFromMysql.Questionset;
import com.jdbcConnection.DisplayData;
import com.jdbcConnection.JdbcConnection;
import com.jdbcConnection.UserDetailsAdd;
import com.mysql.jdbc.Connection;

public class mainClass {
	public static void main(String[] args) {
		System.out.println("*********** WELCOME TO JAVA QUIZ **********");
		UserDetailsAdd.AddDetails();
		
		//Questionset.retriveData();
		System.out.println(" ");
		DisplayData.displayData();
	}

}
