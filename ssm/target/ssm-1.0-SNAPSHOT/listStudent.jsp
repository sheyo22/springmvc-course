<%--
  Created by IntelliJ IDEA.
  User: ZLC
  Date: 2021/12/21
  Time: 16:19
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
    <base href="<%=basePath%>"/>
    <script type="text/javascript" src="static/js/jquery-3.4.1.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#btn").click(function () {
                loadStudentData();
            })
            loadStudentData();
        })
        function loadStudentData(){
            $.ajax({
                url:"student/listAll.do",
                method:"post",
                dataType:"json",
                success:function (data) {
                    $("#info").html("");
                    $.each(data,function (i,n) {
                        $("#info").append("<tr>")
                            .append("<td>"+n.id+"</td>")
                            .append("<td>"+n.name+"</td>")
                            .append("<td>"+n.age+"</td>")
                            .append("</tr>")
                    })
                }
            })
        }
    </script>
</head>
<body>
    <div align="center">
        <table>
            <thead>
            <tr>
                <td>id</td>
                <td>name</td>
                <td>age</td>
            </tr>
            </thead>
            <tbody id="info">

            </tbody>
        </table>
        <button id="btn">find</button>
    </div>
</body>
</html>
