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
    <!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
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
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="jumbotron">
                <h1>
                    项目说明！
                </h1>
                <p>
                    本项目基于SSM框架，使用idea开发工具，主要实现简单人事管理系统，项目为个人独立项目。
                    由于近期需要找实习岗位，该项目写的有点急，从十月十号开始写，花费了十天左右的时间
                    从数据库建立到ssm框架搭建，然后到项目后台编写，前台页面整合，前台主页面使用模板，
                    其他多数页面使用boostrap模板。分为六个模块，前五个模块实现基本的功能，增加功能，查询功能，
                    模糊查询功能，本项目采用客户端分页。由于bootstrap框架提供分页查询，直接使用客户端分页。
                    删除功能实现多项删除，单项删除。修改信息获取对应的值，用户只要修改需要修改的值，其他的值
                    不需要动。文件上传模块主要是调用接口，实现文件上传，文件模糊查询,以及文件下载。
                    该项目大概内容完成后就发布到云服务器上，由于使用的tomcat不同，加上路径等各种问题，文件的
                    上传模块以前的数据可能无法使用导致报错，所有的数据库的内容，直接通过Navicat从本地数据库
                    传输到远程服务器。本项目是一个小项目，或者说存在极大的不足，也希望自己能够在以后逐步的去学习。
                </p>

            </div>
        </div>
    </div>
</div>

</body>
</html>