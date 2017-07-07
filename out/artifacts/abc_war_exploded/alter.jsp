<%--
  Created by IntelliJ IDEA.
  User: WLP
  Date: 2017/6/29
  Time: 8:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>更新用户</title>
</head>
<body>
<form action="user_update.action">
    用户ID：<input type="text" value="${user.userid}" readonly="readonly" name="user.userid"><br>
    用户名：${user.username}<input type="text" name="user.username"><br>
    密码：${user.password}<input type="password" name="user.password"><br>
    <input type="submit" value="保存">
</form>
</body>
</html>
