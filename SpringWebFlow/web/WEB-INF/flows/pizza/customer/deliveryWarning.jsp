<%--
  Created by IntelliJ IDEA.
  User: KL
  Date: 2016/5/15
  Time: 15:58
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spizza</title>
</head>
<body>
    <h2>Delivery Unavailable</h2>
    <p>The address is outside of our delivery area. You may still place
    the order, but you will need to pick it up yourself. </p>

    <a href="<c:url value="${flowExecutionUrl}&_eventId=accept"/>">
        Continue, I'll pick up the order
    </a> |
    <a href="<c:url value="${flowExecutionUrl}&_eventId=cancel"/>">
        Never mind
    </a>

</body>
</html>
