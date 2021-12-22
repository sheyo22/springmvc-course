<%--
  Created by IntelliJ IDEA.
  User: ZLC
  Date: 2021/12/21
  Time: 15:51
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
    <script type="text/javascript" src="WEB-INF/js/jquery-3.4.1.js"></script>
    <script type="text/javascript">

    </script>
</head>
<body>
<div>
<h1>注册页面</h1><br>
<img src="static/pic/133924.png">
</div>
<form method="post" action="student/addStudent.do">
    <table>
        <tr>
            <td>
                姓名：
            </td>
            <td>
                <input type="text" name="name">
            </td>
        </tr>
        <tr>
            <td>
                年龄：
            </td>
            <td>
                <input type="text" name="age">
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="submit">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
