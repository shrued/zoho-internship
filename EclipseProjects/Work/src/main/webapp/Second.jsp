<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.example.second.ReadProperties" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Second</title>
</head>
<body>
<% 
out.println(ReadProperties.getProperties("firstname")); 
out.println(ReadProperties.getProperties("lastname")); 
out.println(ReadProperties.getProperties("email")); 
%>
</body>
</html>