package com.learn.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;


public class DBUtility {
	static String DBURL = "jdbc:mysql://localhost:3306/sakila";
	
	public static Connection getConnection() throws Exception {
		Connection conn = null;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Properties prop = new Properties();
			prop.put("user", "root");
			prop.put("password", "password");
			conn = DriverManager.getConnection(DBURL,prop);
		}catch(Exception exe){
			throw exe;
		}
		return conn;		
	}

	public static void closeConnection(Connection conn) {
		try{
			if(conn != null){
				conn.close();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
