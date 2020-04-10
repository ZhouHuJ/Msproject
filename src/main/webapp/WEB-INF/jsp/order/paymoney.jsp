<%--
  Created by IntelliJ IDEA.
  User: 吴所谓
  Date: 2020/4/10
  Time: 20:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/order/paymoney.do" method="post">
    支付方式：
    支付宝 :<input type="radio" name="paytype" value="1" />
    微信:<input type="radio" name="paytype" value="2" />
    银联:<input type="radio" name="paytype" value="3" />
    支付总额：${payamount}
    流水号:${tradeserialnumble}
    <input type="hidden" name="id" value="${id}">
    <input type="hidden" name="tradeserialnumble" value="${tradeserialnumble}">
    <input type="hidden" name="payamount" value="${payamount}">
    <input type="submit" value="立即付款">
</form>
</body>
</html>
