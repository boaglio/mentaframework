<%@ taglib uri="/WEB-INF/lib/mentawai.jar" prefix="mtw" %>
<mtw:requiresAuthentication />
<html>
<body>
<h2>Welcome to our site!</h2>
<h4>If you really want to leave this cool place, click <a href="Logout.mtw">here</a>.</h4>

<h4><font color="red">Testing MentaTags for session!</font></h4>
<mtw:if test="user" value="null">
You are not logged in! (1)
</mtw:if>
<mtw:if test="user" value="null" negate="true">
You are logged in! (1)
</mtw:if>

<br>

<mtw:bean value="user">
<mtw:isNull>
You are not logged in! (2)
</mtw:isNull>
<mtw:isNull negate="true">
You are logged in! (2)
</mtw:isNull>
</mtw:bean>

<br>

<mtw:isNull test="user">
You are not logged in! (3)
</mtw:isNull>
<mtw:isNull test="user" negate="true">
You are logged in! (3)
</mtw:isNull>
</body>
</html>