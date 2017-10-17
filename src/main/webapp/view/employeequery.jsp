<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
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
        <h1>员工表格</h1>
    </div>
    <div class="container-fluid">
        <div class="row-fluid">
            <div class="span12">
                <div class="widget-box">
                    <div class="widget-title"> <span class="icon"><i class="icon-th"></i></span>
                        <h5>员工信息显示</h5>
                    </div>
                    <div class="widget-content nopadding">
                        <table class="table table-bordered data-table">
                            <thead>
                            <tr>
                                <th>序号</th>
                                <th>姓名</th>
                                <th>卡号</th>
                                <th>住址</th>
                                <th>电话</th>
                                <th>邮箱</th>
                                <th>性别</th>
                                <th>学历</th>
                                <th>创建时间</th>
                                <th>操作</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach var="employee" items="${employeelist}">
                                <tr class="gradeX">
                                    <td>${employee.id}</td>
                                    <td>${employee.name}</td>
                                    <td>${employee.cardid}</td>
                                    <td>${employee.address}</td>
                                    <td>${employee.phone}</td>
                                    <td>${employee.email}</td>
                                    <td>${employee.sex}</td>
                                    <td>${employee.education}</td>
                                    <td><spring:eval expression="employee.createdate"></spring:eval></td>
                                    <td><a href="/employee/deleteemployee.action?id=${employee.id}"
                                           style="color: #0e90d2">删除</a>
                                    <a href="view/updateemployee.jsp?id=${employee.id}&name=${employee.name}
                                    &cardid=${employee.cardid}&address=${employee.address}&phone=${employee.phone}
                                    &email=${employee.email}&education=${employee.education}"
                                       style="color: #0e90d2">修改</a>
                                    </td>
                                  <%--  &address=${employee.address}&phone=${employee.phone}&
                                    email=${employee.email}&education=${employee.education}<td>${employee.createdate}</td>--%>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
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