package com.resultsystem.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.resultsystem.dao.DatabaseAccess;

/**
 * Servlet implementation class TeacherValidation
 */
@WebServlet("/TeacherValidation")
public class TeacherValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("tname");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		try
		{
		ResultSet rs=new DatabaseAccess().getTeacher();
		while(rs.next())
		{
			if(rs.getString(1).equals(name))
			{
				if(rs.getString(3).equals(username) && rs.getString(4).equals(password))
				{
					HttpSession session=request.getSession();  
					session.setAttribute("coursecode",rs.getString(5));
					 RequestDispatcher rd=request.getRequestDispatcher("/WelcomeTeacher.jsp");  
			            rd.forward(request, response);  
				}
				else
				{
					out.println("<h3>Enter valid Username and Password</h3>");
					RequestDispatcher rd=request.getRequestDispatcher("/TeacherLogin.jsp");  
		            rd.include(request, response);  
				}
				
			}
		}
		}
		
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		
	}

}
