<%--
  Created by IntelliJ IDEA.
  User: 吴所谓
  Date: 2020/4/10
  Time: 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/productdetail/add.do" method="post">
    <input name="productid" type="hidden" value="${productid}">
    <input name="merchantid" type="hidden" value="${merchantid}">
    商品产地:<input name="productplace"></br>
    商品名称:<input name="productname"></br>
    商品品牌:<input name="brandname"></br>
    商品重量:<input name="productweight"></br>
    规格和包装:<input name="specification"></br>
    商品详情图片地址:<input name="productdetailpicture"></br>
    <input type="submit" value="提交" >
</form>
</body>
</html>
