<%--
  Created by IntelliJ IDEA.
  User: 吴所谓
  Date: 2020/4/9
  Time: 14:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%if(session.getAttribute("user")!=null){%>
欢迎：${user.useraccount}
<a href="/user/toUserHomePage.do">主页</a>
<a href="/registerlogin/exit.do">退出登录</a>
<%}else if(session.getAttribute("merchant")!=null){%>
欢迎：${merchant.merchantaccount}
<a href="/merchant/toMerchantHomePage.do">主页</a>
<a href="/merchantregisterlogin/exit.do">退出登录</a>
<%}else {
    response.sendRedirect("http://localhost:8080");
}%>

<table border="2">
    <tr>
        <td>商品id</td>
        <td>商品标题</td>
        <td>图片地址</td>
        <td>商家id</td>
        <td>秒杀价格</td>
        <td>秒杀原价</td>
        <td>申请时间</td>
        <td>状态</td>
        <td>秒杀开始时间</td>
        <td>秒杀结束时间</td>
        <td>秒杀商品数</td>
        <td>库存</td>
        <td>商品描述</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${productlist}" var="item">
        <tr>
            <td>${item.id }</td>
            <td>${item.producttitle }</td>
            <td>${item.productpicture }</td>
            <td>${item.merchantid }</td>
            <td>${item.miaoshaprice }</td>
            <td>${item.originalprice }</td>
            <td>${item.applydate }</td>
            <td>${item.auditstatus }</td>
            <td>${item.starttime }</td>
            <td>${item.endtime }</td>
            <td>${item.productcount }</td>
            <td>${item.stockcount }</td>
            <td>${item.description }</td>
            <td>商品：<a href="toupdate.do?id=${item.id}">修改</a>&nbsp&nbsp&nbsp&nbsp<a href="del.do?id=${item.id}">删除</a>&nbsp&nbsp&nbsp&nbsp<a href="sel.do?id=${item.id}">查看</a>&nbsp&nbsp&nbsp&nbsp<a href="updateproductstate.do?id=${item.id}">审核</a>&nbsp&nbsp&nbsp&nbsp</br>商品详情：<a href="/productdetail/toadd.do?productid=${item.id}&&merchantid=${item.merchantid}">添加</a>&nbsp&nbsp&nbsp<a href="/productdetail/selbyproid.do?productid=${item.id}">查看</a>&nbsp&nbsp&nbsp<a href="/productdetail/toupdate.do?productid=${item.id}">修改</a></td>
        </tr>
    </c:forEach>
</table>
</br>
<a href="/product/toapplyproduct.do"><input type="button" value="商品申请"></a>
</body>
</html>
