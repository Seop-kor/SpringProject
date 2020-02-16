<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: Seop
  Date: 2020-02-13
  Time: 오후 4:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Board</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
</head>
<body>
<%@include file="../menubar.jsp" %>
<div class="container-fluid justify-content-end">
    <form method="get", action="/board/boardList.writeaction">
        <input type="submit" class="btn-primary" value="글쓰기">
    </form>
</div>
<div class="container-fluid">
    <form method="get", action="/board/boardList.selectaction">
        <table class="table table-hover table-striped">
            <tr>
                <th>번호</th><th>제목</th><th>이름</th><th>작성일자</th><th>조회수</th>
            </tr>
            <c:forEach items="${list}" var="list">
                <tr>
                    <td><c:out value="${list.no}"></c:out> </td>
                    <td><c:out value="${list.title}"></c:out> </td>
                    <td><c:out value="${list.name}"></c:out> </td>
                    <td><fmt:formatDate value="${list.writedate}" pattern="yyyy-MM-dd"></fmt:formatDate> </td>
                    <td><c:out value="${list.readcount}"></c:out> </td>
                </tr>
            </c:forEach>
            <div class="justify-content-center">
                <input type="submit" value="검색">
            </div>
        </table>
    </form>
</div>
</body>
</html>
