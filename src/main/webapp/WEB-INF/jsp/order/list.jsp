<%--
  Created by IntelliJ IDEA.
  User: 吴所谓
  Date: 2020/4/10
  Time: 19:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center><a href="toadd">添加商家</a></center>
<table border="2">
    <tr>
        <td>支付金额</td>
        <td>订单生成时间</td>
        <td>支付转态</td>
        <td>收货人地址</td>
        <td>收货人电话</td>
        <td>收货人名称</td>
        <td>交易流水号</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${list}" var="item">
        <tr>
            <td>${item.payamount }</td>
            <td>${item.createtime }</td>
            <td>${item.paystatus }</td>
            <td>${item.receivingaddress }</td>
            <td>${item.receivingphone }</td>
            <td>${item.receivingname }</td>
            <td>${item.tradeserialnumble }</td>
            <td><c:if test="${item.paystatus == 1 }"><a href="topaymoney.do?id=${item.id}&&tradeserialnumble=${item.tradeserialnumble}&&payamount=${item.payamount}">继续支付</a></c:if><c:if test="${item.paystatus == 2 }">支付完成</c:if><c:if test="${item.paystatus == 3 }">退款成功</c:if></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
