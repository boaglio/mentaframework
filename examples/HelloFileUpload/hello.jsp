<%@ taglib uri="/WEB-INF/lib/mentawai.jar" prefix="mtw" %>
<html>
<body>
<h3>Hello <mtw:out value="username" /> from Mentawai!</h3>
<h4>File size: <mtw:out value="fileSize" /> bytes!</h4>
<h2>Options: <br>
<mtw:list value="options">
<mtw:loop>
<mtw:out/><br>
</mtw:loop>
</mtw:list>
</h2>
</body>
</html>