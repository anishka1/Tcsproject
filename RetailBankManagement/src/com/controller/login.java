package com.controller;

import java.io.IOException;
//import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import com.dao.dbManager;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	
	public login()
	{
		super();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		
		String uname = request.getParameter("uname");
	    String pass = request.getParameter("pass");
	
	   
	    
		if(uname.equals("admin") && pass.equals("admin"))
		{
			 System.out.print("Welcome, "+uname);  
			HttpSession session = request.getSession();
			session.setAttribute("UserName",uname);	
			
			response.sendRedirect("welcome.jsp");
		}
		else
		{
			 System.out.print("Sorry, username or password incorrect!");  
			//response.getRe("login.jsp");
			 //response.getRe
		}
		
	}
}
		
		
//		dbManager db = new dbManager();
//		try {
//			Connection conn = db.getConnection();
//			if(conn != null)
//			{
//				String uname = request.getParameter("uname");
//				String pass = request.getParameter("pass");
//			
//				if(uname.equals("admin") && pass.equals("admin"))
//				{
//					HttpSession session = request.getSession();
//					session.setAttribute("UserName",uname);
//					
//					response.sendRedirect("welcome.jsp");
//				}
//				else
//				{
//					response.sendRedirect("login.jsp");
//				}
//			}
//		} 
//		catch (ClassNotFoundException e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		
