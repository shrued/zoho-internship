import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;  

public class TryFilter implements Filter {
	public void init(FilterConfig arg0) throws ServletException {}  
    
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {  
	          
		HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
        HttpSession session = request.getSession(false);
        
	    PrintWriter out=res.getWriter();  
	    out.print("Filter invoked before");  
	          
//	    chain.doFilter(req, res);
	    if (request.getRequestedSessionId() == null
	            && request.isRequestedSessionIdValid()) {
	        response.sendRedirect(request.getContextPath() + "/error.jsp");

//	        chain.doFilter(request, response);
	    }
//	    } else {
//	        response.sendRedirect(request.getContextPath() + "/error.jsp");
////	        req.getRequestDispatcher("/error.jsp").forward(request, response);
//	    }
		chain.doFilter(req, res);

	          
	    out.print("Filter invoked after");  
	}  
	    public void destroy() {}  
}  
