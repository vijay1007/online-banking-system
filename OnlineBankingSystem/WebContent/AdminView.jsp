<%-- 
    Document   : AdminView
    Created on : Feb 12, 2020, 2:12:03 PM
    Author     : sandeep sj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="authenticate.jsp" %>
<!DOCTYPE html>
<html>
<head>
	<script type="text/javascript">
		function a(){
		    window.location = $("a", this).attr("href");
		  }
	</script>
	<link rel="stylesheet" type="text/css" href="a.css">
	<title></title>
</head>
<body background="blue">
<%@ include file="header.html" %>
<table border="1" width="100%">

	<tr><td><center>
		<form>
			<%@ include file="navigator2a.html" %>
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