<%--
  Created by IntelliJ IDEA.
  User: 吴所谓
  Date: 2020/4/9
  Time: 20:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/product/update.do" method="post">
    <input name="id" value="${product.id }" type="hidden">
    商品id:<input name="productid" value="${product.productid }"></br>
    商品标题:<input name="producttitle" value="${product.producttitle }"></br>
    商品图片地址:<input name="productpicture" value="${product.productpicture }"></br>
    秒杀价格:<input name="miaoshaprice" value="${product.miaoshaprice }"></br>
    商品原价:<input name="originalprice" value="${product.originalprice }"></br>
    秒杀开始时间:<input name="starttime" value="${product.starttime }"></br>
    秒杀结束时间:<input name="endtime" value="${product.endtime}"></br>
    秒杀商品数量:<input name="productcount" value="${product.productcount }"></br>
    库存:<input name="stockcount" value="${product.stockcount }"></br>
    描述:<input name="description" value="${product.description }"></br>
    <input type="submit" value="修改完成" >
</form>
</body>
</html>
