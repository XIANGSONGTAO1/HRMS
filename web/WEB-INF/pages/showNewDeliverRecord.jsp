<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/30
  Time: 16:03
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
        <tr>
            <td>投递记录的ID</td>
            <td>投递人姓名</td>
            <td>投递时间</td>
            <td>应聘的部门</td>
            <td>应聘的岗位</td>
            <td>简历</td>
            <td>发送面试邀请</td>
            <td>拒绝面试</td>
        </tr>
        <c:forEach items="${dl}" var="dl">
           <tr>
               <td>${dl.id}</td>
               <td>${dl.resume.name}</td>
               <td>${dl.dilivertime}</td>
               <td>${dl.recruit.dept}</td>
               <td>${dl.recruit.position}</td>
               <td><a href="showResumeById?resumeId=${dl.resume.id}">查看简历</a></td>
               <td><form action="interviewInvitation">
                   输入面试时间：<input name="interviewTime">输入面试地点：<input name="interviewPlace">
                   <input type="hidden" name="dlId" value="${dl.id}">
                   <input type="submit" value="发送邀请">
               </form></td>
               <td><a href="dontSendInvitation?dlId=${dl.id}">拒绝发送面试邀请</a></td>
           </tr>
        </c:forEach>
    </table>
</body>
</html>