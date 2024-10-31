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
<%@ taglib uri="http://ajaxtags.org/tags/ajax" prefix="ajax"%>

<jsp:include page="header.jsp" flush="true" />

<h1>Select Tag Demo</h1>
<div style="margin-top: 0px; padding-top: 0px; font-size: 70%">
  <a href="${contextPath}/txt/jsp/dropdown.jsp.txt">JSP source</a>
  | <a href="${contextPath}/src/org/metawai/ajaxtaglibs/actions/DropdownAction.java">Java source</a>
</div>

<div style="font-size: 90%; width: 650px;">
  <p>
    The <code>ajax:select</code> tag allows one to retrieve a list of values from a backend servlet
    (or other server-side control) and display them in another HTML select box.
  </p>
  <p>
    Here, the example asks the user to select a make from a list of car makers. Once selected, the
    XMLHttpRequest object calls a servlet to retrieve all models for that make, which are then
    populated in the second dropdown.
  </p>
  <p>
    This example also demonatrates the use of a post-function (written in JavaScript).
    Post-functions execute after the AJAX piece is finished its work. In this case, we define a
    post-function to display an image of the car maker.
  </p>
</div>

<form action="." class="basicForm">
  <fieldset>
    <legend>Choose Your Car</legend>

    <div>
      <img id="makerEmblem"
           src="<%=request.getContextPath()%>/img/placeholder.gif"
           width="76" height="29" />
    </div>

    <label for="make">Make:</label>
    <select id="make">
      <option value="">Select make</option>
      <option value="Ford">Ford</option>
      <option value="Honda">Honda</option>
      <option value="Mazda">Mazda</option>
    </select>
    <span id="progressMsg" style="display:none;"><img alt="Indicator" src="<%=request.getContextPath()%>/img/indicator.gif" /> Loading...</span>

    <label for="model">Model:</label>
    <select id="model" disabled="disabled">
      <option value="">Select model</option>
    </select>
  </fieldset>
</form>
<div id="errorMsg" style="display:none;border:1px solid #e00;background-color:#fee;padding:2px;margin-top:8px;width:300px;font:normal 12px Arial;color:#900"></div>

<script type="text/javascript">
 /*
  * USER DEFINED FUNCTIONS
  */

function initProgress() {
  Element.show('progressMsg');
}

function resetProgress() {
  // show marker emblem
  var index = $('make').selectedIndex;
  var automaker = $('make').options[index].text;
  var imgTag = $('makerEmblem');
  if (index > 0) {
    imgTag.src = "<%=request.getContextPath()%>/img/" + automaker.toLowerCase() + "_logo.gif";
  }

  Effect.Fade('progressMsg');
}

function reportError() {
  if ($('model').options.length == 0) {
    $('errorMsg').innerHTML = "Dropdown busted!";
  }
  Element.show('errorMsg');
  setTimeout("Effect.DropOut('errorMsg')", 2500);
}
</script>

<ajax:select
  baseUrl="${contextPath}/dropdown.mtw"
  source="make"
  target="model"
  parameters="make={make}"
  preFunction="initProgress"
  postFunction="resetProgress"
  errorFunction="reportError"
  parser="new ResponseXmlParser()" />

<jsp:include page="footer.jsp" flush="true" />
