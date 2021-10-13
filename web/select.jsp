<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2021/9/23
  Time: 11:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/doselect" method="post">
    <table border="1">
        <tr>
            <td>产品名称</td>
            <td><input type="text" name="productName" value="${qu.productName}">
            <input type="hidden" value="${qu.id}" name="id"></td>
        </tr>
        <tr>
            <td>产品描述</td>
            <td><textarea name="productDesc">${qu.productDesc}</textarea></td>
        </tr>
        <tr>
            <td>生产数量</td>
            <td><input type="text" name="productSum" value="${qu.productSum}"></td>
        </tr>
        <tr>
            <td>产品价格</td>
            <td><input type="text" name="productPrice" value="${qu.productPrice}"></td>
        </tr>
        <tr>
            <td>生产日期</td>
            <td><input type="text" name="productDate" value="${qu.productDate}"></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="提交"></td>
        </tr>
    </table>
</form>
</body>
</html>
