<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<c:set var="logoner" value="${sessionScope.administrator}"/>
<footer class="top-fixed">
    <a href=<%=basePath %>>Lily's Lily</a>
    <c:if test="${empty logoner}">
    	<a href="Admin?action=login">管理入口&gt;&gt;</a>
    </c:if>
    <c:if test="${!empty logoner}">
    	<span>Hi, Lily~<a href="Admin?action=logout">登出&gt;&gt;</a></span>
    </c:if>
    
    <c:set var="link" value="${requestScope.linklist}"/>
    <c:if test="${!empty link}">
    <ul class="line top-links">
    <c:forEach var="lsingle" items="${link}">
    	<li><a href="${lsingle.linkSrc}" title="${lsingle.linkDesc}" target="_blank"><c:out value="${lsingle.linkTitle}" escapeXml="true"/></a></li>
    </c:forEach>
    </ul>
    <c:if test="${!empty logoner}">
    	<a href="Link?action=select">编辑&gt;&gt;</a>
    </c:if>
    </c:if>
</footer>