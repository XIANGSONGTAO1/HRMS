<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/30
  Time: 16:37
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
<table border="1">
    <tr><td colspan="6" align="center">简历</td></tr>
    <tr>
        <td>姓名</td>
        <td>${r.name}</td>
        <td>性别</td>
        <td>${r.sex}</td>
        <td>年龄</td>
        <td>${r.age}</td>
    </tr>
    <tr>
        <td>毕业学校</td>
        <td>${r.school}</td>
        <td>专业</td>
        <td>${r.major}</td>
        <td>求职意向</td>
        <td>${r.jobintention}</td>
    </tr>
    <tr>
        <td>技能</td>
        <td>${r.skill}</td>
        <td>英语水平</td>
        <td>${r.englishlevel}</td>
    </tr>
    <tr>
        <td>工作经验</td>
        <td>${r.workexperience}</td>
    </tr>
    <tr>
        <td>联系电话</td>
        <td>${r.tel}</td>
        <td>邮箱地址</td>
        <td>${r.email}</td>
    </tr>
</table>
</body>
</html>