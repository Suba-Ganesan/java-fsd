package URLRewriteDemo;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;



@WebServlet("/Dashboard")
public class Dashboard extends HttpServlet {
        private static final long serialVersionUID = 1L;
      
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            
            String User = request.getParameter("user");
            if (User == null ) {
                out.println("No UserId was found in the URL.<br>");
            } else {
                out.println("UserId obtained from URL Rewriting:" + User + "<br>");
            }
            out.println("</body></html>");

        }


}
