<%@ taglib uri="http://ajaxtags.org/tags/ajax" prefix="ajax" %>

<jsp:useBean id="now" class="java.util.Date"/>

<jsp:include page="header.jsp" flush="true" />

<h1>Area Tag Demo</h1>
<div style="margin-top: 0px; padding-top: 0px; font-size: 70%">
  <a href="${contextPath}/txt/jsp/pagearea.jsp.txt">JSP source</a>
</div>

This area should not refresh: Date: ${now}
<br/>
<ajax:anchors target="ajaxFrame" ajaxFlag="ajaxFrame">
  <!-- Ajax this link -->
  Refresh first area <a href="${contextPath}/pagearea.jsp" class="contentLink"> &gt;&gt;</a>
</ajax:anchors>

<br/><br/>
<ajax:area id="ajaxFrame"
  style="width:300px; min-height:100px; height:100px;"
  styleClass="textArea"
  ajaxAnchors="true" ajaxFlag="ajaxFrame">
  This is the first area and should be refreshed only when the first link or
  the link inside itself is clicked:
  <br/>
  It include a link to <a href="${contextPath}/pagearea.jsp"> itself </a>
  <br/>
  Date: ${now}
</ajax:area>

<br/><br/>
This area should not refresh:
 Date: ${now}
<br/>
<ajax:anchors target="ajaxFrame2" ajaxFlag="ajaxFrame2">
  <!-- Ajax this link -->
  Refresh second area <a href="${contextPath}/pagearea.jsp" class="contentLink"> &gt;&gt;</a>
</ajax:anchors>

<br/><br/>
<ajax:area id="ajaxFrame2"
  style="background:#eee; width:300px; min-height:100px; height:100px;"
  styleClass="textArea"
  ajaxAnchors="true" ajaxFlag="ajaxFrame2">
  This is the second area and should be refreshed only when the second link or
  the link inside itself is clicked:
  <br/>
  Click this link to refresh <a href="${contextPath}/pagearea.jsp"> itself </a>
  <br/>
  Date: ${now}
</ajax:area>

<br/><br/>
This bottom area should not refhesh: Date: ${now}
<br>

<jsp:include page="footer.jsp" flush="true" />
