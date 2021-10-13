<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2021/9/23
  Time: 11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/doupdate" method="post">
    <table border="1">
        <tr>
            <td>产品名称</td>
            <td><input type="text" value="${qu.bname}" >
            <input type="hidden" value="${qu.id}" name="id">
                <input type="hidden" value="${qu.productId}" name="productId"></td>
        </tr>
        <tr>
            <td>质检结果</td>
            <td><select name="score">
                <option value="-1">全部</option>
                <option value="1" ${qu.score==1?"selected":""}>合格</option>
                <option value="2" ${qu.score==2?"selected":""}>不合格</option>
            </select></td>
        </tr>
        <tr>
        <td>描述</td>
        <td><input type="text" name="qualityDesc" value="${qu.qualityDesc}"></td>
    </tr>

        <tr>
            <td colspan="2"><input type="submit" value="提交"></td>
        </tr>
    </table>
</form>
</body>
</html>
