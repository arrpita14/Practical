package com.zensar.Util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	public static Connection getCon() {
		Connection con =null;
		String driverName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/java_training";
		String dbUsername = "root";
		String dbPassword = "root";
		try {
			Class.forName(driverName);
			con = DriverManager.getConnection(url,dbUsername,dbPassword);
		}catch(Exception e) {
			System.out.println("Error "+e);
		}
		return con;
	}
}
