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
    <%--加载的样式--%>
    <link rel="stylesheet" href="css/bootstrap.min.css" />
    <link rel="stylesheet" href="css/bootstrap-responsive.min.css" />
    <link rel="stylesheet" href="css/matrix-style.css" />
    <link rel="stylesheet" href="css/matrix-media.css" />
    <link href="font-awesome/css/font-awesome.css" rel="stylesheet" />
</head>

<body>
<!--Header-part-->
<div id="header">
    <h1><a href="#">人事管理系统</a></h1>
</div>
<!--close-Header-part-->
<!--top-Header-menu-->
<div id="user-nav" class="navbar navbar-inverse">
    <ul class="nav">
        <li  class="dropdown" id="profile-messages" >
            <a title="" href="#" data-toggle="dropdown" data-target="#profile-messages" class="dropdown-toggle">
                <i class="icon icon-user"></i>&nbsp;
                <span class="text">欢迎你，${sessionScope.username}</span>&nbsp;
                <b class="caret"></b>
            </a>
            <ul class="dropdown-menu">
                <li><a href="#"><i class="icon-user"></i> 个人资料</a></li>
                <li class="divider"></li>
                <li><a href="#"><i class="icon-check"></i> 我的任务</a></li>
                <li class="divider"></li>
                <li><a href="index.jsp"><i class="icon-key"></i> 退出系统</a></li>
            </ul>
        </li>
        <li class="dropdown" id="menu-messages">
            <a href="#" data-toggle="dropdown" data-target="#menu-messages" class="dropdown-toggle">
                <i class="icon icon-envelope"></i>&nbsp;
                <span class="text">我的消息</span>&nbsp;
                <span class="label label-important">4</span>&nbsp;
                <b class="caret"></b>
            </a>
            <ul class="dropdown-menu">
                <li><a class="sAdd" title="" href="#"><i class="icon-plus"></i> 新消息</a></li>
                <li class="divider"></li>
                <li><a class="sInbox" title="" href="#"><i class="icon-envelope"></i> 收件箱</a></li>
                <li class="divider"></li>
                <li><a class="sOutbox" title="" href="#"><i class="icon-arrow-up"></i> 发件箱</a></li>
                <li class="divider"></li>
                <li><a class="sTrash" title="" href="#"><i class="icon-trash"></i> 回收站</a></li>
            </ul>
        </li>
        <li class=""><a title="" href="#"><i class="icon icon-cog"></i> <span class="text">&nbsp;设置</span></a></li>
        <li class=""><a title="" href="index.jsp"><i class="icon icon-share-alt"></i> <span class="text">&nbsp;退出系统</span></a></li>
    </ul>
</div>
<!--close-top-Header-menu-->

<!--start-top-serch-->
<div id="search">
    <input type="text" placeholder="搜索..." style="height: 30px"/>
    <button type="submit" class="tip-bottom" title="Search"><i class="icon-search icon-white"></i></button>
