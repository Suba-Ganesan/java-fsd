package com.servlets.product;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProductDetailsServlet")
public class ProductDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			String id = request.getParameter("Id");
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "Wonderfu!@123");
			
			Statement stmt=connection.createStatement();
			String query = "select * from productdetails where ID=" + id;
			ResultSet rs=stmt.executeQuery(query);
			if(rs.isBeforeFirst()) {
				out.println("<table border=1>");
				out.println("<tr><th>ID</th><th>Name</th><th>Category</th><th>Price</th></tr>");
				while(rs.next()) {
				out.println("<tr>");
				out.print("<td>" + rs.getInt("ID") + "</td>");
				out.print("<td>" + rs.getString("Name") + "</td>");
				out.print("<td>" + rs.getString("Category") + "</td>");
				out.print("<td>" + rs.getInt("Price") + "</td>");
				out.println("</tr>");
	
				}
				out.println("</table>");
			} else {
				out.println("<FONT COLOR= RED>Invalid Product ID");
			}
			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
