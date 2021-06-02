package com.register;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;  


public class FormFilter implements Filter {
//	Person personBean;

	public void init(FilterConfig filterConfig) throws ServletException {}

	public void doFilter(ServletRequest request, ServletResponse response,  
		    FilterChain chain) throws IOException, ServletException {  
		PrintWriter out = response.getWriter();
		              
        String firstName = request.getParameter("personBean.firstName");
        String lastName = request.getParameter("personBean.lastName");
        
        System.out.println(firstName + lastName);

//		if ( personBean.getFirstName().length() == 0 ) {	
//		      request.setAttribute("firstName", "First name is required.");
//	            out.print("<p id='errMsg' style='color: red; font-size: larger;'>Username Or Password Is Invalid. Please Try Again ....!</p>");
//		}	
//		else if ( personBean.getLastName().length() == 0 ) {	
//	      request.setAttribute("lastName", "Last name is required.");
//          out.print("<p id='errMsg' style='color: red; font-size: larger;'>Username Or Password Is Invalid. Please Try Again ....!</p>");
//		}	
        if (firstName.length() == 0 || lastName.length() == 0) {
            out.print("<p style='color: red;'>Field cannot be empty.</p>");
        } 
        else {
     
            chain.doFilter(request, response); 
        }

    }

	public void destroy() {}  

}
