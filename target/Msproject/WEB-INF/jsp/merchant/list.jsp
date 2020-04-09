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
<center><a href="toadd.do">添加商家</a></center>
<table border="2">
    <tr>
        <td>商家的姓名</td>
        <td>商家的店铺名称</td>
        <td>商家账号</td>
        <td>商家密码</td>
        <td>商家经营范围</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${merchantlist}" var="item">
        <tr>
            <td>${item.merchantname }</td>
            <td>${item.merchantshopname }</td>
            <td>${item.merchantaccount }</td>
            <td>${item.merchantpassword }</td>
            <td>${item.merchantscope }</td>
            <td><a href="toupdate.do?id=${item.id}">修改</a>||<a href="del.do?id=${item.id}">删除</a>||<a href="selbyid.do?id=${item.id}">查看</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
