package com.Servlets;
import java.sql.SQLException;
import java.util.List;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.database.Dao;

public class FlightList extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String from=request.getParameter("src");
		String to=request.getParameter("dest");
		String departure=request.getParameter("date");
		
		try {
			Dao dao = new Dao();
			List<String[]> flights=dao.getAvailableFlights(from, to, departure);			
			HttpSession session=request.getSession();
			session.setAttribute("flights", flights);
			RequestDispatcher rd = request.getRequestDispatcher("UserRegistration");
	        rd.include(request, response);
		
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		response.sendRedirect("FlightList.jsp");
	}	
}


