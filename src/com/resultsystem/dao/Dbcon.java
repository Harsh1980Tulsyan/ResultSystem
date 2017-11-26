package com.resultsystem.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbcon {
	
	Connection con;
	
	public Connection getConnection()
	{
		
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			try
			{
				 con=DriverManager.getConnection(  
			        		"jdbc:oracle:thin:@localhost:1521:xe","ResultSystem","resultsystem");  
				
			}
			
			catch(SQLException ex)
			{
				ex.printStackTrace();
			}
			
			
		}
		
		
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		return con;
	}

}
