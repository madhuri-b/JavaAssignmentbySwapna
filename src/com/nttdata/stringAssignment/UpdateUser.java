package com.nttdata.stringAssignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateUser {
	Scanner sc = new Scanner (System.in);
	public int no_of_rows_updated=0;
	Connection con =null;
	PreparedStatement pstmt =null;
	public static void main(String[] args)  throws Exception{
		
	}
	private void getConnectionDB() throws Exception{
		try {
			String url = "jdfc:mysql://localhost:3306/ebookshop";
			String name = "madhuri";
			String password = "nttdata123!";
			 con = DriverManager.getConnection(url, name, password);
			if (con == null) {
				System.out.println("connection not established");}
				else {
					System.out.println("connection established");
				}
		}catch (Exception e) {
			throw e;
		}
	}
				
				
	public int updateUser()
	{
		int userId;
		String userName;
		return();
		
	}

}
