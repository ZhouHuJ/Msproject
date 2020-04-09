<%--
  Created by IntelliJ IDEA.
  User: 吴所谓
  Date: 2020/4/9
  Time: 12:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center><a href="toadd.do">添加用户</a></center>
<table border="2">
    <tr>
        <td>用户姓名</td>
        <td>用户账号</td>
        <td>用户密码</td>
        <td>用户性别</td>
        <td>用户年龄</td>
        <td>用户的地址</td>
        <td>用户的邮箱</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${userlist}" var="item">
        <tr>
            <td>${item.username }</td>
            <td>${item.useraccount }</td>
            <td>${item.userpassword }</td>
            <td>${item.usersex }</td>
            <td>${item.userage }</td>
            <td>${item.useraddress }</td>
            <td>${item.useremail }</td>
            <td><a href="toupdate.do?id=${item.id}">修改</a>||<a href="del.do?id=${item.id}">删除</a>||<a href="selbyid.do?id=${item.id}">查看</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
