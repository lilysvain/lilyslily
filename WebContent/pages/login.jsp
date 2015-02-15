<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>神秘的登录入口</title>
    <base href=<%=basePath %> />
    <link rel="Shortcut Icon" href="liv.ico" />
    <link href="style/base.css" rel="stylesheet">
</head>

<body>
<form action="Admin?action=check" method="post">
    <fieldset>
        <legend>登录</legend>
        <div class="alarm"><c:out value="${requestScope.message}" escapeXml="false"/></div>
        <label for="username">Name:</label>
        <input type="text" id="username"  name="name" />
        <label for="password">Password:</label>
        <input type="password" id="password"  name="pass"/>
        <input type="submit" value="提交">
        <input type="reset" value="重置" >
    </fieldset>
</form>
</body>
</html>