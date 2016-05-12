<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: KL
  Date: 2016/5/8
  Time: 21:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show spittle</title>
</head>
<body>
    (<c:out value="${spittle.message}" />,
    <c:out value="${spittle.time}"/>)
</body>
</html>
