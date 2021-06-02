<%@ page import ="java.sql.*" %>
<%
	String name =  request.getParameter("name");
	String gender =  request.getParameter("gender");
	String degree =  request.getParameter("degree");
	String branch =  request.getParameter("branch");
	String gradyear =  request.getParameter("gradyear");
	Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registrationform",
            "root", "root");
    Statement st = con.createStatement();
    int i = st.executeUpdate("insert into details(name, gender, degree, branch, gradyear) values ('" + name + "','" + gender + "','" + degree + "','" + branch + "','" + gradyear + "')");
    if (i > 0) {
        response.sendRedirect("done.jsp");
        } else {
        response.sendRedirect("no.jsp");
    }
%>