<%--
  Created by IntelliJ IDEA.
  User: kdhrt
  Date: 09.05.2020
  Time: 15:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Wyszukiarka Książek</title>
</head>
<body>
    <button type="button" onclick="location.href='index.jsp'">wstecz</button>
    <p>Podaj tytuł książki:</p>
    <form action="/TPO5_war_exploded/findBook" method="get">
        <input type="text" name="bookName">
        <input type="submit" value="szukaj">
    </form>
</body>
</html>
