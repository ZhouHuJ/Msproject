<%--
  Created by IntelliJ IDEA.
  User: 吴所谓
  Date: 2020/4/8
  Time: 18:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/merchantregisterlogin/register.do" method="post">
    商家的姓名:<input name="merchantname"></br>
    商家的店铺名称:<input name="merchantshopname"></br>
    商家账号:<input name="merchantaccount"></br>
    商家密码:<input name="merchantpassword"></br>
    商家经营范围:<input name="merchantscope"></br>
    <input type="submit" value="注册" >
</form>
</body>
</html>
