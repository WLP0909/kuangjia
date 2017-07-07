<%--
  Created by IntelliJ IDEA.
  User: WLP
  Date: 2017/6/28
  Time: 15:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>

<form action="user_findByUserid.action">
    ID：<input type="text" name="user.userid"><br>
    用户名：<input type="text" name="user.username"><br>
    密码：<input type="password" name="user.password"><br>
    <input type="submit" value="确认">
</form>
</body>
</html>
