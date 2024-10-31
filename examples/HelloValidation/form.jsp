<%@ taglib uri="/WEB-INF/lib/mentawai.jar" prefix="mtw" %>
<!--
 Note: The form loses all data on each submition!
 Mentawai can solve this problem automatically for you through its HTML tags.
 -->
<html>
<body>
<h1>Hello Validation!</h1>
<form action="HelloWorld.mtw" method="post">
Your username: <input name="username" size="25" />
<mtw:hasError>
<font color="red"><mtw:error field="username" /></font>
</mtw:hasError>
<br>Your age: <select name="age" size="1">
<option>16</option><option>17</option><option>18</option>
</select>
<mtw:hasError>
<font color="red"><mtw:error field="age" /></font>
</mtw:hasError>
<br>Your password: <input type="password" name="password" size="25" />
<mtw:hasError>
<font color="red"><mtw:error field="password" /></font>
</mtw:hasError>
<br>Again please: <input type="password" name="passconf" size="25" />
<mtw:hasError>
<font color="red"><mtw:error field="passconf" /></font>
</mtw:hasError>
<input type="submit" value="Enviar">
</form>
</body>
</html>