<%--
  Created by IntelliJ IDEA.
  User: KL
  Date: 2016/5/15
  Time: 15:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns:jsp="http://java.sun.com/JSP/Page">
<jsp:output omit-xml-declaration="yes"/>
<jsp:directive.page contentType="text/html;charset=UTF-8"/>
<head>
    <title>Spizza</title>
</head>
<body>
    <h2>Delivery Unavailable</h2>
    <p>The address is outside of our delivery area. You may still place
    the order, but you will need to pick it up yourself. </p>
<![CDATA[
    <a href="${flowExecutionUrl}&_eventId=accept">
        Continue, I'll pick up the order
    </a>
    <a href="${flowExecutionUrl}&_eventId=cancel">
        Never mind
    </a>
    ]]>
</body>
</html>