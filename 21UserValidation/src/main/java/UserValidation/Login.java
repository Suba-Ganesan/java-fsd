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

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname = request.getParameter("username");
		String pswrd = request.getParameter("userPassword");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		RequestDispatcher rd;
		
		if (uname.equalsIgnoreCase("suba7g@gmail.com") && pswrd.equals("123")) {
			HttpSession session = request.getSession();
			session.setAttribute("username", uname);
			rd = request.getRequestDispatcher("Dashboard");
			rd.forward(request, response);
		} else {
			rd = request.getRequestDispatcher("form.html");
			rd.include(request, response);
			out.println("<h3><FONT COLOR= RED>Invalid UserID or Password</h3>");
		}
	}
}
