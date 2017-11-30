package com.resultsystem.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.resultsystem.dao.DatabaseAccess;
import com.resultsystem.dao.Dbcon;

/**
 * Servlet implementation class CalculateGrade
 */
@WebServlet("/CalculateGrade")
public class CalculateGrade extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession(false);
		String coursecode=(String)session.getAttribute("coursecode");
		try {
			Connection c=new Dbcon().getConnection();
			PreparedStatement ps=c.prepareStatement("select * FROM "+coursecode+"");
			ResultSet rs=ps.executeQuery();
			int sum;
			while(rs.next())
			{
				
				sum=rs.getInt(3)+rs.getInt(4)+rs.getInt(5)+rs.getInt(6)+rs.getInt(7)+rs.getInt(8);
				if(sum>=90)
				{
					PreparedStatement ps1=c.prepareStatement("update " + coursecode + " set GRADE=? where ROLL_NO=?");
					ps1.setString(1, "O");
					ps1.setString(2, rs.getString(2));
					ps1.executeUpdate();
				}
				else if(sum>=80)
				{
					PreparedStatement ps1=c.prepareStatement("update " + coursecode + " set grade=? where ROLL_NO=?");
					ps1.setString(1, "A");
					ps1.setString(2, rs.getString(2));
					ps1.executeUpdate();
				}
				else if(sum>=70)
				{
					PreparedStatement ps1=c.prepareStatement("update " + coursecode + " set grade=? where ROLL_NO=?");
					ps1.setString(1, "B");
					ps1.setString(2, rs.getString(2));
					ps1.executeUpdate();
				}
				else if(sum>=60)
				{
					PreparedStatement ps1=c.prepareStatement("update " + coursecode + " set grade=? where ROLL_NO=?");
					ps1.setString(1, "C");
					ps1.setString(2, rs.getString(2));
					ps1.executeUpdate();
				}
				else if(sum>=50)
				{
					PreparedStatement ps1=c.prepareStatement("update " + coursecode + " set grade=? where ROLL_NO=?");
					ps1.setString(1, "D");
					ps1.setString(2, rs.getString(2));
					ps1.executeUpdate();
				}
				else if(sum>=40)
				{
					PreparedStatement ps1=c.prepareStatement("update " + coursecode + " set grade=? where ROLL_NO=?");
					ps1.setString(1, "E");
					ps1.setString(2, rs.getString(2));
					ps1.executeUpdate();
				}
				else if(sum>=35)
				{
					PreparedStatement ps1=c.prepareStatement("update " + coursecode + " set grade=? where ROLL_NO=?");
					ps1.setString(1, "P");
					ps1.setString(2, rs.getString(2));
				}
				else if(sum<35)
				{
					PreparedStatement ps1=c.prepareStatement("update " + coursecode + " set grade=? where ROLL_NO=?");
					ps1.setString(1, "F");
					ps1.setString(2, rs.getString(2));
					ps1.executeUpdate();
				}
				
				
			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		RequestDispatcher rd=request.getRequestDispatcher("/CalculateGrade.jsp");  
	    rd.forward(request, response);  
		
		
	}

}
