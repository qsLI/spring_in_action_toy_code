<%--
  Created by IntelliJ IDEA.
  User: KL
  Date: 2016/5/15
  Time: 15:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:output omit-xml-declaration="yes"/>
<jsp:directive.page contentType="text/html;charset=UTF-8"/>
<head>
    <title>Spizza</title>
</head>
<body>
<h2>Thank you for your order!</h2>
<![CDATA[
<a href='${flowExecutionUrl}&_eventId=finished'>Finish</a>
]]>
</body>
</html>
