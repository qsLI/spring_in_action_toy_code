<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: KL
  Date: 2016/5/17
  Time: 11:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spizza</title>
</head>
<body>
    <h2>Your order</h2>
    <h3>Deliver to:</h3>
    <b>${order.customer.name}</b><br/>
    <b>${order.customer.address}</b><br/>
    <b>${order.customer.city}, ${order.customer.state}, ${order.customer.zipCode}</b><br/>
    <b>${order.customer.phoneNumber}</b><br/>
    <hr/>
        <h3>Order total: <fmt:formatNumber type="currency" value="${order.total}"/> </h3>
    <hr/>
    <h3>Pizzas: </h3>
    <c:if test="${fn:length(order.pizzas) eq 0 }">
        <b>No pizzas in this order</b>
    </c:if><br/>
    <c:forEach items="${order.pizzas}" var ="pizza">
        <li>${pizza.size}:
            <c:forEach items="${pizza.toppings}" var="topping">
                <c:out value="${topping}"/>
            </c:forEach>
        </li>
    </c:forEach>

<form:form>
    <input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}"/>
    <input type="submit" name="_eventId_createPizza" value="Create Pizza"/>
    <c:if test="${fn:length(order.pizzas) gt 0 }">
        <input type="submit" name="_eventId_checkout" value="Checkout"/>
    </c:if>
    <input type="submit" name="_eventId_cancel" value="Cancel"/>
</form:form>
</body>
</html>
