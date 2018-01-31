<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/31
  Time: 9:51
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
            <td>记录ID</td>
            <td>应聘部门</td>
            <td>应聘岗位</td>
            <td>求职者姓名</td>
            <td>面试时间</td>
            <td>面试地点</td>
            <td>录用</td>
            <td>拒绝</td>
        </tr>
        <c:forEach items="${bi}" var="bi">
            <tr>
                <td>${bi.id}</td>
                <td>${bi.recruit.dept}</td>
                <td>${bi.recruit.position}</td>
                <td>${bi.resume.name}</td>
                <td>${bi.interviewtime}</td>
                <td>${bi.interviewplace}</td>
                <td><a>录用</a></td>
                <td><a href="refuseHire?dlId=${bi.id}">拒绝录用</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>