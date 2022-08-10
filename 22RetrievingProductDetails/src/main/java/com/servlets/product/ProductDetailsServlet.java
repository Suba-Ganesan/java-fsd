package com.servlets.product;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Product
 */
@WebServlet("/ProductDetailsServlet")
public class ProductDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProductDetailsServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			// Call Connection Method
			PrintWriter out = response.getWriter();
			Connection con = DatabaseConnection.getMyConnection();
			String id = request.getParameter("Id");
			// Write sql command
			String query = "select * from productdetails where ID=" + id;

			// to execute query create object of Statement
			Statement sta = con.createStatement();
			// get ResultSet
			ResultSet rs = sta.executeQuery(query);
			// next method checks for nextrecord

			// To read values from ResultSet
			if (rs.next()) {
				out.println("<table border=1>");
				out.println("<tr><th>ID</th><th>Name</th><th>Category</th><th>Price</th></tr>");
				out.println("<tr>");
				out.print("<td>" + rs.getInt("ID") + "</td>");
				out.print("<td>" + rs.getString("Name") + "</td>");
				out.print("<td>" + rs.getString("Category") + "</td>");
				out.print("<td>" + rs.getInt("Price") + "</td>");
				out.println("</tr>");
				out.println("</table>");
			} else {
				out.println("Invalid Product ID");
			}
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

	}

}
