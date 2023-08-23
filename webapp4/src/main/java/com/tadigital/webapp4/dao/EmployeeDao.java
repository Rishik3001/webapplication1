package com.tadigital.webapp4.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.tadigital.com.webapp4.user.entity.Entity;


public class EmployeeDao {
	private static final String URL = "jdbc:mysql://db4free.net:3306/rishik3001";
	private static final String USERNAME = "rishik3001";
	private static final String PASSWORD = "rishikreddy";
	private static Connection con = null;
	private Statement st = null;
	private ResultSet rs = null;
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public Entity signInEmployee(String employeeMail, String password) {
		Entity employee = new Entity();
		
		String query = "SELECT * FROM todo_signup_details WHERE email='" + employeeMail + "' AND password='" + password + "'";
		
		try {
			st = con.createStatement();
			rs = st.executeQuery(query);
			
			// i have found the record
			if (rs.next()) {
				employee.setEmailId(employeeMail);
				employee.setPassword(password);
				employee.setEmployeeName(rs.getString(2));
				
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return employee;
	}
}
