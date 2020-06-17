package com.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class dbManager
{
	public Connection getConnection() throws ClassNotFoundException
	{
		String url = "jdbc:mysql://localhost:3306/mydb";
		String user = "root";
		String password = "0";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url,user,password);
			return conn;
			
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
			return null;
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			return null;
			
		}
		
	}

}
