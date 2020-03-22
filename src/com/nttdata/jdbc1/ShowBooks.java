package com.nttdata.jdbc1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class ShowBooks {

	Scanner sc = new Scanner(System.in);

	Connection conUpdated = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public ResultSet listAllBooks() {
		int Id;

		String selectallbook = "select * from books";

		try {
			conUpdated = DBConnection.getDBConnection();
			pstmt = conUpdated.prepareStatement(selectallbook);
			rs = pstmt.executeQuery();

		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rs;
	}
}
