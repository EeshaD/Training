package com.daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.connections.MyConnection;
import com.pojo.Employee;

public class EmployeeDAO {
	public List<Employee> employees = new ArrayList<>();
	public List<Employee> getAllEmployees() {
		String allEmployees = "select * from employee;";
		try {
			Connection connection = MyConnection.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(allEmployees);
			while(resultSet.next()) {
				Employee employee = new Employee();
				employee.setEmpId(resultSet.getInt(1));
				employee.setName(resultSet.getString(2));
				employee.setSalary(resultSet.getInt(3));
				employees.add(employee);
			}
		} catch(SQLException sql) {
			sql.printStackTrace();
		}
		return employees;
	}
}
