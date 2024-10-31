<%@ taglib uri="http://ajaxtags.org/tags/ajax" prefix="ajax" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<jsp:useBean id="now" class="java.util.Date"/>
<jsp:useBean id="service" class="org.ajaxtags.demo.CarService" />

<jsp:include page="header.jsp" flush="true" />

<h1>DisplayTag Wrapper Demo</h1>
<div style="margin-top: 0px; padding-top: 0px; font-size: 70%">
  <a href="${contextPath}/txt/jsp/displaytag.jsp.txt">JSP source</a>
</div>

This top area should not refresh:
<br/>
 Date: ${now}
<br/><br/>
<ajax:displayTag id="displayTagFrame" ajaxFlag="displayAjax">
  Last Time Table Refreshed: ${now}
  <display:table name="service.allCars" class="displaytag" pagesize="10" scope="page"
    defaultsort="1" defaultorder="descending" export="true" id="row" excludedParams="ajax">
    <display:column property="make" title="Make" sortable="true" headerClass="sortable" />
    <display:column property="model" title="Model" sortable="true" headerClass="sortable" />
    <display:column title="Link" media="html">
      <a href="http://www.${row.make}.com">${row.make} Web Page</a>
    </display:column>
    <display:column title="Link" media="excel xml">
      www.${row.make}.com
    </display:column>
  </display:table>

</ajax:displayTag>

<br/>

<jsp:include page="footer.jsp" flush="true" />
