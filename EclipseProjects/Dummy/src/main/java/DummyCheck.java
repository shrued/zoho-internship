

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DummyCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public DummyCheck() {}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		InputStream inputStream=DummyCheck.class.getClassLoader().getResourceAsStream("config.properties");
		Properties myproperties = new Properties();

		myproperties.load(inputStream);
		
		out.println("<title>Third</title>");
		
		out.print("<html><body>");
		out.println("<p>");
		out.println(myproperties.getProperty("firstname"));
		out.println("</p><p>");
		out.println(myproperties.getProperty("lastname"));
		out.println("</p>");
		out.print("</body></html>");
}

}
