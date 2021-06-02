package com.register;

import com.opensymphony.xwork2.ActionSupport;

public class Register extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	
	private Person personBean;

	
	public String execute() throws Exception {		
		return SUCCESS;		
	}
	
//	public void validate() {	
//		if ( personBean.getFirstName().length() == 0 ) {	
//			addFieldError( "personBean.firstName", "First name is required." );			
//		}	
//		if ( personBean.getLastName().length() == 0 ) {	
//			addFieldError( "personBean.lastName", "Last name is required." );			
//		}	
//	}
	
	public Person getPersonBean() {		
		return personBean;		
	}
	
	public void setPersonBean(Person person) {	
		personBean = person;	
	}
}