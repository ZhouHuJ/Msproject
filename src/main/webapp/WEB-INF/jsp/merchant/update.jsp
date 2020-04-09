<%--
  Created by IntelliJ IDEA.
  User: 吴所谓
  Date: 2020/4/9
  Time: 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>商家修改信息</title>
</head>
<body>
<form action="/merchant/update.do" method="post">
    <input name="id" value="${merchant.id }" type="hidden"/>
    商家的姓名:<input name="merchantname" value="${merchant.merchantname }"></br>
    商家的店铺名称:<input name="merchantshopname" value="${merchant.merchantshopname }"></br>
    商家账号:<input name="merchantaccount" value="${merchant.merchantaccount }"></br>
    商家密码:<input name="merchantpassword" value="${merchant.merchantpassword }"></br>
    商家经营范围:<input name="merchantscope" value="${merchant.merchantscope }"></br>
    <input type="submit" value="修改完成" >
</form>
</body>
</html>
