<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="com.iter.impl.Employee"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		Employee emp = (Employee)request.getAttribute("emp");
		System.out.println(emp.getEmpNo());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getEmpCity());
	%>
	<b>This is Retrieve page</b>
	<table>
		<tr><input type="text" readonly="readonly" value="<%= emp.getEmpNo()%>"> </tr>
		<tr><input type="text" readonly="readonly" value="<%= emp.getEmpName()%>"></tr>
		<tr><input type="text" readonly="readonly" value="<%= emp.getEmpCity()%>"></tr>
	</table>
	<a>Hello</a>
</body>
</html>