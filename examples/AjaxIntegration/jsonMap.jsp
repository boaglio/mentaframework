<html>
  <head>
    <title>Ajax JSON Map</title>
    
    <script src="prototype.js" type="text/javascript"></script>
    
    <script type="text/javascript">
    	function getUserJSON() {
    	  new Ajax.Request('getUserJSON.mtw', {method: 'get', onSuccess: showUser});    	  
    	}
    	
    	function showUser(result) {
    	  var user = eval( '(' + result.responseText + ')' );
    	  var text = 'Name: ' + user.name + '<br/>' + 'Password: ' + user.password;
    	  $(userBlock).innerHTML = text;
    	}
    
    </script>
  </head>
  <body>
    <input type="button" onclick="getUserJSON()" value="Get Current User"/> <br/> <br/>
    <div id="userBlock"/>
  </body>
</html>