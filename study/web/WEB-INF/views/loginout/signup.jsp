<%--
  Created by IntelliJ IDEA.
  User: Seop
  Date: 2020-02-13
  Time: 오후 8:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>회원가입</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta charset="utf-8">
    <link rel="stylesheet" href="/resource/css/bootstrap.min.css">
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="/resource/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container-fluid">
    <form method="post" action="/loginout/signup.action">
        <table class="row justify-content-center">
            <tr class="row">
                <td class="col"><label for="mid">ID</label><input type="text" name="mid" id="mid" class="form-control"></td>
            </tr>

            <tr class="row">
                <td class="col"><label for="mpass">PassWord</label><input type="password" name="mpass" id="mpass" class="form-control"></td>
            </tr>

            <tr class="row">
                <td class="col"><label for="mpass_check">PassWord Check</label><input type="password" name="mpass_check" id="mpass_check" class="form-control"></td>
            </tr>
            <tr class="row">
                <td class="col"><label for="mname">Name</label><input type="text" name="mname" id="mname" class="form-control"></td>
            </tr>
            <tr class="row">
                <td class="col"><input type="submit" value="회원가입" class="btn bg-success"></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
