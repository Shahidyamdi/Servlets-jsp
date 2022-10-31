<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! String username;
String password;
%>
<%
String uname = request.getParameter("username");
String upwd = request.getParameter("password");
if(username.equals("shahid")&&password.equals("sha"))
{
%>
<jsp:forward page="success.jsp"/>



<% 
}
else{
out.println("****U R Login is fail try with another username & password*******");
}%>
<jsp:include page="login.html"/>
</body>
</html>