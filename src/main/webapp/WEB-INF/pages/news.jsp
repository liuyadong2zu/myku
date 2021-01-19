<%--
  Created by IntelliJ IDEA.
  User: 25179
  Date: 2021/1/15
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>新闻列表</title>
</head>
<body>
    <div align="center">
        <span>
            <form method="post" action="${pageContext.request.contextPath}/detail/getAllDet">
            新闻类型:<select name="categoryid">
            <option value="-1">全部</option>
            <option value="1">社会</option>
            <option value="2">体育</option>
        </select>
            <input type="submit" value="查询"/>
        </form>
        </span>
        <span>
            <form method="post" action="${pageContext.request.contextPath}/detail/getAllDet">
                新闻标题:<input name="title"/>
                <input type="submit" value="查询"/>
            </form>
        </span>
        <table border="1" cellspacing="1" cellpadding="1" width="900">
            <tr>
                <td>新闻编号</td>
                <td>新闻标题</td>
                <td>新闻摘要</td>
                <td>作者</td>
                <td>创建时间</td>
                <td>操作</td>
            </tr>
            <c:forEach items="${detail}" var="det">
                <tr>
                    <td>${det.id}</td>
                    <td>${det.title}</td>
                    <td>${det.summary}</td>
                    <td>${det.author}</td>
                    <td>${det.createdate}</td>
                    <td>
                        <a href="${pageContext.request.contextPath}/detail/toUp?id=${det.id}">修改</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery-1.12.4.js"></script>
        <script type="text/javascript">
            $(function () {
                $("tr:odd").css("background-color","aquamarine");
            })
        </script>
    </div>
</body>
</html>
