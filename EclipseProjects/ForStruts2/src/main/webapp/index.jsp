<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Enter Name</title>
</head>
<body>
<s:form action="name">  
	<s:textfield name="firstname" label="First Name" /> 
	<s:textfield name="lastname" label="Last Name" />
	<s:submit name="Send" />  
</s:form>  
<!-- <form action = "name">
    <label for = "firstname">First Name</label>
    <input type = "text" name = "firstname"/>
    <br/>
    <label for = "lastname">Last Name</label>
    <input type = "text" name = "lastname"/>
    <br />
    <input type = "submit" value = "Send"/>
</form> -->
</body>
</html>