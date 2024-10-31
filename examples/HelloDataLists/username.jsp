<%@ taglib uri="/WEB-INF/lib/mentawai.jar" prefix="mtw" %>
<html>
<body>
<h1>Hello Metawai!</h1>
<form action="HelloWorld.mtw" method="post">
Type a name: <input name="username" size="25" /><br>
Gender: <mtw:select name="gender" list="genders" /><br>
<input type="submit" value="Enviar">
</form>
</body>
</html>