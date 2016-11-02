package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/Servlets")
public class Servlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	
	public void init(ServletConfig con){
		String driver_name = con.getInitParameter("driverClassName");
		System.out.println(driver_name);
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String user = request.getParameter("uname");
		String pass = request.getParameter("pass");
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		//String correct_password = "ravi123";
		
		
		
		if(user.equals(pass))
		{
			writer.println("<html><body><h1>Welcome "+ user+"</h1></body></html>");
		}
		else{
			writer.println("<html><body><h1>Invalid Credentials</h1></body></html>");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
