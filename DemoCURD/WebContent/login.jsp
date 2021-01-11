<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<h1>Login page</h1>
	<form action="login?RequestAction=login" method="post">
		<table>
			<tr>
				<td>Username:</td>
				<td><input type="text" name="user"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="pass"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value='Login'></td>
			</tr>
		</table>	
	</form>
			<%String s = (String)request.getAttribute("result"); %>	
			<%if("fail".equals(s)) {%>
				<h5 style="color:red">*Incorrect Username or Password</h5>
			<%}%>
	
</body>

</html>