<%@ taglib uri="/WEB-INF/lib/mentawai.jar" prefix="mtw" %>
<mtw:requiresAuthentication />
<html>
<body>
<h2>Welcome to our site!</h2>
<mtw:hasAuthorization groups="admins">
<h3>Only admins can see this!</h3>
</mtw:hasAuthorization>
<h4>Click <a href="DeleteRecord.mtw">here</a> to delete a record! (admins only)</h4>
<h4>If you really want to leave this cool place, click <a href="Logout.mtw">here</a>.</h4>
</body>
</html>