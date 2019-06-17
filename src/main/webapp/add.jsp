<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <style type="text/css">
        body{
            overflow-x:hidden;
        }
    </style>
</head>
<body>
<form class="form-horizontal" role="form" action="login" method="post">
    <div class="form-group">
        <label class="col-sm-1 control-label">用户名</label>
        <div class="col-sm-3">
            <input type="text" class="form-control" name="name" placeholder="">
        </div>
    </div>
    <div class="form-group">
        <label class="col-sm-1 control-label">密码</label>
        <div class="col-sm-3">
            <input type="text" class="form-control" name="password" placeholder="">
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-1 col-sm-3">
            <button type="submit" class="btn btn-default">登录</button>
        </div>
    </div>
</form>
</body>
</html>
