<%@ page import="domain.Emp" %><%--
  Created by IntelliJ IDEA.
  User: WLP
  Date: 2017/7/1
  Time: 13:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>更新员工信息</title>
    <script type="text/javascript" src="js/jquery.validate.js"></script>
    <script type="text/javascript" src="js/jquery-3.2.1.js"></script>
    <script type="text/javascript" src="js/jquery.js"></script>

    <script type="text/javascript">
        $(function() {
            $('form :input').blur(function () {
                var $parent = $(this).parent();
                $parent.find(".formtips").remove();
                if ($(this).is('#username')) {
                    if (this.value == "" || this.value.length >= 6) {
                        var errorMsg = '请输入不超过6位的用户名.';
                        $parent.append('<span class="formtips onError">' + errorMsg + '</span>');
                    } else {
                        var okMsg = '输入正确.';
                        $parent.append('<span class="formtips onSuccess">' + okMsg + '</span>');
                    }
                }
            }).keyup(function () {
                $(this).triggerHandler("blur");
            }).focus(function () {
                $(this).triggerHandler("blur");
            });
        })
    </script>

</head>
<body>
<form action="Upd" id="form" method="post" enctype="multipart/form-data">
    编号：<input type="text" name="eid" value="${emp.eid}" readonly="readonly"><br>
    姓名：${emp.ename}<input type="text" id="username" name="ename"><br>
    照片：<img src="image/${emp.photo}" width="50px" height="50px"><input type="file" name="photo1"><br>
    日期：${emp.hiredate}<input type="date" name="hiredate"><br>
    <input type="submit" value="保存">
</form>
</body>
</html>
