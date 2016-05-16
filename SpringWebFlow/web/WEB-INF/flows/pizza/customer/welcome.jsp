<%--
  Created by IntelliJ IDEA.
  User: KL
  Date: 2016/5/15
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Spizza</title>
</head>
<body>
    <h2>Welcome to Spizza!!!</h2>
    <form:form>
        <input type="hidden" name="_flowExecutionKey"
               value="${flowExecutionKey}"/>
        <input type="text" name="phoneNumber"/><br/>
        <input type="submit" name="_eventId_phoneEntered"
                                value="Lookup Customer" />
    </form:form>
</body>
</html>
