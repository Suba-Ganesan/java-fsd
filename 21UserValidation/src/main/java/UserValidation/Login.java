package UserValidation;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginChecker
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	/*
	 * protected void doGet(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException { String uname =
	 * request.getParameter("username"); String pswrd =
	 * request.getParameter("userPassword"); PrintWriter out = response.getWriter();
	 * if (uname.equalsIgnoreCase("suba7g@gmail.com") && pswrd.equals("123")) {
	 * out.println("You are Dashboardd"); } else
	 * out.println("Invalid Username or Password"); }
	 */

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		String uname = request.getParameter("username");
		String pswrd = request.getParameter("userPassword");
		PrintWriter out = response.getWriter();
		RequestDispatcher rd;
		if (uname.equalsIgnoreCase("suba7g@gmail.com") && pswrd.equals("123")) {
			HttpSession session = request.getSession(true);
			session.setAttribute("username", uname);
			rd = request.getRequestDispatcher("Dashboard");
			rd.forward(request, response);
		} else {
			out.println("Invalid UserID or Password");
			rd = request.getRequestDispatcher("form.html");
			rd.include(request, response);
		}
	}
}
