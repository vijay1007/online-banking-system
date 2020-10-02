<%@ page import="javax.servlet.http.HttpSession"%>
<%@ page import="java.sql.ResultSet" %>
<%
	HttpSession checksession = request.getSession(false);
	if (checksession.getAttribute("adminid") == null) {
		response.sendRedirect("index.jsp");
	}
%>