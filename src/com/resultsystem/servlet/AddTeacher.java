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
 * Servlet implementation class AddTeacher
 */
@WebServlet("/AddTeacher")
public class AddTeacher extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
	    String sub=request.getParameter("subject");
	    String username=request.getParameter("username");
	    String password=request.getParameter("password");
   	    int p= new DatabaseAccess().addTeacher(name,sub,username,password);
   	    if(p>0)
   	    {
   	    	out.println("<h1>Teacher Added Sucessfully.</h1>");
   	        RequestDispatcher rd=request.getRequestDispatcher("/AdminLogin.jsp");  
            rd.include(request, response);  
   	    }
   	    else
   	    {
   	    	out.println("<h1>Teacher Not Added</h1>");
   	        RequestDispatcher rd=request.getRequestDispatcher("/AddTeacher.jsp");  
            rd.include(request, response);  
   	    	
   	    }
	}

}
