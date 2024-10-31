<%@ taglib uri="/WEB-INF/lib/mentawai.jar" prefix="mtw" %>
<!--
 Note: The form loses all data on each submition!
 Mentawai can solve this problem automatically for you through its HTML tags.
 -->
<html>
<body>
<h1>Hello Conversion!</h1>
<form action="HelloConversion.mtw" method="post">
Today is: <input name="date" size="25" /> <i>(xx/xx/aaaa)</i>
<br>
<input type="submit" value="Enviar">
</form>
</body>
</html>