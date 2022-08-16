package com.Servlets;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/UserRegistration")
public class UserRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String age=request.getParameter("age");
		String name = request.getParameter("name");
		String phno = request.getParameter("phno");
		String adno = request.getParameter("adno");

		HashMap<String, String> user = new HashMap<>();
		user.put("email", email);
		user.put("age", age);
		user.put("name", name);
		user.put("phno", phno);
		user.put("adno", adno);
		HttpSession session=request.getSession();
		session.setAttribute("user",user);
		
		response.sendRedirect("FinalTicket.jsp");
	}
}
