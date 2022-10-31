<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
Connection connection;
PreparedStatement preparedstatement;



%>


<%

Class.forName("oracle.jdbc.driver.OracleDriver");

connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","shahid");


preparedstatement = connection.prepareStatement("insert into userdetails values(?,?,?,?,?,?)");


preparedstatement.setString(1, (String)session.getAttribute("username"));
preparedstatement.setInt(2, (Integer)session.getAttribute("userage"));
preparedstatement.setString(3,  (String)session.getAttribute("qualification"));
preparedstatement.setString(4,  (String)session.getAttribute("desgination"));
preparedstatement.setString(5,  request.getParameter("mobile"));
preparedstatement.setString(6,  request.getParameter("email"));
preparedstatement.executeUpdate();


out.println("Data inserted sucessfully");




%>

</body>
</html>