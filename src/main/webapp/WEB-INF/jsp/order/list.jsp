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
<a href="/merchantregisterlogin/tologin.do">用户登入、注册</a>
<%}%>

<table border="2">
    <tr>
        <td>支付金额</td>
        <td>订单生成时间</td>
        <td>支付状态</td>
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
            <%if(session.getAttribute("user")!=null){%>
            <td><c:if test="${item.paystatus == 1 }"><a href="topaymoney.do?id=${item.id}&&tradeserialnumble=${item.tradeserialnumble}&&payamount=${item.payamount}">继续支付</a></c:if><c:if test="${item.paystatus == 2 }">支付完成</c:if><c:if test="${item.paystatus == 3 }">订单完成取消</c:if><c:if test="${item.paystatus == 4 }">申请退款中</c:if><c:if test="${item.paystatus == 5 }">退款成功</c:if><c:if test="${item.paystatus == 1 }"><a href="cancelorder.do?id=${item.id}">取消订单</a></c:if><c:if test="${item.paystatus == 2 }"><a href="refund.do?id=${item.id}">申请退款</a></c:if></td>
            <%}else if(session.getAttribute("merchant")!=null){%>
            <td><c:if test="${item.paystatus == 4 }"><a href="agreerefund.do?id=${item.id}">同意退款</a></c:if></td>
            <%}%>
        </tr>
    </c:forEach>
</table>
</body>
</html>
