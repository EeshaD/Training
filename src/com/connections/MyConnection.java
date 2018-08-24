package com.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class MyConnection {
	private static Connection connection;
	
	public static Connection getConnection() {
		try {
//			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//			connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433; databaseName = TRAINING", "sa", "sa123");
//			System.out.println("connection successful!\n");
			
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:comp/env");
			DataSource dataSource = (DataSource) envContext.lookup("jdbc/TestDB");
			connection = dataSource.getConnection();
			System.out.println("got connection!");
		} catch(NamingException ne) {
			System.err.println(ne);
		} catch (SQLException sql) {
			System.err.println(sql);
		}
		return connection;
	}
	
	public static void closeConnection() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
