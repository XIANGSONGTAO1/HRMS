<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
    <script src="js/jquery-3.1.0.js"></script>
    <script>
        $(function () {
            $("#dept").change(function () {
                var d=$(this).val()
                alert(d)
                $.ajax({
                    url:"getPositionByDept",
                    data:{"d":d},
                    javaType:"json",
                    success:function (positions) {
                        $("#position").empty()
                        var p=eval(positions)
                        alert(JSON.stringify(p))
                        var str="";
                        $.each(positions,function (index,value) {
                            str+="<option value="+value.id+">"+value.name+"</option>"
                        })
                        $("#position").append(str)
                    }
                })
            })
            $("#bt").click(function () {
                var d1=$("#dept").val()
                var p1=$("#position").val()
                $.ajax({

                })
            })
        })
    </script>
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
                <td>
                    <form action="addEmployee">
                        部门：<select id="dept" name="deptId">
                        <option value="0">请选择</option>
                        <c:forEach items="${depts}" var="dp">
                            <option value="${dp.getId()}">${dp.getName()}</option>
                        </c:forEach>
                    </select>
                        职位：<select id="position" name="positionId">
                        <option value="0">请选择</option>
                    </select>
                        <input type="hidden" name="email" value="${bi.resume.email}">
                        <input type="hidden" name="tel" value="${bi.resume.tel}">
                        <input type="hidden" name="trueName" value="${bi.resume.name}">
                        <input type="hidden" name="sex" value="${bi.resume.sex}">
                        <input type="hidden" name="age" value="${bi.resume.age}">
                        <input type="hidden" name="userName" value="${bi.visitor.username}">
                        <input type="hidden" name="password" value="${bi.visitor.password}">
                        <input type="submit" value="录用">
                    </form>
                </td>
                <td><a href="refuseHire?dlId=${bi.id}">拒绝录用</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>