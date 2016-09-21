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
    <title>积分列表</title>
</head>

<body>


<h1>积分列表</h1>
<table>
    <tr>
        <th>积分Kid</th>
        <th>UK</th>
        <th>总积分</th>
        <th>已用积分</th>
        <th>剩余积分</th>
    </tr>

    <c:forEach var ="pointmain" items = "${pointMainList}">
        <tr>
            <td>${pointmain.kid}</td>
            <td>${pointmain.f_UserToken}</td>
            <td>${pointmain.f_PointAll}</td>
            <td>${pointmain.f_PointCash}</td>
            <td>${pointmain.f_PointBalance}</td>
            <td>
                <a href = "${BASE}/customeredit?id=${pointmain.kid}">编辑</a>
                <a href = "${BASE}/customerdelete?id=${pointmain.kid}">删除</a>
            </td>

        </tr>

    </c:forEach>

</table>


</body>
</html>
