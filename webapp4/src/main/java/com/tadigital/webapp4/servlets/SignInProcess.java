package com.tadigital.webapp4.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tadigital.com.webapp4.user.entity.Entity;
import com.tadigital.webapp4.services.EmployeeService;

/**
 * Servlet implementation class SignInProcess
 */
public class SignInProcess extends HttpServlet {
	
	private EmployeeService employeeService = new EmployeeService();
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher requestDispatcher = null;
		
		String employeeMail = request.getParameter("email");
		String password = request.getParameter("pwd");
		
		Entity employeeSignInDetails = employeeService.signInEmployee(employeeMail, password);
		
		if(employeeSignInDetails != null) {
			HttpSession session = request.getSession();
			session.setAttribute("MAIL",employeeSignInDetails);
			
			requestDispatcher = request.getRequestDispatcher("./basic.jsp");
			requestDispatcher.forward(request, response);
		}
		else {
			request.setAttribute("LOGINSTATUS", "failed");
			
			requestDispatcher = request.getRequestDispatcher("./index.jsp");
			requestDispatcher.forward(request, response);
		}
		
		System.out.println(employeeSignInDetails.getEmailId());
		System.out.println(employeeSignInDetails.getPassword());
	}

}