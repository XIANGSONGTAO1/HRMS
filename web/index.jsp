<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/26
  Time: 11:20
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
<div>
    <form>
        用户名：<input name="username"><br>
        密码：<input name="password"><br>
        身份：游客：<input type="radio" name="identity" value="visitor">员工：<input type=radio name="identity" value="employee">
                    管理员：<input type="radio" type="radio" name="identity" value="admin"><br>
        <input type="submit" value="登录"><input type="reset"><br>
        <a href="WEB-INF/pages/visitorRegist.jsp">游客注册</a>

    </form>
</div>

</body>
</html>