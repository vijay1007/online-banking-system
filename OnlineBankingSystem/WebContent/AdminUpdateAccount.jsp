<%-- 
    Document   : AdminUpdateAccount
    Created on : Feb 12, 2020, 2:11:54 PM
    Author     : sandeep sj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="authenticate.jsp" %>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="a.css">
	<title></title>
</head>
<body background="blue">
<%@ include file="header.html" %>
<table border="1" width="100%">

	<tr>
		<td id="navtd">
			<%@ include file="navigator2.html" %>
		</td>
		<td>
			<form method="post" action = "AdminUpdateAccount">
				<table>
				<tr id="registerfield">
					<td>
						Enter AADHAR Card:
					</td>
					<td>
						<input type="integer" name="aadhar" placeholder="Enter AADHARCARD number" width="1000">
					</td>
				</tr>
				<tr id="registerfield">
					<td>
						Enter Account Number: 
					</td>
					<td>
						<input type="integer" name="accno" placeholder="Enter Account Number">
					</td>
				</tr>
				<tr id="registerfield">
					<td>
						Enter Account HolderName: 
					</td>
					<td>
						<input type="text" name="name" placeholder="Enter Account holder name">
					</td>
				</tr>
				<tr id="registerfield">
					<td>
						Enter Account Type: 
					</td>
					<td>
						<input type="text" name="acctype" placeholder="Enter Account type">
					</td>
				</tr>
				<tr id="registerfield">
					<td>
						Enter Account Password: 
					</td>
					<td>
						<input type="password" name="password" placeholder=" Enter Account password">
					</td>
				</tr>
				<tr id="registerfield">
					<td></td>
					<td>
					<button type="submit" id = "submit">Update</button>
					</td>
					</tr>
					
				</table>
			</form>
			(Note:-Here Your Updatation will Perform Based on Account Number)
		</td>
	</tr>
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