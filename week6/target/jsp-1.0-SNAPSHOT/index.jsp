<%@ page import="com.example.week6.Counter" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<a href="foo.jsp">Foo-Counter</a>
<br/>
<a href="counter.jsp">Counter</a>
<br/>
<a href="sameHobby.html">Find friends</a>
<br/>
<a href="el">Expression Language</a>
<br/>
<a href="jstl">JSTL</a>
<%@include file="nav.jsp"%>
</body>
</html>