<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<s:form action="login">
	<s:textfield name="user" label="User Name"></s:textfield>
	<s:textfield name="password" label="Password" type="password"></s:textfield>
	<s:submit value="Login"></s:submit>
</s:form>
</body>
</html>