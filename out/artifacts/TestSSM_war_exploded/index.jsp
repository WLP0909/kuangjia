<%@ page import="domain.Emp" %><%--
  Created by IntelliJ IDEA.
  User: WLP
  Date: 2017/7/1
  Time: 9:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>员工信息</title>
    <link type="text/css" href="css/buti.css" rel="stylesheet">
    <script type="text/javascript" src="js/jquery.js"></script>
  </head>
  <body>
  <form action="Find">
    <input type="text" name="find">
    <input type="submit" value="搜索">
  </form>
  <table border="1px" cellpadding="5px" cellspacing="0px">
    <tr align="center">
      <td>用户ID</td>
      <td>用户姓名</td>
      <td>证件照</td>
      <td>入职时间</td>
      <td>操作</td>
    </tr>
    <c:forEach items="${emps}" var="emp">
      <tr>
        <td>${emp.eid}</td>
        <td>${emp.ename}</td>
        <td><img src="image/${emp.photo}" height="50px" width="50px"></td>
        <td>${emp.hiredate}</td>
        <td>
          <a href="Alt?eid=${emp.eid}">修改</a>|
          <a href="Del?eid=${emp.eid}" onclick="dele();">删除</a>
        </td>
      </tr>
    </c:forEach>
  </table>
  <a href="insert.jsp">添加员工</a>
  </body>
</html>
