package com.interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyInterceptor implements Interceptor {

	public void destroy() {}
	
	public void init() {}
	
	public String intercept(ActionInvocation invocation) throws Exception {
	    
	    System.out.println("Before");
	    
	    String result = invocation.invoke();
	    
	    System.out.println("After");
	    
	    return result;
	}
}