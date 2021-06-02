import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/errorHandler")
public class MyHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		processError(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		processError(request, response);
	}

	private void processError(HttpServletRequest request,
			HttpServletResponse response) throws IOException {

		Throwable throwable = (Throwable) request.getAttribute("javax.servlet.error.exception");
		Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
		String servletName = (String) request.getAttribute("javax.servlet.error.servlet_name");
		
		if (servletName == null) {
			servletName = "Unknown";
		}
		
		String requestUri = (String) request.getAttribute("javax.servlet.error.request_uri");
		
		if (requestUri == null) {
			requestUri = "Unknown";
		}
		
	      response.setContentType("text/html");
	 
	      PrintWriter out = response.getWriter();
	      out.write("<html><head><title>Exception/Error Details</title></head><body>");
	      if(statusCode != 500) {
	    	  out.write("<h3>Error Details</h3>");
	    	  out.write("Status Code:"+statusCode+"<br />");
	    	  out.write("Requested URI:"+requestUri);
	      } else {
	    	  out.write("<h3>Exception Details</h3>");
	    	  out.write("Servlet Name:"+servletName+"<br />");
	    	  out.write("Exception Name:"+throwable.getClass().getName()+"<br />");
	    	  out.write("Requested URI:"+requestUri+"<br />");
	    	  out.write("Exception Message:"+throwable.getMessage()+"<br />");
	      }
	      
	      out.write("<br><br>");
	      out.write("<a href=\"index.html\">Home Page</a>");
	      out.write("</body></html>");
	}
}

