<%--
  Created by IntelliJ IDEA.
  User: 吴所谓
  Date: 2020/4/8
  Time: 18:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
欢迎：${user.useraccount}
</br>
<a href="/registerlogin/toregister.do">注册</a></br>
<a href="/registerlogin/tologin.do">登录</a>
<a href="/registerlogin/exit.do">退出登录</a>

<table border="2">
    <c:forEach items="${list}" var="item">
        <tr>
            <td>${item.producttitle}</td>
            <td>${item.productpicture}</td>
            <td>${item.miaoshaprice}</td>
            <td>${item.originalprice}</td>
            <td>${item.starttime}</td>
            <td>${item.endtime}</td>
            <td><a href="/pagehome/viewproductdetail.do?id=${item.id}">查看</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
