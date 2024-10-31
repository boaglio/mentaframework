<%@ taglib uri="/WEB-INF/lib/mentawai.jar" prefix="mtw" %>

<html>
<body>

<p>Guess a number from 0 to 100:</p>

<mtw:hasError>
    <p><i><mtw:error field="guess" /></i></p>
</mtw:hasError>

<mtw:hasMessage>
    <p><i><mtw:message /></i> Guesses: <mtw:out value="guesses" />
</mtw:hasMessage>

<form action="NumberGuessSticky.mtw" method="post">

<mtw:input name="guess" type="text" />
<br/>
<input type="submit" value="Guess" />

</form>

</body>
</html>

