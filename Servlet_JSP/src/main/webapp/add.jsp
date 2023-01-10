<%@page import="java.util.*"%>		<!--Directive @page, @include, @taglib-->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>    <!-- Included header.jsp file which returns 10 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">

	<%!
		int coef = 3;
	%>							<!--Declaration-->
	<h1>Hello World</h1>
	<% 
	pageContext.setAttribute("name", "ani", PageContext.SESSION_SCOPE);
	int i = Integer.parseInt(request.getParameter("num1"));
	int j = Integer.parseInt(request.getParameter("num2"));
	int k = i + j;
	out.println("Result is " + k);
	%>							<!--Scriptlet-->
	My Fav no. is <%= coef %>	<!--Expression-->

</body>
</html>

<!-- 
Built in object can be used in Scriptlet and Expresseion:
request (HttpServletRequest)
response (HttpServletResponse)
pageContext (PageContext)
out (JspWriter) ~ PrintWriter Object
session (HttpSession)
application (ServletContext)
config (ServletConfig)
-->