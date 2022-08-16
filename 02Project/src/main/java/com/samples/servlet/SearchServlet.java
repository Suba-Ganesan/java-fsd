package com.samples.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String Date = request.getParameter("date");
			String Source = request.getParameter("src");
			String Destination = request.getParameter("dest");
			int Seats = Integer.parseInt(request.getParameter("count"));

			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "Wonderfu!@123");
			PreparedStatement statement = connection.prepareStatement("select * from Flight where Date=? and Source=? and Destination=? and Seats>=?");
			statement.setString(1, Date);
			statement.setString(2, Source);
			statement.setString(3, Destination);
			statement.setInt(4, Seats);
			ResultSet rs = statement.executeQuery();
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
		
			HttpSession session = request.getSession();
			if(rs.isBeforeFirst()) {
			out.println("<table border=1>");
			out.println("<tr><th>Date</th><th>Source</th><th>Destination</th><th>FlightName</th><th>TicketPrice</th></tr>");
			while (rs.next()) {
				out.println("<tr>");
				out.print("<td>" + rs.getString("Date") + "</td>");
				out.print("<td>" + rs.getString("Source") + "</td>");
				out.print("<td>" + rs.getString("Destination") + "</td>");
				out.print("<td>" + rs.getString("FlightName") + "</td>");
				out.print("<td>" + rs.getInt("TicketPrice") + "</td>");
				out.print("<td>" +"<a href='Reg.jsp'>click here to Book Ticket</a>" + "</td>");
				session.setAttribute("onboard",rs);
				out.println("</tr>");
			}
			}
			else {
			out.println("<FONT COLOR= RED>NO MATCH FOUND</FONT>");
			out.println("\"<a href='Home.html'>Back to Homepage</a>\"");
			}
			connection.close();

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
