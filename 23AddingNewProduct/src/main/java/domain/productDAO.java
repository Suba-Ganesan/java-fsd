package domain;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;


import utils.HibernateUtil;

/**
 * Servlet implementation class StudentDAO
 */
@WebServlet("/productDAO")
public class productDAO extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// reading form values
		int price = Integer.parseInt(request.getParameter("p"));
		String name = request.getParameter("n");
// put values in Object
		product pro = new product();
		pro.setPrice(price);
		pro.setName(name);
		//SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		//Session session = sessionFactory.openSession();
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		int i = (Integer) session.save(pro);
		session.getTransaction().commit();
		session.close();
		PrintWriter out = response.getWriter();
		if (i > 0)
		{
			request.setAttribute("products", pro);
			out.println("Record inserted");
			response.sendRedirect("view.jsp");
		}
		
		else
		out.println("Record not inserted");

		
	}
}
