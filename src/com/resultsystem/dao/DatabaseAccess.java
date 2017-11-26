package com.resultsystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DatabaseAccess {
	private Connection currcon;
	String name,sub,username,password,coursecode,coursename,sname,srollno,sdateofbirth;
	int credit;
	public  DatabaseAccess(String name,String sub,String username,String password)
	{
		this.name=name;
		this.sub=sub;
		this.username=username;
		this.password=password;
	}
	public  DatabaseAccess(String coursecode,String coursename,int credit)
	{
		this.coursecode=coursecode;
		this.coursename=coursename;
		this.credit=credit;
	}
	
	public  DatabaseAccess(String sname,String srollno,String sdateofbirth)
	{
		this.sname=sname;
		this.srollno=srollno;
		this.sdateofbirth=sdateofbirth;
	}
	
	
	
	
	
	public int addTeacher()
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
	
	
	public int addSubject()
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
	
	
	
	public int addStudent()
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
