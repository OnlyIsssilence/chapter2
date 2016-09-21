<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/9/12
  Time: 13:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="BASE" value="${pageContext.request.contextPath}"/>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>无标题文档</title>
</head>
<body>
<div align="center">
    <H3>经纪人手机号</H3>
    <form id="form1" name="form1" method="get" action="<%=request.getContextPath()%>/broker">
        <table width="90%" border="1" class="tableEdit">
            <tr>
                <td width="34%">经纪人手机号</td>
                <td width="66%">
                    <input type="text" name="f_Phone" id="f_Phone"/>
            </tr>

            <td colspan="2">
                <label>
                    <input type="submit" name="button" id="button" value="提交"/>
                </label>
            </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
