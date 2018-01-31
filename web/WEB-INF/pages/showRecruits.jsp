<%@ taglib prefix="for" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/29
  Time: 8:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title></title>
</head>
<body>
<a href="forAddResume">添加简历</a>
<a href="showSelfDeliverRecord">查看投递记录</a>
    <table border="1">
        <tr>
            <td>招聘编号</td>
            <td>部门</td>
            <td>职位</td>
            <td>描述</td>
            <td>状态</td>
            <td>投递简历</td>
        </tr>
        <for:forEach items="${sessionScope.recruits}" var="r">
            <tr>
                <td>${r.getId()}</td>
                <td>${r.getDept()}</td>
                <td>${r.getPosition()}</td>
                <td>${r.getDesc1()}</td>
                <td>${r.getStatus()}</td>
                <td><a href="chooseResume?rc_id=${r.getId()}">选择简历</a></td>
            </tr>
        </for:forEach>
    </table>

</body>
</html>