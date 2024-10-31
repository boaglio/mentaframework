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

<jsp:include page="header.jsp" flush="true" />

<h1>Demos</h1>

<div style="width: 650px; font-size: 90%">
  <p>
    The AJAX Tag Library is a set of JSP tags that simplify the use of Asynchronous JavaScript and
    XML (AJAX) technology in JavaServer Pages.
  </p>
  <p>
    The following examples should give a basic overview of how the current set of AJAX JSP tags can
    be used in near real-world scenarios. You can not only run each example, but you can view the
    JSP and backend servlet source code.
  </p>
</div>

<div>

<table cellpadding="6" cellspacing="0" border="0" id="homepageTable">
  <thead>
    <tr valign="top">
      <th width="60%">Tag Name</th>
      <th width="40%">Run</th>
    </tr>
  </thead>
  <tbody>
    <tr valign="top" class="description">
      <td style="font-size: 70%; padding-bottom: 5px;">&nbsp;</td>
      <td align="center" style="font-size: 70%; padding-bottom: 5px;">
    </tr>
    <tr valign="top">
      <td>Auto-Complete</td>
      <td align="center"><a href="${contextPath}/autocomplete.jsp">Run</a></td>
    </tr>
    <tr valign="top" class="description">
      <td colspan="2">Retrieves a list of values that matches the string entered in a text form
      field as the user types.</td>
    </tr>
    <tr valign="top">
      <td>Callout</td>
      <td align="center"><a href="${contextPath}/callout.jsp">Run</a></td>
    </tr>
    <tr valign="top" class="description">
      <td colspan="2">Displays a callout or popup balloon, anchored to an HTML element with an
      onclick event.</td>
    </tr>
    <tr valign="top">
      <td>Form Update</td>
      <td align="center"><a href="${contextPath}/formupdate.jsp">Run</a></td>
    </tr>
    <tr valign="top" class="description">
      <td colspan="2">Updates one or more form field values based on response to text entered in
      another field.</td>
    </tr>
    <tr valign="top">
      <td>HtmlContent</td>
      <td align="center"><a href="${contextPath}/htmlcontent.jsp">Run</a></td>
    </tr>
    <tr valign="top" class="description">
      <td colspan="2">Fills a content area (e.g., DIV tag) with the HTML from another source</td>
    </tr>
    <tr valign="top">
      <td>HtmlContent 2</td>
      <td align="center"><a href="${contextPath}/htmlincludecontent.jsp">Run</a></td>
    </tr>
    <tr valign="top" class="description">
      <td colspan="2">Fills a content area (e.g., DIV tag) with the an included JSP</td>
    </tr>
    <tr valign="top">
      <td>Portlet</td>
      <td align="center"><a href="${contextPath}/portlet.jsp">Run</a></td>
    </tr>
    <tr valign="top" class="description">
      <td colspan="2">
        Mimics a portlet (in the <a href="http://www.jcp.org/en/jsr/detail?id=168">JSR-168</a>
        sense) by allowing you to define a portion of the page that pulls content from another
        location using Ajax with or without a periodic refresh.
      </td>
    </tr>
    <tr valign="top">
      <td>Select/Dropdown</td>
      <td align="center"><a href="${contextPath}/dropdown.jsp">Run</a></td>
    </tr>
    <tr valign="top" class="description">
      <td colspan="2">Based on a selection within a dropdown field, a second select field will be
      populated.</td>
    </tr>
    <tr valign="top">
      <td>Tab Panel</td>
      <td align="center"><a href="${contextPath}/tabpanel.jsp">Run</a></td>
    </tr>
    <tr valign="top" class="description">
      <td colspan="2">Provides a tabbed page view of content from different resources</td>
    </tr>
    <tr valign="top">
      <td>Area and Anchor</td>
      <td align="center"><a href="${contextPath}/pagearea.jsp">Run</a></td>
    </tr>
    <tr valign="top" class="description">
      <td colspan="2">Shows how to AJAX-enable any area of your page</td>
    </tr>
    <tr valign="top">
      <td>Ajax DisplayTag</td>
      <td align="center"><a href="${contextPath}/displaytag.jsp">Run</a></td>
    </tr>
    <tr valign="top" class="description">
      <td colspan="2">Shows how to AJAX-enable DisplayTag</td>
    </tr>
  </tbody>
</table>

</div>

<jsp:include page="footer.jsp" flush="true" />
