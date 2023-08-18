<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body background="loginImg.jpg">

<h1 style="text-align: center;color: blue;">WELCOME TO DIGIT</h1>
<div style="text-align:center">
<form method="post" action="./filter">
	<table align="center">
		<tr style="color:yellow">
			<th>Username</th>
			<td><input type="text" name="name"/></td>
			<td>${username_error_msg}</td>
			
		</tr>
		
		<br/>
	<tr style="color:yellow">
			<th>Password</th>
			<td><input type="password" name="pass"/></td>
			<td>${pass_error_msg}</td>
			
		</tr>
		<tr>
			<th></th>
			<td><input type="submit" value="login"/></td>
		</tr>
	</table>
	
</form>
</div>


</body>
</html>