package com.resultsystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
