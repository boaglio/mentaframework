<%@ taglib uri="/WEB-INF/lib/mentawai.jar" prefix="mtw" %>
<html>
<body>
<h1>Hello Metawai!</h1>
<mtw:hasError>
<h3><font color="red"><mtw:error /></font></h3>
</mtw:hasError>
<form action="HelloWorld.mtw" method="post">
Type your username: <input name="username" size="25" />
<input type="submit" value="Enviar">
</form>
</body>
</html>