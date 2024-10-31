<%@ taglib uri="/WEB-INF/lib/mentawai.jar" prefix="mtw" %>
<html>
<body>
<mtw:hasMessage>
<h4><mtw:message /></h4>
</mtw:hasMessage>
<h3>Congratulations!</h3>
<h4>Tomorrow is:  <mtw:out value="tomorrow" /></h4>
</body>
</html>