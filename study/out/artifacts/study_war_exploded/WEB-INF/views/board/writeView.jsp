<%--
  Created by IntelliJ IDEA.
  User: Seop
  Date: 2020-02-11
  Time: 오후 5:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>게시판</title>
</head>
<body>
<div id="root">
    <header>
        <h1> 게시판</h1>
    </header>
    <hr />

    <nav>
        홈 - 글 작성
    </nav>
    <hr />

    <section id="container">
        <form role="form" method="post" action="/board/write">
            <table>
                <tbody>
                <tr>
                    <td>
                        <label for="title">제목</label><input type="text" id="title" name="title" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <label for="content">내용</label><textarea id="content" name="content" ></textarea>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label for="name">작성자</label><input type="text" id="name" name="name" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <label for="pass">비밀번호</label><input type="password" id="pass" name="pass" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <label for="writedate">작성일자</label><input type="text" id="writedate" name="writedate" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <button type="submit">작성</button>
                    </td>
                </tr>
                </tbody>
            </table>
        </form>
    </section>
    <hr />
</div>
</body>
</html>
