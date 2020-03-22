package com.nttdata.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcConnection {
	
	public static void main(String[] args) throws Exception {
		Connection myConn  = null;
		Statement myStmt = null;
		ResultSet myRs = null;
	try {	
		myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "ebookshop", "localhost");
		System.out.println("Database Connection Successful ! \n");
		
		myStmt = myConn.createStatement();
		myRs = myStmt.executeQuery("select * from ebookshop");
		while (myRs.next()) {
		System.out.println(myRs.getString("Title"));
		
	}
	}
	catch (Exception exc) {
		exc.printStackTrace();
	}

}}