</div>
<!--close-top-serch-->
<!--sidebar-menu-->
<div id="sidebar" style="OVERFLOW-Y: auto; OVERFLOW-X:hidden;">
    <ul>
        <li class="submenu active">
            <a class="menu_a" link="view/selfmessage.jsp"><i class="icon icon-home"></i> <span>控制面板</span></a>
        </li>
        <li class="submenu">
            <a href="#">
                <i class="icon icon-table"></i>
                <span>用户管理</span>

            </a>
            <ul>
                <li><a class="menu_a" id="yonghu"  link="/user/userquery.action"><i class="icon icon-caret-right"></i>用户查询</a></li>
                <li><a class="menu_a" id="yonghu1" link="view/adduser.jsp"><i class="icon icon-caret-right"></i>添加用户</a></li>
                <li><a class="menu_a" id="yonghu3" link="view/updatepassword.jsp"><i class="icon icon-caret-right"></i>个人密码修改</a></li>
            </ul>
        </li>
        <li class="submenu">
            <a href="#">
                <i class="icon icon-th"></i>
                <span>部门管理</span>
            </a>
            <ul>
                <li><a class="menu_a" link="#"><i class="icon icon-caret-right"></i> 添加部门</a></li>
                <li><a class="menu_a" link="/dept/deptquery.action"><i class="icon icon-caret-right"></i>查询部门</a></li>
                <li><a class="menu_a" link="#"><i class="icon icon-caret-right"></i>删除部门</a></li>
                <li><a class="menu_a" link="#"><i class="icon icon-caret-right"></i>修改部门</a></li>
            </ul>
        </li>
        <li class="submenu">
            <a href="#">
                <i class="icon icon-stop"></i>
                <span>职位管理</span>
            </a>
            <ul>
                <li><a class="menu_a" link="#"><i class="icon icon-caret-right"></i>添加职位</a></li>
                <li><a class="menu_a" link="/job/jobquery.action"><i class="icon icon-caret-right"></i>查询职位</a></li>
                <li><a class="menu_a" link="#"><i class="icon icon-caret-right"></i>删除职位</a></li>
                <li><a class="menu_a" link="#"><i class="icon icon-caret-right"></i>修改职位</a></li>
            </ul>
        </li>
        <li class="submenu">
            <a href="#">
                <i class="icon icon-stop"></i>
                <span>员工管理</span>
            </a>
            <ul>
                <li><a class="menu_a" link="#"><i class="icon icon-caret-right"></i>添加员工</a></li>
                <li><a class="menu_a" link="#"><i class="icon icon-caret-right"></i>查询员工</a></li>
                <li><a class="menu_a" link="#"><i class="icon icon-caret-right"></i>删除员工</a></li>
                <li><a class="menu_a" link="#"><i class="icon icon-caret-right"></i>修改员工</a></li>
            </ul>
        </li>
        <li class="submenu">
            <a href="#">
                <i class="icon icon-th"></i>
                <span>公告管理</span>
            </a>
            <ul>
                <li><a class="menu_a" link="#"><i class="icon icon-caret-right"></i> 添加公告</a></li>
                <li><a class="menu_a" link="#"><i class="icon icon-caret-right"></i>查询公告</a></li>
                <li><a class="menu_a" link="#"><i class="icon icon-caret-right"></i>删除公告</a></li>
                <li><a class="menu_a" link="#"><i class="icon icon-caret-right"></i>修改公告</a></li>
            </ul>
        </li>
        <li class="submenu">
            <a href="#">
                <i class="icon icon-table"></i>
                <span>下载中心</span>
            </a>
            <ul>
                <li><a class="menu_a" id="yo"  link="#><i class="icon icon-caret-right"></i>上传文件</a></li>
                <li><a class="menu_a" id="yongh" link="#"><i class="icon icon-caret-right"></i>查询文件</a></li>
                <li><a class="menu_a" id="yong" link="#"><i class="icon icon-caret-right"></i>删除文件</a></li>
                <li><a class="menu_a" id="yong23" link="#"><i class="icon icon-caret-right"></i>下载文件</a></li>
            </ul>
        </li>
        <li class="submenu">
            <a href="#">
                <i class="icon icon-info-sign"></i>
                <span>错误页面</span>
                <!--<span class="label label-important">4</span>-->
            </a>
            <ul>
                <li><a class="menu_a" link="view/error403.jsp"><i class="icon icon-caret-right"></i>Error 403</a></li>
            </ul>
        </li>
    </ul>
</div>
<!--sidebar-menu-->

<!--main-container-part-->
<div id="content">
    <!--breadcrumbs-->
    <div id="content-header">
        <div id="breadcrumb"> <a href="index.jsp" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> Home</a></div>
    </div>
    <!--End-breadcrumbs,这里是该进入后台管理页面的时候就会显示的内容，相当于次首页内容了-->
    <iframe src="view/selfmessage.jsp" id="iframe-main" frameborder='0' style="width:100%;"></iframe>
</div>
<!--end-main-container-part-->

<script src="js/excanvas.min.js"></script>
<script src="js/jquery.min.js"></script>
<script src="js/jquery.ui.custom.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/nicescroll/jquery.nicescroll.min.js"></script>
<script src="js/matrix.js"></script>
<script type="text/javascript">
    $(document).ready(function(){
        var ident="<%=session.getAttribute("loginname")%>";
        if(ident!="admin"){
            document.getElementById("yonghu").style.visibility="hidden";
            document.getElementById("yonghu").style.display="none";
            document.getElementById("yonghu1").style.marginTop="-20px";
        }
        /*登录的是管理员*/
        else
        {
        }
    });
    //初始化相关元素高度
    function init(){
        $("body").height($(window).height()-80);
        $("#iframe-main").height($(window).height()-90);
        $("#sidebar").height($(window).height()-50);
    }
    //$(fucntion(){});相当于是$(doucument).ready(fucntion(){});的简写
    //加载页面的时候自动执行该部分内容
    $(function(){
        init();
        $(window).resize(function(){
            init();
        });
    });

    // This function is called from the pop-up menus to transfer to
    // a different page. Ignore if the value returned is a null string:
    function goPage (newURL) {
        // if url is empty, skip the menu dividers and reset the menu selection to default
        if (newURL != "") {
            // if url is "-", it is this page -- reset the menu:
            if (newURL == "-" ) {
                resetMenu();
            }
            // else, send page to designated URL
            else {
                document.location.href = newURL;
            }
        }
    }

    // resets the menu selection upon entry to this page:
    function resetMenu() {
        document.gomenu.selector.selectedIndex = 2;
    }

    // uniform使用示例：
    // $.uniform.update($(this).attr("checked", true));
</script>
</body>
</html>