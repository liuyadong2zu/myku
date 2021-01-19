<%--
  Created by IntelliJ IDEA.
  User: 25179
  Date: 2021/1/15
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/statics/css/index.css"/>
</head>
<body>
<div id="con">
    <div id="top">
        <h1>新闻管理系统</h1>
    </div>
    <div id="bottom">
        <div class="left" align="center">
            <a href="welcome.jsp" target="frame">首&nbsp;&nbsp;&nbsp;&nbsp;页</a><br/><br/>
            <a href="detail/getAllDet" target="frame">新闻列表</a><br/><br/>
        </div>
        <div class="right" >
            <iframe frameborder="0" name="frame" src="welcome.jsp" width="90%" height="80%">

            </iframe>
        </div>
    </div>
</div>
</body>
</html>
