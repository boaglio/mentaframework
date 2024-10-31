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

<h1>Autocomplete Demo</h1>
<div style="margin-top: 0px; padding-top: 0px; font-size: 70%">
  <a href="${contextPath}/txt/jsp/autocomplete.jsp.txt">JSP source</a>
  | <a href="${contextPath}/src/org/metawai/ajaxtaglibs/actions/AutocompleteAction.java">Java source</a>
</div>

<div style="font-size: 90%; width: 650px;">
  <p>
    The <code>ajax:autocomplete</code> tag allows one to retrieve a list of probable values from a
    backend servlet (or other server-side control) and display them in a dropdown beneath an HTML
    text input field.
  </p>
  <p>
    The user may then use the cursor and ENTER keys or the mouse to make a selection from that list
    of labels, which is then populated into the text field. This JSP tag also allows for a second
    field to be populated with the value or ID of the item in the dropdown.
  </p>
  <p>
    You'll notice that an image is used to indicate a busy state while the XMLHttpRequest object is
    making it's request to the server-side. This is a bit of JavaScript/CSS trickery--check the
    source to see how it's done.
  </p>
</div>

<form action="." class="basicForm">
  <fieldset>
    <legend>Enter Car Model</legend>
    <p>Available values start with letters: 'A', 'C', 'E', 'F', 'M', 'R', 'T'</p>

    <label for="model">Name:</label>
    <input id="model" name="model" type="text" size="30" />
    <span id="indicator" style="display:none;"><img src="${contextPath}/img/indicator.gif" /></span>

    <label for="make">Make:</label>
    <input id="make" name="make" type="text" size="30" />
  </fieldset>
</form>
<div id="errorMsg" style="display:none;border:1px solid #e00;background-color:#fee;padding:2px;margin-top:8px;width:300px;font:normal 12px Arial;color:#900"></div>

<ajax:autocomplete
  source="model"
  target="make"
  baseUrl="${contextPath}/autocomplete.mtw"
  className="autocomplete"
  indicator="indicator"
  minimumCharacters="1"
  parser="new ResponseXmlToHtmlListParser()" />

<jsp:include page="footer.jsp" flush="true" />
