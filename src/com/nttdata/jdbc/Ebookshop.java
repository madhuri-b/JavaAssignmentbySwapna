package com.nttdata.jdbc;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.Statement;
	import java.util.Scanner;
    import javax.swing.JTable;

    public class Ebookshop { 
		Connection connect = null;
		Statement statement = null;
		ResultSet resultset = null;
		PreparedStatement pstmt = null;

		
		private static Object request;
		static JTable myTable;

		public static void main(String[] args) throws Exception {
			Ebookshop b = new Ebookshop();
			b.enterSelection();
		}

		public Connection getConnectionDB() throws Exception {
			try {
				String url = "jdbc:mysql://localhost:3306/ebookshop";
				String name = "ebookshop";
				String password = "localhost";
				connect = DriverManager.getConnection(url, name, password);
				if (connect == null) {
					System.out.println("Connection not established!");
				} else {
					System.out.println("Connected to db..");
				}
				return connect;
			} catch (Exception e) {
				throw e;
			}
		}

		private void enterSelection() throws Exception {
			Scanner sc = new Scanner(System.in);

			System.out.println("1.Show Books");
			System.out.println("2.Show Books by Id");
			System.out.println("3.Insert Books");
//			System.out.println("4.Update Books");
//			System.out.println("5.Delete Books");
			System.out.println("6.Exit");
			System.out.println("Enter your choice: ");

			int choice = sc.nextInt();
			switchCase(choice);
			// return choice;
		}

		private void switchCase(int ch) throws Exception {
			switch (ch) {
			case 1:
				ShowBooks showBooks = new ShowBooks();
				showBooks.showBooks();
				enterSelection();
				break;
			case 2:
				ShowBooksById showBooksById = new ShowBooksById();
				showBooksById.showBooksById();
				enterSelection();
				break;
			case 3:
				InsertBook insertBooks = new InsertBook();
				insertBooks.bookInsert();
				enterSelection();
				break;
//			case 4:
//				UpdateBooks updateBooks = new UpdateBooks();
//				updateBooks.bookUpdate();
//				enterSelection();
//				break;
//			case 5:
//				DeleteBooks deleteBooks = new DeleteBooks();
//				deleteBooks.bookDelete();
//				enterSelection();
//				break;
			case 6:
				System.exit(1);
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
		}
	}

	

	