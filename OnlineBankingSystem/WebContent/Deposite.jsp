<%-- 
    Document   : Deposite
    Created on : Feb 12, 2020, 2:12:36 PM
    Author     : sandeep sj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="userAuthenticate.jsp"%>
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
			<td id="navtd"><%@ include file="navigator1.html"%>
			</td>
			<td>
				<form method = "post" action="deposite">
					1 Is your Account <input type="text" name="amount"
						placeholder="Enter the Amount to deposite">
					<button type="submit" id="submit">Deposite</button>
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