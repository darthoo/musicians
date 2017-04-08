<%--
  Created by IntelliJ IDEA.
  User: eugen
  Date: 4/7/17
  Time: 09:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>New area</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/area" method="post">
Имя: <input id="name" name="name"> <br>
Количество мест: <input id="places" name="numOfPlaces"> <br>
Адрес: <input id="address" name="address"> <br>

<button type="submit">Создать</button>
</form>
</body>
</html>
