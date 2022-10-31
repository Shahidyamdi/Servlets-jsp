<%@page import="jakarta.servlet.jsp.PageContext"%>
<%@ page language="java" contentType="text/html"%>
<html>
<body>
<%String uname = (String)pageContext.getAttribute("uname",PageContext.SESSION_SCOPE);
out.println("Welcome="+uname);
%>
</body>
</html>