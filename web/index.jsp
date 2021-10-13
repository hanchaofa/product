<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2021/9/23
  Time: 8:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <script src="${pageContext.request.contextPath}/statics/jquery-1.12.4.min.js"></script>
  <script type="text/javascript">
    function toadd() {
        location.href="add.jsp";
    }
    function topage(pageIndex){
       /* $.ajax({
            url:"/show",
            resultType:"json",
            success:function (result) {
                var str="";
                if (result!=null){
                    for (var i=0;i<result.list.length;i++){
                        str+="<tr>"+
                            "<td>"+result[i].productName+"</td>"+
                            "<td>"+result[i].productDate+"</td>"+
                            "<td>"+result[i].productDesc+"</td>"+
                            "<td>"+result[i].scoreid+"</td>"+
                            "<td>"+result[i].productSum+"</td>"+
                            "<td>"+result[i].productPrice+"</td>"+
                            "<td>"+操作+"</td>"
                    }
                    $("#shows").append(str)
                }
            }
        })*/
        $("#pageIndex").val(pageIndex);
        $("form").submit();
    }


  </script>
  <body>
  <form action="/show" method="post">
    <input type="text" name="productName" value="${param.productName}">
    <input type="hidden" name="pageIndex" id="pageIndex">
    <input type="submit" value="查询">
    <input type="button" value="新增" onclick="toadd()">
  </form>
  <table border="1" id="shows">
    <tr>
      <td>产品名称</td>
      <td>生产日期</td>
      <td>产品描述</td>
      <td>质检结果</td>
      <td>生产数量</td>
      <td>产品价格</td>
      <td>操作</td>
    </tr>
<c:forEach var="p" items="${page.list}">
    <tr>
      <td>${p.productName}</td>
      <td>${p.productDate}</td>
      <td>${p.productDesc}</td>
      <td><c:if test="${p.scoreid==0}">未检测</c:if>
        <c:if test="${p.scoreid==1}">合格</c:if>
        <c:if test="${p.scoreid==2}">不合格</c:if></td>
      <td>${p.productSum}</td>
      <td>${p.productPrice}</td>
      <td><a href="/toupdate?id=${p.id}">质检</a>
        <a href="/toselect?id=${p.id}">修改</a></td>
    </tr>
</c:forEach>
  </table>
  <c:if test="${page.pageIndex!=1}">
    <a href="javascript:topage(1)">首页</a>
    <a href="javascript:topage(${page.pageIndex-1})">上一页</a>
  </c:if>
  <c:if test="${page.pageIndex!=page.pageCount}">
    <a href="javascript:topage(${page.pageIndex}+1)">下一页</a>
    <a href="javascript:topage(${page.pageCount})">尾页</a>
  </c:if>
  </body>
</html>
