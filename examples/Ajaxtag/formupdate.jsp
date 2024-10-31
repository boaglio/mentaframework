<%-- 
 * Copyright 2005 Darren L. Spurgeon
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://ajaxtags.org/tags/ajax" prefix="ajax" %>

<jsp:include page="header.jsp" flush="true" />

<h1>Update Form Field Tag Demo</h1>
<div style="margin-top: 0px; padding-top: 0px; font-size: 70%">
  <a href="${contextPath}/txt/jsp/formupdate.jsp.txt">JSP source</a>
  | <a href="${contextPath}/src/org/metawai/ajaxtaglibs/actions/FormUpdateAction.java">Java source</a>
</div>

<div style="font-size: 90%; width: 650px;">
  <p>
    The <code>ajax:updateField</code> tag allows you to update one or more form fields based on the
    value of another single field.
  </p>
  <p>
    The example below uses this concept to implement a simple conversion tool.
  </p>
</div>

<script type="text/javascript">
 /*
  * USER DEFINED FUNCTIONS
  */

function initProgress() {
  Element.addClassName('mph', 'progressMeterLoading');
  $('kph').value = "";
  $('mps').value = "";
}

function resetProgress() {
  Element.removeClassName('mph', 'progressMeterLoading');

  if ($F('kph') != "") {
    // clear error box
    $('errorMsg').innerHTML = "";

    // do cool effect
    new Effect.Highlight('kph');
    new Effect.Highlight('mps');

    // display success message
    Element.show('successMsg');
    setTimeout("Effect.DropOut('successMsg');", 2000);
  }
}

function reportError() {
  if ($F('mph') == "") {
    $('errorMsg').innerHTML = "You must enter a value";
    new Effect.Highlight('mph', {duration:5});
  } else {
    $('errorMsg').innerHTML = "Calculator busted!";
  }
  Element.show('errorMsg');
  setTimeout("Effect.DropOut('errorMsg')", 2500);
}
</script>

<div style="width: 400px;">
<form id="updateForm">
  <fieldset>
    <legend>Velocity Conversion</legend>
    <p>Enter miles per hour and click Calculate</p>

    <label for="mph">Miles/Hour (mph)</label>
    <input type="text" id="mph" />
    <input id="action" type="button" value="Calculate"/>

    <label for="kph">Kilometers/Hour (kph)</label>
    <input type="text" id="kph" />

    <label for="mps">Meters/Second (m/s)</label>
    <input type="text" id="mps" />
  </fieldset>
</form>
</div>
<div id="successMsg" style="display:none;border:1px solid #0e0;background-color:#efe;padding:2px;margin-top:8px;width:300px;font:normal 12px Arial;color:#090">Calculation complete</div>
<div id="errorMsg" style="display:none;border:1px solid #e00;background-color:#fee;padding:2px;margin-top:8px;width:300px;font:normal 12px Arial;color:#900"></div>

<ajax:updateField
  baseUrl="${contextPath}/formupdate.mtw"
  source="mph"
  target="mps,kph"
  action="action"
  parameters="mph={mph}"
  parser="new ResponseXmlParser()"
  preFunction="initProgress"
  postFunction="resetProgress" />

<jsp:include page="footer.jsp" flush="true" />
