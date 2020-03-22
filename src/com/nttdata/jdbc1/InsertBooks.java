package com.nttdata.jdbc1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;



public class InsertBooks {
	Scanner sc = new Scanner(System.in);
	PreparedStatement pstmt = null;
	Connection con = null;

	public int addNewBook() {
		int noofrowsinserted = 0;
		int Id;
		String Title;
		String Author;
		float Price;
		int Qty;
		System.out.println("Enter the details to enter the  new book");
		System.out.println("enter book id");
		Id = sc.nextInt();
		System.out.println("enter book title");
		Title = sc.next();
		System.out.println("enter author name");
		Author = sc.next();
		System.out.println("enter price of book");
		Price = sc.nextFloat();
		System.out.println("enter quantity of book");
		Qty = sc.nextInt();

		try {

			String addBook = "insert into books values (?,?,?,?,?);";
			con = DBConnection.getDBConnection();
			pstmt = con.prepareStatement(addBook);

			pstmt.setInt(1, Id);
			pstmt.setString(2, Title);
			pstmt.setString(3, Author);
			pstmt.setFloat(4, Price);
			pstmt.setInt(5, Qty);

			noofrowsinserted = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return noofrowsinserted;
	}

}
