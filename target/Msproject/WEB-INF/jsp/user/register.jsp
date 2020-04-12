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
<form action="/registerlogin/register.do" method="post">
    用户姓名：<input name="username"></br>
    用户账户：<input name="useraccount"></br>
    用户密码：<input name="userpassword"></br>
    用户性别：<input name="usersex"></br>
    用户年龄：<input name="userage"></br>
    用户地址：<input name="useraddress"></br>
    用户邮箱：<input name="useremail"></br>
    <input type="submit" value="注册" >
</form>
</body>
</html>
