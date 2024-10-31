<%@taglib uri="/template" prefix="template"%>
<html>
  <head>
    <title>Mentawai with Templates</title>
  </head>
  <body>
    <table>
      <tr><td colspan="2"><template:block id="head"/></td></tr>
      <tr>
        <td width="25%"><template:block id="menu"/></td>
        <td><template:block id="body"/></td>
      </tr>
    </table>
  </body>
</html>