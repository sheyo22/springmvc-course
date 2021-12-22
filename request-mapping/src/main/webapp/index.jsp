<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+
            request.getServerPort()+request.getContextPath()+"/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>Title</title>
</head>
<body>
    <p>第一个springmvc</p>
    <p><a href="user/some.do">发起some.do的post请求</a> </p>
    <form action="user/some.do" method="post">
        <input type="text" name="rname"/><br/>
        <input type="text" name="rage"/>
        <input type="submit" value="submit"/>
    </form>
    <p><a href="user/other.do">发起other.do的get请求</a> </p>
    <p><a href="user/first.do">发起first.do请求</a> </p>
    <p><a href="user/hello.do">hello.do请求</a> </p>
</body>
</html>
