<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>	
	<s:form action="home" method="post">
	<s:textfield label="User Name" name="user"></s:textfield>
	<s:textfield label="Password" name="password"></s:textfield>
	<s:submit label="Login"></s:submit>
	</s:form>
</body>
</html>