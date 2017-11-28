package com.resultsystem.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.resultsystem.dao.DatabaseAccess;

/**
 * Servlet implementation class AddStudent
 */
@WebServlet("/AddStudent")
public class AddStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("studentname");
		String roll=request.getParameter("rollno");
		String dateofbirth=request.getParameter("dateofbirth");
		int p= new DatabaseAccess().addStudent(name,roll,dateofbirth);
   	    if(p>0)
   	    {
   	    	out.println("<h1>Student Added Sucessfully.</h1>");
   	        RequestDispatcher rd=request.getRequestDispatcher("/AdminLogin.jsp");  
            rd.include(request, response);  
   	    }
   	    else
   	    {
   	    	out.println("<h1>Student Not Added</h1>");
   	        RequestDispatcher rd=request.getRequestDispatcher("/AddSubject.jsp");  
            rd.include(request, response);  
   	    	
   	    }
		
	}

}
