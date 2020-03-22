package com.nttdata.jdbc;


	import java.sql.CallableStatement;
	import java.sql.Connection;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;;

	public class ShowBooks {
		Statement statement = null;
		Connection connect = null;
		ResultSet resultset = null;
		CallableStatement callstmt = null;

		public void showBooks() throws Exception {
			Ebookshop books = new Ebookshop();
			connect = books.getConnectionDB();

//			// Statement
//			statement = connect.createStatement();
//			resultset = statement.executeQuery("select * from books");
//			writeResultSet(resultset);

			 //Callable stmt
			callstmt = connect.prepareCall("{call listAllBooks()}");
			resultset=callstmt.executeQuery();
			writeResultSet(resultset);
		}

		public static void writeResultSet(ResultSet resultset) throws SQLException {
			int row = 0;
			while (resultset.next()) {
				System.out.println(
						resultset.getString("id") + " " + resultset.getString("title") + " " + resultset.getString("author")
								+ " " + resultset.getString("price") + " " + resultset.getString("qty"));
				System.out.println();
				row++;
			}
		}
	}

