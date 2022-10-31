<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% String Qualification = request.getParameter("Qualification");
  String  designation= request.getParameter("designation");
 session.setAttribute( "Qualification", Qualification  );
 session.setAttribute("designation", designation);
 %>
 
 <jsp:forward page="form3.html"></jsp:forward>

</body>
</html>