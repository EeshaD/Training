package com.daos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.connections.MyConnection;

public class LoginDAO {
	public boolean checkLogin(String username, String password) {
		boolean success = false;
		String getLogin = "select * from login where username = ? and password = ?";
		try {
			PreparedStatement preparedStatement = MyConnection.getConnection().prepareStatement(getLogin);
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				success = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return success;
	}
}
