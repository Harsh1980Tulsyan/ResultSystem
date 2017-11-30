package com.resultsystem.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.resultsystem.dao.DatabaseAccess;

/**
 * Servlet implementation class StudentValidation
 */
@WebServlet("/StudentValidation")
public class StudentValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub\
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String rollno=request.getParameter("rollno");
		try
		{
		ResultSet r=new DatabaseAccess().getStudent();
		boolean flag=false;
        while(r.next())
        {
        	if(r.getString(1).equals(name))
        	{
        		flag=true;
        		
        	if(r.getString(1).equals(name) && r.getString(2).equals(rollno))
        	{
        		HttpSession session=request.getSession();  
				session.setAttribute("rollno",r.getString(2));
        		RequestDispatcher rd=request.getRequestDispatcher("FinalResult.jsp");  
	            rd.forward(request, response);  
        	}
        	
        	else
        	{
        		out.println("<h3>Enter Valid Rollno</h3>");
    			RequestDispatcher rd=request.getRequestDispatcher("/StudentLogin.jsp");  
                rd.include(request, response);
        		
        	}
        	}
        }
        
        if(flag==false)
        {
        	out.println("<h3>Enter Valid Name</h3>");
			RequestDispatcher rd=request.getRequestDispatcher("/StudentLogin.jsp");  
            rd.include(request, response);
        	
        }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	

}
