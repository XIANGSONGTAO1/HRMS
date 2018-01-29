<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/26
  Time: 16:57
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
    <script src="js/jquery-3.1.0.js"></script>
    <script>
        $(function () {
            $("#i1").click(function () {
                $.ajax({
                    type:"post",
                    url:"checkName",
                    data:"name="+$("#i1").val(),
                    success:function (data) {
                        $("#sp1").html(data);
                        $("#sp1").color("red")
                    }
                })
            })
        })
    </script>
</head>
<body>
    <div>
        <form action="/visitorRegist">
            <input name="username" id="i1"><span id="sp1"></span><br>
            <input name="password"><br>
            <input name="password2"><br><br>
            <input type="submit" value="注册">
        </form>
    </div>
</body>
</html>