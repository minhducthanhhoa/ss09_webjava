<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 5/15/2025
  Time: 10:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Đăng nhập</h2>
<form action="${pageContext.request.contextPath}/login" method="post">
    <p>Tên đăng nhập: <input type="text" name="username"/></p>
    <p>Mật khẩu: <input type="password" name="password"/></p>
    <p><input type="submit" value="Đăng nhập"/></p>
</form>
<c:if test="${not empty error}">
    <p style="color: red">${error}</p>
</c:if>
</body>
</html>
