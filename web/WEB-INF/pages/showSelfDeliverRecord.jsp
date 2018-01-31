<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/31
  Time: 10:27
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
    <table>
        <tr>
            <td>投递记录的ID</td>
            <td>投递人姓名</td>
            <td>投递时间</td>
            <td>面试时间</td>
            <td>面试地点</td>
            <td>应聘的部门</td>
            <td>应聘的岗位</td>
            <td>状态(1.等待面试 2.已经录用 -1.不能面试 -2.面试不过)</td>
        </tr>
        <c:forEach items="${dr}" var="dr">
            <tr>
                <td>${dr.id}</td>
                <td>${dr.resume.name}</td>
                <td>${dr.dilivertime}</td>
                <td>${dr.interviewtime}</td>
                <td>${dr.interviewplace}</td>
                <td>${dr.recruit.dept}</td>
                <td>${dr.recruit.position}</td>
                <td>${dr.status}</td>
            </tr>
        </c:forEach>

    </table>
</body>
</html>