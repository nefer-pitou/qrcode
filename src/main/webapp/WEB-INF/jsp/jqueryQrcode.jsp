<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/4/4
  Time: 15:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html:charset=utf-8">
    <title>生成二维码图片</title>
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-2.0.0.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.qrcode.min.js"></script>
</head>
<body>
<div id="qrcode"></div>
<script type="text/javascript">
    jQuery('#qrcode').qrcode("www.baidu.com");
</script>
</body>
</html>
