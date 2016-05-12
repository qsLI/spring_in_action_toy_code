<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: KL
  Date: 2016/5/8
  Time: 22:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Profile</title>
</head>
<body>
    <c:out value = "${spitter.username}" /> <br>
    <c:out value="${spitter.firstName}"/> <br>
    <c:out value="${spitter.lastName}" /> <br>
</body>
</html>
