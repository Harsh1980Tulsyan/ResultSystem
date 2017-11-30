package com.resultsystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpSession;

public class DatabaseAccess {
	private Connection currcon;
	
	public int addTeacher(String name,String sub,String username,String password)
	{
		int p=0;
		try
		{
		currcon=new Dbcon().getConnection();
		PreparedStatement ps=currcon.prepareStatement("insert into Add_TEACHER values(?,?,?,?)");
		ps.setString(1, name);
		ps.setString(2, sub);
		ps.setString(3, username);
		ps.setString(4, password);
		p=ps.executeUpdate();
		currcon.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		return p;
	}
	
	
	public int addSubject(String coursecode,String coursename,int credit)
	{
		int p=0;
		
		try
		{
		currcon=new Dbcon().getConnection();
		PreparedStatement ps=currcon.prepareStatement("insert into Add_SUBJECT values(?,?,?)");
		ps.setString(1, coursecode);
		ps.setString(2, coursename);
		ps.setInt(3, credit);
		p=ps.executeUpdate();
		currcon.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		return p;
	}
	
	
	
	public int addStudent( String sname,String srollno,String sdateofbirth)
	{
		int p=0;
		
		try
		{
		currcon=new Dbcon().getConnection();
		PreparedStatement ps=currcon.prepareStatement("insert into Add_STUDENT values(?,?,?)");
		ps.setString(1, sname);
		ps.setString(2, srollno);
		ps.setString(3, sdateofbirth);
		p=ps.executeUpdate();
		
		// Entering student name and roll into EC501 table
		
		PreparedStatement ps1=currcon.prepareStatement("insert into EC501(name,roll_no) values(?,?)");
		ps1.setString(1, sname);
		ps1.setString(2, srollno);
		ps1.executeUpdate();
		
		// Entering student name and roll into EC502 table
		
		PreparedStatement ps2=currcon.prepareStatement("insert into EC502(name,roll_no) values(?,?)");
		ps2.setString(1, sname);
		ps2.setString(2, srollno);
		ps2.executeUpdate();
		
		// Entering student name and roll into EC503 table
		
		PreparedStatement ps3=currcon.prepareStatement("insert into EC503(name,roll_no) values(?,?)");
		ps3.setString(1, sname);
		ps3.setString(2, srollno);
		ps3.executeUpdate();
		
		// Entering student name and roll into EC504 table
		
		PreparedStatement ps4=currcon.prepareStatement("insert into EC504(name,roll_no) values(?,?)");
		ps4.setString(1, sname);
		ps4.setString(2, srollno);
		ps4.executeUpdate();
		
		// Entering student name and roll into EC505 table
		
		PreparedStatement ps5=currcon.prepareStatement("insert into EC505(name,roll_no) values(?,?)");
		ps5.setString(1, sname);
		ps5.setString(2, srollno);
		ps5.executeUpdate();
		
		
		currcon.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		return p;
	}
	
	
	public ResultSet getTeacher()
	{
        ResultSet rs=null;
		try {
			
			currcon=new Dbcon().getConnection();
			PreparedStatement ps=currcon.prepareStatement("select * from ADD_TEACHER");
			 rs=ps.executeQuery();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return rs;
	}
	
	public ResultSet getStudent()
	{
        ResultSet rs=null;
		try {
			
			currcon=new Dbcon().getConnection();
			PreparedStatement ps=currcon.prepareStatement("select * from ADD_STUDENT");
			 rs=ps.executeQuery();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return rs;
	}
	public int addTest1( String roll,int marks, String coursecode,String svalue)
	{
		int i=0;
		try
		{
			currcon=new Dbcon().getConnection();
			PreparedStatement ps= currcon.prepareStatement("update " + coursecode + " set "+svalue+"=? where ROLL_NO=?");
			ps.setInt(1,marks);
			ps.setString(2,roll);
			i=ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return i;
	}
}
