<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.*" %>
<!DOCTYPE html>
<html>

<body>

<%! int eid;
String ename;
double esal;
%>
<% eid = Integer.parseInt(request.getParameter("eid"));
ename = request.getParameter("ename");
esal = Double.parseDouble(request.getParameter("esal"));
%>
<jsp:useBean id="eb" class="com.capgemini.EmpBeans" scope="page"/>
<jsp:setProperty property="ename" name="eb" value="<%=ename%>"/>
<jsp:setProperty property="eid" name="eb" value="<%=eid%>"/>
<jsp:setProperty property="esal" name="eb" value="<%=esal%>"/>
<!-- --configure get property -->

Employee  Eid  : <jsp:getProperty property="eid" name="eb"/><br>
Employee Ename : <jsp:getProperty property="ename" name="eb"/><br>
Employee salary: <jsp:getProperty property="esal" name="eb"/><br>





</body>
</html>