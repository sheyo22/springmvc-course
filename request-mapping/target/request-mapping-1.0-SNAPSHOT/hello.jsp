<%--
  Created by IntelliJ IDEA.
  User: ZLC
  Date: 2021/12/17
  Time: 17:09
  To change this template use File | Settings | File Templates.
--%>
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
    <h3>///first.jsp</h3>
    <h3>msg:${param.msg}</h3><br/>
    <h3>fun:${param.fun}</h3><br/>
</body>
</html>
