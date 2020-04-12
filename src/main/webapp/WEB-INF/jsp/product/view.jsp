<%--
  Created by IntelliJ IDEA.
  User: 吴所谓
  Date: 2020/4/9
  Time: 21:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
秒杀商品的id: ${product.productid }</br>
秒杀商品的标题: ${product.producttitle }</br>
秒杀商品的图片地址: ${product.productpicture }</br>
秒杀商品价格: ${product.miaoshaprice }</br>
商家的id: ${product.merchantid }</br>
商品原价: ${product.originalprice }</br>
秒杀商品的申请时间: ${product.applydate }</br>
秒杀商品的审核时间: ${product.auditstatus }</br>
秒杀的开始时间: ${product.starttime }</br>
秒杀的结束时间: ${product.endtime }</br>
秒杀数量: ${product.productcount }</br>
秒杀的库存: ${product.stockcount }</br>
秒杀的描述: ${product.description }</br>
<a href="/product/selbyvo.do?merchantid=${merchant.id}"><input type="button" value="返回该商家商品列表" ></a>
</body>
</html>
