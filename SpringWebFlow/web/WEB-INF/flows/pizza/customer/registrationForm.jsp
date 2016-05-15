<%--
  Created by IntelliJ IDEA.
  User: KL
  Date: 2016/5/15
  Time: 15:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns:jsp="http://java.sun.com/JSP/Page"
      xmlns:form="http://www.springframework.org/tags/form"
      xmlns:form="http://www.springframework.org/tags">
<jsp:output omit-xml-declaration="yes"/>
<jsp:directive.page contentType="text/html;charset=UTF-8"/>
<head>
    <title>Spizza</title>
</head>
<body>
    <h2>Customer Registration</h2>
    <form:form commandName="customer">
        <input type="hidden" name="_flowExecutionKey"
               value="${flowExecutionKey}"/>
        <b>Phone number:</b><form:input path="phoneNumber" />
        <b>Name: </b><form:input path="name" /><br/>
        <b>Address: </b><form:input path="address" /><br/>
        <b>City: </b><form:input path="city" /><br/>
        <b>State: </b><form:input path="state" /><br/>
        <b>Zip Code: </b><form:input path="zipCode" /><br/>
        <input type="submit" name="_eventId_submit"
               value="Submit"/>
        <input type="submit" name="_eventId_cancel"
               value="Cancel"/>
    </form:form>
</body>
</html>
