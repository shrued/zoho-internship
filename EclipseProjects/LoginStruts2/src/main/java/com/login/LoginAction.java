package com.login;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements SessionAware, ModelDriven<User>{

	private static final long serialVersionUID = -3369875299120377549L;
	private SessionMap<String,Object> sessionMap;  

	
	public void setSession(Map<String, Object> map) {  
	    sessionMap=(SessionMap)map;  
	}  

	public String execute(){
		if("admin".equals(user.getPassword())){
			user.setUserName(user.getUser());
			sessionMap.put("USER", user);
			return SUCCESS;
		}
		return INPUT;
	}
	
	public String logout(){  
	    if(sessionMap!=null){  
	        sessionMap.invalidate();  
	    }  
	    return "success";  
	}  
	
	private User user = new User();
	private Map<String, Object> sessionAttributes = null;

	public User getModel() {
		return user;
	}
}

