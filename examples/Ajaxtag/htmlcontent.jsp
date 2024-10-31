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

<h1>HtmlContent Tag Demo</h1>
<div style="margin-top: 0px; padding-top: 0px; font-size: 70%">
  <a href="${contextPath}/txt/jsp/htmlcontent.jsp.txt">JSP source</a>
  | <a href="${contextPath}/src/org/metawai/ajaxtaglibs/actions/HtmlContentAction.java">Java source</a>
</div>

<div style="font-size: 90%; width: 650px;">
  <p>
    The <code>ajax:htmlContent</code> tag fills a content area (e.g., DIV tag) with an HTML fragment
    from another resource.  You may find this tag useful for including blocks of information in a
    sidebar when the user clicks a link or form field.  This tag is a more simplified approach to
    the <code>ajax:portlet</code> and <code>ajax:tabPanel</code> tags.
  </p>
  <p>
    Shown below are three different ways of executing the AJAX event: link, radio button, and select
    field.
  </p>
</div>

<script type="text/javascript">
 /*
  * USER DEFINED FUNCTIONS
  */

function initProgress() {
  Element.show('progressMsg');
}

function resetProgress() {
  Effect.Fade('progressMsg');
}

function reportError() {
  $('errorMsg').innerHTML = "Html content busted!";
  Element.show('errorMsg');
  setTimeout("Effect.DropOut('errorMsg')", 2500);
}
</script>

<h3>HtmlContent in Action</h3>

<div id="modelDescription"></div>
<div id="htmlContentForm">
  <p>Select by ANCHOR link.</p>
  <ul>
    <li><a href="javascript://nop/" class="contentLink">Ford</a></li>
    <li><a href="javascript://nop/" class="contentLink">Honda</a></li>
    <li><a href="javascript://nop/" class="contentLink">Mazda</a></li>
  </ul>
  <form id="htmlContentForm">
    <p>Select by RADIO option.</p>
    <input type="radio" id="makeford" name="make" value="ford" class="contentRadio" /> Ford<br/>
    <input type="radio" id="makehonda" name="make" value="honda" class="contentRadio" /> Honda<br/>
    <input type="radio" id="makemazda" name="make" value="mazda" class="contentRadio" /> Mazda<br/>
    <br/>
    <p>Select by SELECT option.</p>
    <select id="selmake" name="selmake">
      <option value="">Select one</option>
      <option value="ford">Ford</option>
      <option value="honda">Honda</option>
      <option value="mazda">Mazda</option>
    </select>
  </form>
</div>
<div id="progressMsg" style="padding-top:5px;display:none;"><img alt="Indicator" src="<%=request.getContextPath()%>/img/indicator.gif" /> Loading...</div>
<div id="errorMsg" style="display:none;border:1px solid #e00;background-color:#fee;padding:2px;margin-top:8px;width:300px;font:normal 12px Arial;color:#900"></div>

<ajax:htmlContent
  baseUrl="${contextPath}/htmlcontent.mtw"
  sourceClass="contentLink"
  target="modelDescription"
  parameters="make={ajaxParameter}"
  />

<ajax:htmlContent
  baseUrl="${contextPath}/htmlcontent.mtw"
  sourceClass="contentRadio"
  target="modelDescription"
  parameters="make={ajaxParameter}"
  />

<ajax:htmlContent
  baseUrl="${contextPath}/htmlcontent.mtw"
  source="selmake"
  target="modelDescription"
  parameters="make={selmake}"
  eventType="change"
  />

<jsp:include page="footer.jsp" flush="true" />
