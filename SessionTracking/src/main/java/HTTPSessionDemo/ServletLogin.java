package HTTPSessionDemo;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
        private static final long serialVersionUID = 1L;
  
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
               
                 String userId = request.getParameter("userid");
                 HttpSession session=request.getSession();  
             session.setAttribute("userid",  userId);
                          
             response.sendRedirect("dashboard");  
                
        }

        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                doGet(request, response);
        }

}
