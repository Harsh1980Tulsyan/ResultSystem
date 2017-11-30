package com.resultsystem.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.resultsystem.dao.DatabaseAccess;

/**
 * Servlet implementation class Test_1
 */
@WebServlet("/AddMarks")
public class AddMarks extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		//PrintWriter out=response.getWriter();
		String requeststring=request.getParameter("string");
		HttpSession s=request.getSession(false);  
		String coursecode=(String)s.getAttribute("coursecode"); 
		String svalue=request.getParameter("svalue");
		String[] words=requeststring.split("&");
		for(String w:words){  
			String[] words1=w.split("=");
			
				String roll=words1[0];
				int marks=Integer.parseInt(words1[1]);	
				int i=new DatabaseAccess().addTest1(roll,marks,coursecode,svalue);
			}  
	}
}
