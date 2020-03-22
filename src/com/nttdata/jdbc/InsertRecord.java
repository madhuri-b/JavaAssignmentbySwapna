package com.nttdata.jdbc;
import java.sql.*;

public class InsertRecord {
	
public static void main(String[] args) throws SQLException {
		
		Connection myConn  = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		String dbUrl = "jdbc:mysql://localhost:3306/ebookshop";
		String user = "ebookshop";
		String pwd = "localhost";
		try {
			
		
		    myConn  = DriverManager.getConnection(dbUrl, user, pwd);
		    myStmt = myConn.createStatement();
		    System.out.println("inserting a new book to database\n");
		    
		int rowsAffected = myStmt.executeUpdate(  
				"insert into ebookshop "+ "(Id, Title, Author, Price, Qty)" +
		         "values" +
			     "('1006','CoreJava', 'James', 66.66, 12)");
		myRs = myStmt.executeQuery("select * from ebookshop");
		while (myRs.next()) {
			System.out.println(myRs.getString("Title") + ", " + myRs.getString("Author"));

		}

		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
	finally {
		if (myRs != null) {
			myRs.close();
		}
	}
		}
   }
	
		        
					
		
		
	
	
	


