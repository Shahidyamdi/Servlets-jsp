<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>


<body>
<%!String username;
   String password;  %>
   
   <%
   
   String username = request.getParameter("username");
   String password = request.getParameter("password");
   
   if(username.equals("shahid")&& password.equals("sha")){
	   out.println("login success");
   }
   else{
	   out.println("login fail");
   }
   
   %>
   <br><br>
   <%= "username :"+username %><br><br>
   <%= "password :"+password %>

</body>
</html>