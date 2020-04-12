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

</br>

<%if(session.getAttribute("user")!=null){%>
欢迎：${user.useraccount}
<a href="/user/toUserHomePage.do">主页</a>
<a href="/registerlogin/exit.do">退出登录</a>
<%}else if(session.getAttribute("merchant")!=null){%>
欢迎：${merchant.merchantaccount}
<a href="/merchant/toMerchantHomePage.do">主页</a>
<a href="/merchantregisterlogin/exit.do">退出登录</a>
<%}else{%>
<a href="/registerlogin/tologin.do">用户登入、注册</a></br>
<a href="/merchantregisterlogin/tologin.do">商家登入、注册</a>
<%}%>
<h1>秒杀商品</h1>
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
