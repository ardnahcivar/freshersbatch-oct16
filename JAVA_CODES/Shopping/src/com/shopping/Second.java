package com.shopping;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Second
 */
@WebServlet("/Second")
public class Second extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String checked_values[] = request.getParameterValues("Books");
		for(String i:checked_values){
			Books.bookBought.add(i);
			System.out.println(i);
		}
		PrintWriter writer = response.getWriter();
		writer.append("<h1>Items to be Checked Out</h1>");
		
		for(String i :Books.bookBought)
			writer.append("<li>"+i+"</li>");
		
		
		
		/*RequestDispatcher rd = request.getRequestDispatcher("final_page.html");
		rd.forward(request, response);
		*/
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
