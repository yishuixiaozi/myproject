<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>My JSP 'index.jsp' starting page</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
</head>

<body>
<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="https://code.jquery.com/jquery.js"></script>
<!-- 包括所有已编译的插件 -->
<script src="js/bootstrap.min.js"></script>
<div class="row clearfix">
    <div class="col-md-12 column">
        <div class="page-header">
            <h2>
                员工添加
            </h2>
        </div>
    </div>
</div>
<form class="form-horizontal" role="form" action="/employee/addemp.action" method="post">
    <div class="form-group">
        <label for="firstname" class="col-sm-5 control-label">姓名</label>
        <div class="col-sm-3">
            <input type="text" class="form-control" id="firstname" name="name"
                   placeholder="请输入名字">
        </div>
    </div>
    <div class="form-group">
        <label for="firstname" class="col-sm-5 control-label">身份证号码</label>
        <div class="col-sm-3">
            <input type="text" class="form-control" id="lasttname" name="cardid"
                   placeholder="请输入身份证号">
        </div>
    </div>

    <div class="form-group">
        <label for="firstname" class="col-sm-5 control-label">性别</label>
        <div class="col-sm-3">
            <select class="form-control" name="sex">
                <option value="男">男</option>
                <option value="女">女</option>
            </select>
        </div>
    </div>

    <div class="form-group">
        <label for="firstname" class="col-sm-5 control-label">职位</label>
        <div class="col-sm-3">
            <select class="form-control" name="jobid">
                <option value="2">java开发工程师</option>
                <option value="3">java中级开发工程师</option>
                <option value="4">java高级开发工程师</option>
                <option value="5">系统管理员</option>
                <option value="1">普通职员</option>
            </select>
        </div>
    </div>

    <div class="form-group">
        <label for="firstname" class="col-sm-5 control-label">所属部门</label>
        <div class="col-sm-3">
            <select class="form-control" name="deptid">
                <option value="1">技术部</option>
                <option value="2">运营部</option>
                <option value="3">财务部</option>
                <option value="4">总公办</option>
                <option value="5">市场部</option>
            </select>
        </div>
    </div>

    <div class="form-group">
        <label for="firstname" class="col-sm-5 control-label">住址</label>
        <div class="col-sm-3">
            <input type="text" class="form-control" id="lasttname1" name="address"
                   placeholder="请输入住址">
        </div>
    </div>

    <div class="form-group">
        <label for="firstname" class="col-sm-5 control-label">学历</label>
        <div class="col-sm-3">
            <input type="text" class="form-control" id="lasttname2" name="education"
                   placeholder="请输入学历">
        </div>
    </div>

    <div class="form-group">
        <label for="firstname" class="col-sm-5 control-label">联系电话</label>
        <div class="col-sm-3">
            <input type="text" class="form-control" id="lasttname3" name="phone"
                   placeholder="请输入联系电话">
        </div>
    </div>

    <div class="form-group">
        <label for="firstname" class="col-sm-5 control-label">邮箱</label>
        <div class="col-sm-3">
            <input type="text" class="form-control" id="lasttname4" name="email"
                   placeholder="请输入邮箱">
        </div>
    </div>

    <div class="form-group">
        <div class="col-sm-offset-5 col-sm-10">
            <button type="submit" class="btn btn-default">添加</button>
            <button type="reset" class="btn btn-default">取消</button>
        </div>
    </div>
</form>
</body>
</html>