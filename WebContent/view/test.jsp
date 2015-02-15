<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>Lily's lily - 好玩的个人主页</title>
    <meta name="keywords" content="个人主页,个人网站,前端,设计,电影,生活" />
    <meta name="description" content="Lily_Vain的个人主页，用于展示、记录、收集学习和生活中的美好的点滴。" />
    <meta name="author" content="Lily_Vain，狐二十三" />
    <link rel="Shortcut Icon" href="liv.ico" />
    <link href="style/base.css" rel="stylesheet">
</head>
<body>
    <footer class="top-fixed">
    <a href=<%=basePath %>>Lily's Lily</a>
    <a href="test.jsp">管理入口&gt;&gt;</a>
    <ul class="line top-links">
        <li><a href="https://docs.webplatform.org/wiki/html/elements" title="HTML元素" target="_blank">HTML Elements</a></li>
        <li><a href="http://compass-style.org/" title="" target="_blank">Compass Home</a></li>
        <li><a href="http://commons.apache.org/proper/commons-fileupload/" target="_blank">FileUpload</a></li>
        <li><a href="http://stackoverflow.com/" target="_blank">StackOverflow</a></li>
    </ul>
</footer>

</body>
</html>