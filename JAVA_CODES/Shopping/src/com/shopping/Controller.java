package com.shopping;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Books.user = request.getParameter("user_name");
		Books.pass = request.getParameter("passwd");
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		
		if(Books.user.equals(Books.pass))
		{
			/*HttpSession session = request.getSession(true);
			if(session.isNew()){
				session.setAttribute("HITS", Books.hits);
			}
			else{
				Books.hits = (Integer)session.getAttribute("HITS");
				Books.hits++;
				session.setAttribute("HITS", Books.hits);
			*/	
			writer.println("<html><body><h1>Welcome "+ Books.user+"</h1></body></html>");
			RequestDispatcher rd = request.getRequestDispatcher("second.html");
			rd.forward(request, response);
			
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
