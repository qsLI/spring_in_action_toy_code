<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: KL
  Date: 2016/5/21
  Time: 13:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spittr Login</title>
</head>
<body onload="document.f.username.focus();">
    <form name="f" action="<c:out value="/login"/>" method="POST">
        <table>
            <tr>
                <td>User:</td>
                <td>
                    <input type="text" name="username" value=""/>
                </td>
            </tr>
            <tr>
                <td>Password: </td>
                <td>
                    <input type="password" name="password" />
                </td>
            </tr>
            <tr>
                <td>
                    <input type="hidden"
                           name="${_csrf.parameterName}"
                           value="${_csrf.token}"/>
                </td>
            </tr>
            <tr>
                <td>
                    <input id="remember_me" name="remember-me" type="checkbox"/>
                    <label for="remember_me" class="inline">Remember me</label>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input name="submit" type="submit" value="Login"/>
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
