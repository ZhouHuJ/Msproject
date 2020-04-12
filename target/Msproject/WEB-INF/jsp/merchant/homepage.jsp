<%--
  Created by IntelliJ IDEA.
  User: 吴所谓
  Date: 2020/4/11
  Time: 18:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%if(session.getAttribute("merchant")!=null){%>
    <a href="/order/selectorderbymerchantid.do"><input type="button" value="订单查询" ></a>
    <a href="/product/selbyvo.do?merchantid=${merchant.id}"><input type="button" value="商品查询" ></a>
    <a href="/product/toapplyproduct.do"><input type="button" value="商品申请" ></a>
    <a href="/pagehome/tohome.do"><input type="button" value="返回秒杀商品列表" ></a>
<%}else {
    response.sendRedirect("/pagehome/tohome.do");
}%>
</body>
</html>
