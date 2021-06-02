import java.io.IOException;  
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class TryServlet extends HttpServlet {  
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
  
      response.setContentType("text/html");  
      PrintWriter out = response.getWriter();  
      
      HttpSession session = request.getSession(true);

      out.println("<br /> <br /> <b> Servlet </b> <br />" );

      boolean sessionInfo = session.isNew();	
      out.println("Is this a new session = " + sessionInfo);
      out.println("<br/> ");
      out.println("Session ID = " + session.getId());
      out.println("<br/> ");
      out.println("This session was created = " + new Date(session.getCreationTime()));
      out.println("<br/> ");
      out.println("Maximum time for which this session can be inactive = " + session.getMaxInactiveInterval() + " seconds");
      out.println("<br/>  <br/>");   
    }  
}  