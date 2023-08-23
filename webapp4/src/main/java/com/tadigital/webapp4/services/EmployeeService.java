package com.tadigital.webapp4.services;

import com.tadigital.com.webapp4.user.entity.Entity;
import com.tadigital.webapp4.dao.EmployeeDao;

public class EmployeeService {

	private EmployeeDao employeeDao = new EmployeeDao();
	
	public Entity signInEmployee(String employeeMail, String password) {
		
		return employeeDao.signInEmployee(employeeMail, password);
	}
}
