<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
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
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="css/bootstrap.min.css" />
    <link rel="stylesheet" href="css/bootstrap-responsive.min.css" />
    <link rel="stylesheet" href="css/uniform.css" />
    <link rel="stylesheet" href="css/select2.css" />
    <link rel="stylesheet" href="css/matrix-style2.css" />
    <link rel="stylesheet" href="css/matrix-media.css" />
    <link href="font-awesome/css/font-awesome.css" rel="stylesheet" />
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800' rel='stylesheet' type='text/css'>
</head>

<body>
<div id="content">
    <div id="content-header">
        <h1>用户表格</h1>
    </div>
    <div class="container-fluid">
        <div class="row-fluid">
            <div class="span12">
                <div class="widget-box">
                    <div class="widget-title"> <span class="icon"><i class="icon-th"></i></span>
                        <h5>用户信息显示</h5>
                    </div>
                    <div class="widget-content nopadding">
                        <form action="/user/deletemore.action" method="post">
                        <table class="table table-bordered data-table">
                            <thead>
                            <tr>
                                <th><input name="selectname" type="checkbox" value=""/></th>
                                <th>用户名</th>
                                <th>状态</th>
                                <th>创建日期</th>
                                <th>登陆身份</th>
                                <th>操作</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach var="user" items="${userlist}">
                                <tr class="gradeX">
                                    <td><input name="selectname" type="checkbox" value="${user.id}"/></td>
                                    <td>${user.username}</td>
                                    <td>${user.status}</td>
                                    <td><spring:eval expression="user.createDate"></spring:eval></td>
                                    <td>${user.loginname}</td>
                                    <td><a href="/user/deleteuser.action?id=${user.id}"
                                    style="color: #0e90d2">删除</a>||
                                        <a href="view/updateuser.jsp?loginname=${user.loginname}
                                                 &username=${user.username}&password=${user.password}
                                                 &id=${user.id}"
                                           style="color: #0e90d2">修改</a>
                                    </td>

                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                            <input type="submit" value="多选删除" style="color: #A1A1A1;border-radius: 15px;">
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<script src="js/jquery.min.js"></script>
<script src="js/jquery.ui.custom.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery.uniform.js"></script>
<script src="js/select2.min.js"></script>
<script src="js/jquery.dataTables.min.js"></script>
<script src="js/matrix.js"></script>
<script src="js/matrix.tables.js"></script>
</body>
</html>