<%--
  Created by IntelliJ IDEA.
  User: KL
  Date: 2016/5/8
  Time: 21:42
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<h1>Register</h1>
<sf:form method="post" commandName="spitter">
    First Name: <sf:input path="firstName" /><br/>
    Last  Name: <sf:input path="lastName"/><br/>
    Username: <sf:input path="username" /> <br/>
    Password: <sf:password path="password" /><br>
    <input type="submit" value="Register"/>
</sf:form>
</body>
</html>
