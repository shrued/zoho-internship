package com.login;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class AuthenticationInterceptor implements Interceptor {

	public void destroy() {}

	public void init() {}

	public String intercept(ActionInvocation actionInvocation)
			throws Exception {
		Map<String, Object> sessionAttributes = actionInvocation.getInvocationContext().getSession();
		
		User user = (User) sessionAttributes.get("USER");
		
		if(user == null) {
			return Action.LOGIN;
		} else {
			Action action = (Action) actionInvocation.getAction();
			if(action instanceof UserAware) {
				((UserAware) action).setUser(user);
			}
			return actionInvocation.invoke();
		}
	}
}

