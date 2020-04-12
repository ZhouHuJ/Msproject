<%--
  Created by IntelliJ IDEA.
  User: 吴所谓
  Date: 2020/4/8
  Time: 19:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/registerlogin/login.do" method="post">
    <%if(request.getAttribute("errorinfo")!=null){%>
    错误：${requestScope.errorinfo}</br>
    <%}%>
    用户账户：<input name="useraccount"></br>
    用户密码：<input name="userpassword"></br>
    <input type="submit" value="登入" >
    <a href="/registerlogin/toregister.do"><input type="button" value="注册" ></a>
</form>
</body>
</html>
