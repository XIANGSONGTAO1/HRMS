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
            var flag1
            var flag2
            var flag3
            $("#i1").blur(function () {
                $.ajax({
                    type:"post",
                    url:"checkName",
                    data:"name="+$("#i1").val(),
                    success:function (data) {
                        alert("ee")
                        alert(data)
                        if(data!=""){
                            flag1=false;
                        }else {
                            flag1=true;
                        }
                        $("#sp1").html(data);
                        $("#sp1").color("red")
                    }
                })
            })
            $("#i2").blur(function () {
                var reg=/^[a-zA-Z]\w{5,17}$/;
                if($(this).val()==""){
                    $("#sp2").html("密码不能为空");
                    flag2=false;
                }else if(!reg.test($(this).val())){
                    $("#sp2").html("以字母开头，长度在6~18之间，只能包含字符、数字和下划线")
                    flag2=false;
                }else{
                    $("#sp2").empty()
                    flag2=true
                }
            })
            $("#i3").blur(function () {
                if($(this).val()!=$("#i2").val()){
                    $("#sp3").html("前后密码不一致");
                    flag3=false;
                }else {
                    $("#sp3").empty()
                    flag3=true;
                }
            })
            $("#su1").click(function () {
                if(flag1==true&&flag2==true&&flag3==true){
                    $('form[name="vr"]').submit();
                }else{
                    return false;
                }
            })
        })
    </script>
</head>
<body>
    <div>
        <form action="visitorRegist" name="vr">
            请输入用户名：<input name="username" id="i1"><span id="sp1"></span><br>
            请输入密码:<input name="password" id="i2"><span id="sp2"></span><br>
            请再次输入密码：<input name="password2" id="i3"><span id="sp3"></span><br><br>
            <input type="button" value="注册" id="su1">
        </form>
    </div>
</body>
</html>