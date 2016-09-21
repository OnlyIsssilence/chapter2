<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/8/23
  Time: 17:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="BASE" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>积分相关操作</title>
</head>


<body>
<h1 align="center">积分相关操作</h1>
<div>
    <table width="900" height="20" border="0" align="center">
        <tr>
            <td>
                <a href="${BASE}/pointmainadd">总积分添加</a>
                <a href="${BASE}/pointdetailadd">积分细则添加</a>
                <a href="${BASE}/brokerdetail">经纪人详情查看</a>
            </td>
        </tr>
    </table>
</div>
</body>
</html>
