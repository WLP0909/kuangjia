<%--
  Created by IntelliJ IDEA.
  User: WLP
  Date: 2017/6/28
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户信息</title>
</head>
<body>
<form action="user_findByAny.action">
    <input type="text" name="value"><input type="submit" value="查找">
    <c:if test="${not empty users}">
    <table>
        <tr>
            <td>ID</td>
            <td>用户名</td>
            <td>密码</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${users}" var="u">
        <tr>
            <td>${u.userid}</td>
            <td>${u.username}</td>
            <td>${u.password}</td>
            <td>
                <a href="user_findByUserid.action?user.userid=${u.userid}">修改</a>|
                <a href="user_delete.action?user.userid=${u.userid}">删除</a>
            </td>
        </tr>
        </c:forEach>
    </table>
    </c:if>
    <a href="add.jsp">添加员工</a>
</form>
</body>
</html>
