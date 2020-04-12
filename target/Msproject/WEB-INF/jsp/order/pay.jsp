<%--
  Created by IntelliJ IDEA.
  User: 吴所谓
  Date: 2020/4/10
  Time: 14:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/order/pay.do" method="post">
    商品名称：${product.producttitle}
    购买数量：${productnum}
    支付总额：${payamount}
    <input type="hidden" name="productid" value="${product.id}">
    <input type="hidden" name="userid" value="${userid}">
    <input type="hidden" name="merchantid" value="${product.merchantid}">
    <input type="hidden" name="payamount" value="${payamount}">
    <input type="hidden" name="num" value="${productnum}">
    </br>
    收货人地址:<input type="text" name="receivingaddress"></br>
    收货人电话:<input type="text" name="receivingphone"></br>
    收货人名称:<input type="text" name="receivingname"></br>
    <input type="submit" value="生成订单">
</form>
</body>
</html>
