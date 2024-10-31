<html>
  <head>
    <title>Ajax JSON List</title>
    
    <script src="prototype.js" type="text/javascript"></script>
    
    <script type="text/javascript">
    	function getNames() {
    	  new Ajax.Request('getNamesJSON.mtw', {method: 'get', onSuccess: listNames});    	  
    	}
    	
    	function listNames(result) {
    	  var list = eval( '(' + result.responseText + ')' );
    	  var s = '';
    	  for (i = 0; i < list.length; i++) {
    	    s = s + list[i] + '<br/>';
    	  }
    	  $(names).innerHTML = s;
    	}
    
    </script>
  </head>
  <body>
    <input type="button" onclick="getNames()" value="Get Names"/> <br/> <br/>
    <div id="names"/>
  </body>
</html>