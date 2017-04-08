<%--
  Created by IntelliJ IDEA.
  User: eugen
  Date: 4/7/17
  Time: 08:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
  <style>
    table {
      font-family: arial, sans-serif;
      border-collapse: collapse;
      width: 100%;
    }

    td, th {
      border: 1px solid #dddddd;
      text-align: left;
      padding: 8px;
    }

    tr:nth-child(even) {
      background-color: #dddddd;
    }
  </style>
    <title>Areas</title>
</head>
<body>
<h1>This is areas get mapping</h1>
<table>
  <tr>
    <th>Название</th>
    <th>Количество мест</th>
    <th>Адрес</th>
    <th>Действия</th>
  </tr>
<c:forEach items="${areas}" var="area">
  <tr>
    <td>${area.name}</td>
    <td>${area.numOfPlaces}</td>
    <td>${area.address}</td>
    <td><a href="${pageContext.request.contextPath}/area/${area.id}">Показать</a> </td>
  </tr>
</c:forEach>

</table>
<a href="${pageContext.request.contextPath}/area/new">Создать</a>
</body>
</html>
