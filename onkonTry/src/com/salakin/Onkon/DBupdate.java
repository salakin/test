package com.salakin.Onkon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBupdate {

	String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	String DB_URL = "jdbc:mysql://localhost:3306/onkon";//tor tar port koto ? change kori nai ok

	// Database credentials
	String USER = "root";
	String PASS = "";
	public  void Update(String UserName , String Password) {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		Statement stmt = null;

		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			stmt = conn.createStatement();
			String sql;
			// nicher line er userinfo er jaygay tor table er name dibi
			sql = "INSERT INTO user(UserName,Password)" + " VALUES ('" + UserName
					+ "','" + Password + " )";

			stmt.executeUpdate(sql);

			stmt.close();
			conn.close();

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}

		}

	}

}
