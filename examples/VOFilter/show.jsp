<%@ taglib uri="/WEB-INF/lib/mentawai.jar" prefix="mtw" %>
<html>
<body>
<h3>Hello Value Object Filter!</h3>
<mtw:bean value="user">
<h4>Username: <mtw:out value="username" /></h4>
<h4>Password: <mtw:out value="password" /></h4>
<h4>Age: <mtw:out value="age" /></h4>
</mtw:bean>
</body>
</html>