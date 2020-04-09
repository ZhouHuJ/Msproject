<%--
  Created by IntelliJ IDEA.
  User: 吴所谓
  Date: 2020/4/7
  Time: 17:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商家添加</title>
</head>
<body>
<form action="/merchant/add.do" method="post">
    商家名称：<input name="merchantname"></br>
    商家店铺名称：<input name="merchantshopname"></br>
    商家账号：<input name="merchantaccount"></br>
    商家密码：<input name="merchantpassword"></br>
    商家经营范围：<input name="merchantscope"></br>
    <input type="submit" value="提交" >
</form>
</body>
</html>
