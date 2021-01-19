<%--
  Created by IntelliJ IDEA.
  User: 25179
  Date: 2021/1/16
  Time: 14:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>修改</title>
</head>
<body>
<div align="center">
    <form action="${pageContext.request.contextPath}/detail/doUp?id=${oneNews.id}" method="post" id="sob">
        <table width="500" border="1" cellpadding="0" cellspacing="0">
            <tr>
                <th colspan="2" id="wtf">
                    <h2>更新新闻内容</h2>
                </th>
            </tr>
            <tr>
                <td>新闻编号</td>
                <td>${oneNews.id}</td>
            </tr>
            <tr>
                <td>新闻分类</td>
                <c:if test="${oneNews.categoryid==1}">
                    <td>社会</td>
                </c:if>
                <c:if test="${oneNews.categoryid==2}">
                    <td>体育</td>
                </c:if>
            </tr>
            <tr>
                <td>新闻标题(*)</td>
                <td>
                    <input name="title" value="${oneNews.title}" required="required" id="title">
                </td>
            </tr>
            <tr>
                <td>新闻摘要</td>
                <td>
                    <input name="summary" value="${oneNews.summary}">
                </td>
            </tr>
            <tr>
                <td>作者</td>
                <td>
                    <input name="author" value="${oneNews.author}">
                </td>
            </tr>
            <tr><td colspan="2">
                <input type="submit" value="提交">
            </td></tr>
        </table>
    </form>
</div>

</body>
</html>
