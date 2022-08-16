
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// taking user input from html file
		
		int Price = Integer.parseInt(request.getParameter("inputPrice"));
		String Name = request.getParameter("inputName");
		// put values in Object
		ProductDetails pd = new ProductDetails();
		
		pd.setPrice(Price);
		pd.setName(Name);

		//SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		//Session session = sessionFactory.openSession();
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		int i = (Integer) session.save(pd);
		session.getTransaction().commit();

		session.close();

		PrintWriter out = response.getWriter();
		if (i > 0)
			out.println("Record inserted successfully");
			
		else
			out.println("Record not inserted");
		
	}

}