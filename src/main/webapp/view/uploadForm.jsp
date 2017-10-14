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
</head>
<body>
  <h2>文件上传</h2>
  <form action="/doucument/addDocument.action" enctype="multipart/form-data" method="post">
      <table>
          <tr>
              <td>文件描述：</td>
              <td><input type="text" name="description"></td>
          </tr>
          <tr>
              <td>请选择文件：</td>
              <td><input type="file" name="file"></td>
          </tr>
          <tr>
              <td><input type="submit" value="上传"></td>
          </tr>
      </table>
  </form>
</body>
</html>