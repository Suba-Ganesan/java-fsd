package TrackCookie;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;



@WebServlet("/Login")
public class Login extends HttpServlet {
        private static final long serialVersionUID = 1L;
       
  
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                
                 Cookie userId = new Cookie("userid", request.getParameter("userid"));
                 response.addCookie(userId);
              response.sendRedirect("dashboard");  
                
        }

   }
