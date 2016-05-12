<%--
  Created by IntelliJ IDEA.
  User: KL
  Date: 2016/5/8
  Time: 21:42
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
    <link rel="stylesheet"
          type="text/css"
          href="<c:url value="/resources/style.css"/>">
</head>
<body>
<h1>Register</h1>
<sf:form method="post" commandName="spitter">
    First Name: <sf:input path="firstName" />
        <sf:errors path="firstName" cssClass="error"/> <br/>
    Last  Name: <sf:input path="lastName"/>
        <sf:errors path="lastName" cssClass="error"/> <br/>
    Username: <sf:input path="username" />
        <sf:errors path="Username" cssClass="error"/> <br/>
    Password: <sf:password path="password" />
        <sf:errors path="password" cssClass="error"/> <br/>
    Email: <sf:input path="email" type="email" />
        <sf:errors path="email" cssClass="error"/> <br/>
    <input type="submit" value="Register"/>
</sf:form>
</body>
</html>
