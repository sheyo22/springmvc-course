<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/jquery-3.4.1.js"></script>
    <script type="text/javascript">
        $(function () {
            $("button").click(function () {
                $.ajax({
                    url:"user/returnString-ajax.do",
                    data:{
                        name:"张三",
                        age:20,
                    },
                    type:"post",
                    //dataType:"json",
                    success:function (resp) {
                        alert(resp);
                    }
                })
            })
        })
    </script>
</head>
<body>
    <p>第一个springmvc</p>
    <p><a href="user/some.do">发起some.do的post请求</a> </p>
    <form action="user/some.do" method="post">
        姓名：<input type="text" name="rname"/><br/>
        年龄：<input type="text" name="rage"/><br/>
        <input type="submit" value="submit"/>
    </form>
    <p><a href="user/other.do">发起other.do的get请求</a> </p>
    <p><a href="user/first.do">发起first.do请求</a> </p>
    <br/>
    <button id="ajax">发起ajax</button>
</body>
</html>
