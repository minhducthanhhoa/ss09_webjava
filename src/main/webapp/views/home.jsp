<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 5/15/2025
  Time: 10:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Chào mừng, ${customer.username}</h2>
<p>Thông tin email: ${customer.email}</p>
<h1>Phim đang chiếu</h1>
<table border="1">
    <tr>
        <th>Tiêu đề</th>
        <th>Đạo diễn</th>
        <th>Thể loại</th>
        <th>Chi tiết</th>
    </tr>
    <c:forEach var="movie" items="${movies}">
        <tr>
            <td>${movie.title}</td>
            <td>${movie.director}</td>
            <td>${movie.genre}</td>
            <td><a href="${pageContext.request.contextPath}/detailMovie?id=${movie.id}">Xem</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
