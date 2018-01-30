<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/30
  Time: 13:52
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
    <form action="addResume">
        <table border="1">
            <tr><td colspan="6" align="center">简历</td></tr>
            <tr>
                <td>姓名</td>
                <td><input name="name"></td>
                <td>性别</td>
                <td><input name="sex"></td>
                <td>年龄</td>
                <td><input name="age" type="number"></td>
            </tr>
            <tr>
                <td>毕业学校</td>
                <td><input name="school"></td>
                <td>专业</td>
                <td><input name="major"></td>
                <td>求职意向</td>
                <td><input name="jobintention"></td>
            </tr>
            <tr>
                <td>技能</td>
                <td><input name="skill"></td>
                <td>英语水平</td>
                <td><input name="englishlevel"></td>
            </tr>
            <tr>
                <td>工作经验</td>
                <td><input name="workexperience"></td>
            </tr>
            <tr>
                <td>联系电话</td>
                <td><input name="tel"></td>
                <td>邮箱地址</td>
                <td><input name="email"></td>
            </tr>
            <tr>
                <td><input type="submit" value="添加"></td>
            </tr>
        </table>
    </form>
</body>
</html>