<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib  %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Hello World
	<%
		String name = request.getAttribute("label").toString();
		out.print(name);
	%>
	${label}	<!-- Expression language used to fetch data stored in java classes -->
</body>
</html>