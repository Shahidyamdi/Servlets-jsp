<%@page import="javax.tools.ForwardingFileObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% String username = request.getParameter("username");
  int  userage= Integer.parseInt(request.getParameter("userage"));
 session.setAttribute( "username", username );
 session.setAttribute("userage", userage);
 %>
 <jsp:forward page="form2.html"/>


</body>
</html>