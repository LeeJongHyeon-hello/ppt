<%@ page import="com.example.demo.entity.oauth2.User" %><%--
  Created by IntelliJ IDEA.
  User: ijonghyeon
  Date: 2022/10/07
  Time: 8:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>this is home JSP</h1>
    <a href="/oauth2/authorization/google">google login</a>

    <div>
        <p>이름: ${username}</p>
        <p>이메일: ${email}</p>
        <img src="${userImg}">
    </div>

    <form method="post" action="/logout">
        <button>Log out</button>
    </form>
</body>
</html>
