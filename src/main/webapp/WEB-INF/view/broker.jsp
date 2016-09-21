<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/8/23
  Time: 17:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<c:set var = "BASE" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>经纪人列表</title>
</head>

<body>


<h1>经纪人列表</h1>
<table>
    <tr>
        <th>经纪人Kid</th>
        <th>经纪人电话</th>
        <th>经纪人名称</th>
        <th>积分表Kid</th>
        <th>经纪人UK</th>
        <th>经纪人总积分</th>
        <th>经纪人已使用的积分</th>
        <th>经纪人剩余积分</th>
    </tr>

    <c:forEach var ="broker" items = "${brokerEntityList}">
        <tr>
            <td>${broker.kid}</td>
            <td>${broker.f_Phone}</td>
            <td>${broker.f_Title}</td>
            <td>${broker.pointKid}</td>
            <td>${broker.f_UserToken}</td>
            <td>${broker.f_PointAll}</td>
            <td>${broker.f_PointCash}</td>
            <td>${broker.f_PointBalance}</td>
        </tr>

    </c:forEach>

</table>

<table>
    <tr>
        <th>积分细则表Kid</th>
        <th>积分表Kid</th>
        <th>楼盘Kid</th>
        <th>积分规则</th>
        <th>添加时间</th>
        <th>添加来源</th>
        <th>添加的积分</th>
        <th>ProductExchangeKid</th>
    </tr>

    <c:forEach var ="pointDetailNew" items = "${pointDetailNewList}">
        <tr>
            <td>${pointDetailNew.kid}</td>
            <td>${pointDetailNew.f_PointId}</td>
            <td>${pointDetailNew.f_BuildingKid}</td>
            <td>${pointDetailNew.f_PointCode}</td>
            <td>${pointDetailNew.f_AddTime}</td>
            <td>${pointDetailNew.f_PointSource}</td>
            <td>${pointDetailNew.f_Point}</td>
            <td>${pointDetailNew.f_ProductExchangeKid}</td>
        </tr>

    </c:forEach>

</table>


</body>
</html>
