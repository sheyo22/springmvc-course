<%--
  Created by IntelliJ IDEA.
  User: ZLC
  Date: 2021/12/21
  Time: 15:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+
            request.getServerPort()+request.getContextPath()+"/";
%>
<html>
<head>
    <title>Title</title>
    <base href="<%=basePath%>">
    <script type="text/javascript" src="static/js/jquery-3.4.1.js"></script>
    <script type="text/javascript">
    </script>
</head>
<body>
    <div>
        <h1>主页</h1><br>
        <img src="static/pic/133924.png" alt="截图">
        <form method="post" action="">
            <input type="text" id="name"><br/>
            <input type="password" id="password"><br/>
            <input type="submit" id="loginBtn" value="login">
        </form>
        <input type="button" id="logoutBtn" value="logout">
    <table>
        <tr>
            <td><a href="addStudent.jsp">注册学生</a></td>
            <td><a href="listStudent.jsp">浏览学生</a></td>
        </tr>
    </table>
    </div>
</body>
</html>
