
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: jorge
  Date: 24/02/2023
  Time: 21:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
  <title>Historico de operações</title>
</head>
<body>
<h1>As operações foram: </h1>
<c:forEach items="${historico_cadastros}" var="dados">
  <h1><c:out value="${dados.toString()}"/></h1>
</c:forEach>
</body>
</html>
