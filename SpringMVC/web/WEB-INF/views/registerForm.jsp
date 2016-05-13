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
    <sf:errors path="*" element="div" cssClass="errors" />
    <sf:label path="firstName" cssErrorClass="error">First Name:</sf:label>
        <sf:input path="firstName" />

    Last  Name: <sf:input path="lastName" cssErrorClass="error"/>

    Username: <sf:input path="username" />

    Password: <sf:password path="password" />

    Email: <sf:input path="email" type="email" />

    <input type="submit" value="Register"/>
</sf:form>
</body>
</html>
