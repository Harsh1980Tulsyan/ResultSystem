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
 * Servlet implementation class AddSubject
 */
@WebServlet("/AddSubject")
public class AddSubject extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String coursecode=request.getParameter("coursecode");
	    String coursename=request.getParameter("coursename");
	    String credit=request.getParameter("totalcredit");
	    int intcredit=Integer.parseInt(credit);
   	    int p= new DatabaseAccess().addSubject(coursecode,coursename,intcredit);
   	    if(p>0)
   	    {
   	    	out.println("<h1>Subject Added Sucessfully.</h1>");
   	        RequestDispatcher rd=request.getRequestDispatcher("/AdminLogin.jsp");  
            rd.include(request, response);  
   	    }
   	    else
   	    {
   	    	out.println("<h1>Subject Not Added</h1>");
   	        RequestDispatcher rd=request.getRequestDispatcher("/AddSubject.jsp");  
            rd.include(request, response);  
   	    	
   	    }
	}

}
