<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String result = (String)session.getAttribute("result");
%>
	<h2>Welcome to Login Application 
	<h4>(You are logged-in as <%=result%>)</h4>
	</h2>
	<br><br>
<%String s = "You Have Successfully Logged Out"; %>
<a href="login.jsp?logout=<%=s%>"><input type="submit" value="LogOut"></a>

</body>
</html>