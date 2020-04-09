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
    <title>用户修改信息</title>
</head>
<body>
<form action="/user/update.do" method="post">
    <input name="id" value="${user.id }" type="hidden"/>
    用户姓名:<input name="username" value="${user.username }"></br>
    用户账号:<input name="useraccount" value="${user.useraccount }"></br>
    用户密码:<input name="userpassword" value="${user.userpassword }"></br>
    用户性别:<input name="usersex" value="${user.usersex }"></br>
    用户年龄:<input name="userage" value="${user.userage }"></br>
    用户的地址:<input name="useraddress" value="${user.useraddress}" ></br>
    用户的邮箱:<input name="useremail" value="${user.useremail }"></br>
    <input type="submit" value="修改完成" >
</form>
</body>
</html>
