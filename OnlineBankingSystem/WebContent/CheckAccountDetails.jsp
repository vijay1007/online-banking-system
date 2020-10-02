<%-- 
    Document   : CheckAccountDetails
    Created on : Feb 12, 2020, 2:12:16 PM
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
<%@ include file="header.html" %>
<%@ page import="db.Accounts"%>
<table border="1" width="100%">
	<tr>
		<td id="navtd">
			<%@ include file="navigator1.html" %>
		</td>
		<td>
			<span>
			<%
			String accno1 = (String)session.getAttribute("accno");
			if(accno1 != null){
			System.out.println(accno1);
			int accno = Integer.parseInt(accno1);
			Accounts a = new Accounts();
			String[] res = a.select(accno);
			%>
				Account No:- <%=res[0] %><br>
				Holder Name:- <%=res[1] %><br>
				Account Type:- <%=res[2] %><br>
				Account Balance:- <%=res[3] %><br>
				Account Password:- <%=res[4] %><br>
				HolderAadharcard:- <%=res[5] %><br>
			</span>
			<%} %>
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