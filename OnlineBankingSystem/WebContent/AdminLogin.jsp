<%-- 
    Document   : AdminLogin
    Created on : Feb 12, 2020, 9:29:22 PM
    Author     : sandeep sj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="a.css">
	<title></title>
</head>
<body background="blue">
<%@ include file="header.html" %>

<table>
	<tr>
		<td id = "submit"><a href="AdminLogin.jsp">Admin Login</a> </td>
		<td id = "submit"><a href="index.jsp">Customer Login</a> </td>
	</tr>
</table>
<table border="1" width="100%">

	<tr><td><center>
		
		<form method = "post" action="adminLogin">
			<img src="images/users.png">
			<h3>Admin Login</h3>
			<table>
			<tr id="registerfield1">
				<td>
					Enter Admin User Id
				</td>
				<td>
					<input type="text" name="adminId" placeholder="Enter Admin user Id">
				</td>
			</tr>
			
			<tr id="registerfield1">
				<td>
					Enter Password: 
				</td>
				<td>
					<input type="password" name="password" placeholder=" Enter password">
				</td>
			</tr>
			<tr id="registerfield1">
				<td></td>
				<td>
				<button type="submit" id = "submit">Open Account</button> or <a href="NewAccount.jsp">Create New</a>
				</td>
				</tr>
				
			</table>
		</form>
		</center>
	</td></tr>
</table>
<table border="1" width="100%">
	<tr id="footer">
		<td>
			<center><p>All Rights Are Reserved by ***********</p></center>
		</td>
	</tr>
</table>
</body>
</html>