<%-- 
    Document   : AdminDeleteAccount
    Created on : Feb 12, 2020, 2:11:27 PM
    Author     : sandeep sj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="authenticate.jsp"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="a.css">
<title></title>
</head>
<body background="blue">
	<%@ include file="header.html"%>
	<table border="1" width="100%">

		<tr>
			<td id="navtd"><%@ include file="navigator2.html"%>
			</td>
			<td>
				<form method = "post" action = "AdminDeleteAccount">
					<input type="text" name="accno" placeholder="Enter Account Number">
					<button type="submit" id="submit">Delete</button>
				</form>
			</td>
		</tr>
	</table>
	<table border="1" width="100%">
		<tr id="footer">
			<td>
				<center>
					<p>All Rights Are Reserved by ***********</p>
				</center>
			</td>
		</tr>
	</table>
</body>
</html>