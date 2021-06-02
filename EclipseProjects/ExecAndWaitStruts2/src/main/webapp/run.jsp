<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:form action="ExecuteTask">
<s:textfield name="processingTime" label="Enter seconds to execute task"></s:textfield>
<s:token />
<s:submit name="submit" label="Run" align="center"></s:submit>
</s:form>
</body>
</html>