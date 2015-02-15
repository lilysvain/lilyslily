<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html xmlns:wb="http://open.weibo.com/wb">
<head>
    <meta charset="UTF-8">
    <title>Lily's lily - 好玩的个人主页</title>
    <meta name="keywords" content="个人主页,个人网站,前端,设计,电影,生活" />
    <meta name="description" content="Lily_Vain的个人主页，用于展示、记录、收集学习和生活中的美好的点滴。" />
    <meta name="author" content="Lily_Vain，狐二十三" />
    <link rel="Shortcut Icon" href="liv.ico" />
    <link href="style/base.css" rel="stylesheet">
    <script src="script/index.js"></script>
    <script src="http://tjs.sjs.sinajs.cn/open/api/js/wb.js" type="text/javascript" charset="utf-8"></script>
</head>
<body>
    <div id="content-wrapper">
        <ul>
            <li>2015/2/12---梳理完后台可能会用到的代码，开始写首页的html结构，学习使用compass+sass</li>
            <li>2015/2/13---确定首页内容，暂且无视这个粗糙的样式表，明天开始搭后台~设计和兼容待后台完成后进行~</li>
            <li>2015/2/14---搞定登录，但是账号密码直接放在配置文件里，安全系数很低，有待以后解决。</li>
        </ul>
    </div>

<jsp:include page="view/top.jsp"/>

<nav>
    <ul>
        <li><a href="Article">文章</a></li>
        <li><a href="Work">作品</a></li>
        <li><a href="Link">网址收集</a></li>
        <li><a href="Message">快来我的网站留个爪印吧~</a></li>
    </ul>
</nav>

<hgroup>
    <h1>Lily's Lily</h1>
    <h2>写给自己用的网站</h2>
</hgroup>

<div id="person_info">
	<p>网站主人懒得取名字，所有昵称 lily_vain，爱好代码、设计、电影、阅读、手工……</p>
	<p>欢迎关注：</p>
	<wb:follow-button uid="1931257387" type="gray_3" width="100%" height="24" ></wb:follow-button>
	<a href="" id="add_weixin"><img src="images/weixin_ico.png"/><img src="images/weixin_ewm.jpg" class="hide"/></a>
</div>

<article>
    <h1>Words</h1>
    <section>
        <img src="images/words/150208.jpg"/>
        <time datetime="2014-02-08 19:00">8th February</time>
        <p>网站重建中，此版内容暂不更新，bug暂不修复，寒假结束前必上新版~~~
            <a href="/new" target="_blank">进度日志---&gt;</a>
        </p>
    </section>
</article>

<article>
    <h1>文章</h1>
    <a href="">More</a>
    <section>
        <h1><a href="">CSS3-Speech Bubbles</a></h1>
        <time datetime="2014-01-04 19:00">2014-01-04</time>
    </section>
    <section>
        <h1><a href="">Element Dimensions</a></h1>
        <time datetime="2013-12-07 19:00">2013-12-07</time>
    </section>
</article>

<article>
    <h1>作品</h1>
    <a href="">More</a>
    <section class="">
        <h1><a href="">Santa Clause</a></h1>
        <img src=""/>
    </section>
    <section class="">
        <h1><a href="">手作</a></h1>
        <img src=""/>
    </section>
</article>

<article>
    <h1>收集</h1>
    <a href="">More</a>
    <section class="">
        <h1><a href="">网址</a></h1>
        <img src=""/>
    </section>
    <section class="">
        <h1><a href="">文章</a></h1>
        <img src=""/>
    </section>
</article>

<%@ include file="view/bottom.jsp" %>

</body>
</html>