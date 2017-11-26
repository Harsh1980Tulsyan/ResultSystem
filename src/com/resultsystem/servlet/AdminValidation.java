package com.resultsystem.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdminValidation
 */
@WebServlet("/AdminValidation")
public class AdminValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		if(username.equals("harsh@123") && password.equals("harsh123"))
		{
			 RequestDispatcher rd=request.getRequestDispatcher("/AdminLogin.jsp");  
	            rd.forward(request, response);  
			
		}
		else
		{
			out.println("<h3>Enter valid Username and Password</h3>");
			RequestDispatcher rd=request.getRequestDispatcher("/AdminValidate.jsp");  
            rd.include(request, response);  
		}
		
	}

}
