package com.servlets.product;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	static Connection con = null;

	public static Connection getMyConnection() {
		try {

			Class.forName("com.mysql.jdbc.Driver"); 

			con = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "Wonderfu!@123");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return con;

	}

}
