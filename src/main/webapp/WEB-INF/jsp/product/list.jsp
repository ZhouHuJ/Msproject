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
<center><a href="toapplyproduct.do">申请秒杀商品</a></center>
<table border="2">
    <tr>
        <td>商品id</td>
        <td>商品标题</td>
        <td>图片地址</td>
        <td>秒杀价格</td>
        <td>商家id</td>
        <td>秒杀原价</td>
        <td>申请时间</td>
        <td>转态</td>
        <td>秒杀开始时间</td>
        <td>秒杀结束时间</td>
        <td>秒杀商品数</td>
        <td>库存</td>
        <td>商品描述</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${productlist}" var="item">
        <tr>
            <td>${item.productid }</td>
            <td>${item.producttitle }</td>
            <td>${item.productpicture }</td>
            <td>${item.miaoshaprice }</td>
            <td>${item.merchantid }</td>
            <td>${item.originalprice }</td>
            <td>${item.applydate }</td>
            <td>${item.auditstatus }</td>
            <td>${item.starttime }</td>
            <td>${item.endtime }</td>
            <td>${item.productcount }</td>
            <td>${item.stockcount }</td>
            <td>${item.description }</td>
            <td><a href="toupdate.do?id=${item.id}">修改</a>||<a href="del.do?id=${item.id}">删除</a>||<a href="sel.do?id=${item.id}">查看</a>||<a href="toupdatemsproductstate?id=${item.id}">审核</a></td>||<a href="/productdetail/toadd.do?productid=${item.productid}&&merchantid=${item.merchantid}">添加商品详情</a>||<a href="/productdetail/selbyproid.do?productid=${item.productid}">查看商品详情</a>||<a href="/productdetail/toupdate.do?productid=${item.productid}">修改商品详情</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
