package com.nttdata.jdbc1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class UpdateBooks {

	Scanner sc = new Scanner(System.in);
	int no_of_rows_updated = 0;

	Connection conUpdated = null;
	PreparedStatement pstmt = null;

	public int updateBook() {
		int Id;
		float Price;

		String update = "update books set price = ? where eid = ?";

		System.out.println("Enter books details to update");
		System.out.println("Enter book id ");
		Id = sc.nextInt();
		System.out.println("Enter book price");
		Price = sc.nextFloat();

		try {
			conUpdated = DBConnection.getDBConnection();
			pstmt = conUpdated.prepareStatement(update);

			pstmt.setFloat(1, Price);
			pstmt.setInt(2, Id);
			no_of_rows_updated = pstmt.executeUpdate();

		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return no_of_rows_updated;
	}

}
