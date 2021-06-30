<%--
  Created by IntelliJ IDEA.
  User: syw
  Date: 2021/6/6
  Time: 8:18 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP: Instance Variable</title>
</head>
<body>
<% int localCount = 0; %>
<%= ++localCount %>
<br/>
<%! int count = 0; %>
<%= ++count %>
</body>
</html>
