<%--
  Created by IntelliJ IDEA.
  User: 吴所谓
  Date: 2020/4/9
  Time: 14:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/product/applyproduct.do" method="post">
    商品id:<input name="productid"></br>
    商品标题:<input name="producttitle"></br>
    商品图片地址:<input name="productpicture"></br>
    秒杀价格:<input name="miaoshaprice"></br>
    商品原价:<input name="originalprice"></br>
    <input type="hidden" name="merchantid" value="${merchant.id}">
    秒杀开始时间:<input type="date" name="starttimestring"></br>
    秒杀结束时间:<input type="date" name="endtimestring"></br>
    秒杀商品数量:<input name="productcount"></br>
    库存:<input name="stockcount"></br>
    描述:<input name="description"></br>
    <input type="submit" value="提交">
</form>
</body>
</html>
