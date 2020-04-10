<%--
  Created by IntelliJ IDEA.
  User: 吴所谓
  Date: 2020/4/10
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/order/topay.do">
    购买数量：<input type="text" name="num" >
    <input type="hidden" name="id" value="${product.id}">
    <table border="1">
        <tr>
            <td>商品标题</td>
            <td>商品图片</td>
            <td>秒杀价格</td>
            <td>秒杀原价</td>
            <td>秒杀开始时间</td>
            <td>秒杀结束时间</td>
            <td>秒杀商品数</td>
            <td>秒杀数量</td>
            <td>库存</td>
        </tr>
        <tr>
            <td>${product.producttitle}</td>
            <td>${product.productpicture}</td>
            <td>${product.miaoshaprice}</td>
            <td>${product.originalprice}</td>
            <td>${product.starttime}</td>
            <td>${product.endtime}</td>
            <td>${product.productcount}</td>
            <td>${product.stockcount}</td>
        </tr>
    </table>
    <table border="1">
        <tr>
            <td>商品产地</td>
            <td>商品名称</td>
            <td>商品品牌</td>
            <td>商品重量</td>
            <td>规格和包装</td>
            <td>商品详情图片地址</td>
        </tr>
        <tr>
            <td>${productDetail.productplace}</td>
            <td>${productDetail.productname}</td>
            <td>${productDetail.brandname}</td>
            <td>${productDetail.productweight}</td>
            <td>${productDetail.specification}</td>
            <td>${productDetail.productdetailpicture}</td>
        </tr>
    </table>
    <input type="submit" value="立即购买">
</form>
</body>
</html>
