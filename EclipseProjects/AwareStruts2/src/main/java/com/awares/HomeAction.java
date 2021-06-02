package com.awares;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.CookiesAware;
import org.apache.struts2.interceptor.PrincipalAware;
import org.apache.struts2.interceptor.PrincipalProxy;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAware,
		ApplicationAware, CookiesAware, RequestAware, ServletRequestAware,
		ServletResponseAware, PrincipalAware {

	private static final long serialVersionUID = 1L;

	public String execute() {
		System.out.println("Request Method: " + request.getMethod());
		System.out.println("Using HTTPS?: " + principalProxy.isRequestSecure());
		System.out.println("Request Cookies:" + requestCookies);

		response.addCookie(new Cookie("user", "Meredith"));
		if (requestCookies == null)
			requestCookies = new HashMap<String, String>();
		requestCookies.put("test", "test");

		System.out.println("Session Attributes: " + sessionAttributes);

		HttpSession mySession = request.getSession();
		mySession.setAttribute("user", "Meredith");

		sessionAttributes.put("test", "Test");

		System.out.println("Context Attributes: " + contextAttributes.get("user"));

		contextAttributes.put("user", "Meredith");

		System.out.println("Request Attributes: " + requestAttributes);
		return SUCCESS;
	}

	private PrincipalProxy principalProxy = null;
	private HttpServletRequest request = null;
	private HttpServletResponse response = null;
	private Map<String, Object> requestAttributes = null;
	private Map<String, Object> sessionAttributes = null;
	private Map<String, Object> contextAttributes = null;
	private Map<String, String> requestCookies = null;

	public void setPrincipalProxy(PrincipalProxy principalProxy) {
		this.principalProxy = principalProxy;
	}

	public void setServletResponse(HttpServletResponse httpServletResponse) {
		this.response = httpServletResponse;
	}

	public void setServletRequest(HttpServletRequest httpServletRequest) {
		this.request = httpServletRequest;
	}

	public void setRequest(Map<String, Object> requestAttr) {
		this.requestAttributes = requestAttr;
	}

	public void setCookiesMap(Map<String, String> cookies) {
		this.requestCookies = cookies;
	}

	public void setApplication(Map<String, Object> applicationAttributes) {
		this.contextAttributes = applicationAttributes;
	}

	public void setSession(Map<String, Object> sessionAttr) {
		this.sessionAttributes = sessionAttr;
	}

	private String user;
	private String password;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}

