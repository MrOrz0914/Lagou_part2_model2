<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/1/20
  Time: 16:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
    <title>Title</title>
    <style>
        span {
            display: inline-block;
            width: 150px;
            margin-left: 15px;
        }
        .add-button {
            margin-left: 550px;
        }
    </style>
</head>
<body>
<h2>我是服务器：${pageContext.request.localPort}</h2>
<h2>当前sessionId：${pageContext.session.id}</h2>
<button class="add-button">新增</button>
<c:forEach items="${resumeList }" var="resume">
    <div class="col-md-2">
        <span><c:out value='${resume.id }'/></span>
        <span><c:out value='${resume.name }'/></span>
        <span><c:out value='${resume.address }'/></span>
        <span><c:out value='${resume.phone }'/></span>
        <span><button>编辑</button></span>
        <span><button style="color: red;">删除</button></span>
    </div>
</c:forEach>
</body>
</html>
