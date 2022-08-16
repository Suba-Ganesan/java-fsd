package URLRewriteDemo;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


@WebServlet("/LoginServlet")
public class LogInServlet extends HttpServlet {
        private static final long serialVersionUID = 1L;
 
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                
                 String User = request.getParameter("user");
             response.sendRedirect("dashbrd?user=" + User);  
                
        }

}
