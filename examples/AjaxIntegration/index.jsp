<html>
<head>
<title>Mentawai + AJAX - Asyncronous JavaScript and XML</title>
</head>
<body>
<script>
var req;
var comp;

function createAjaxRequest() {
    var ajaxReq;
    if (window.XMLHttpRequest) { // Non-IE browsers
       ajaxReq = new XMLHttpRequest();
   }
    else if (window.ActiveXObject) { // IE
            ajaxReq = new ActiveXObject("Microsoft.XMLHTTP");
        }
    return ajaxReq;
}

function getValues() {
  alert('fo');
  var url = "getNames.mtw";
  comp = document.getElementById("list");
 req = createAjaxRequest();
  // sendAjaxRequest(req, url, "processStateChange");
   if (window.XMLHttpRequest) { // Non-IE browsers
     req.onreadystatechange = processStateChange;
    try {
        
           req.open("GET", url, true);
       } catch (e) { 
           alert(e);
       }
       req.send(null);
    } 
    else if (window.ActiveXObject) { // IE
       if (req) {
           req.onreadystatechange = processStateChange;
            req.open("GET", url, true);
            req.send();
        }
    }  
    }
    
function processStateChange() {
    if (req.readyState == 4) {
        if (req.status == 200) { // OK response
            var xml = req.responseXML;
            var entries =xml.getElementsByTagName("entry");
            for (var i = 0; i < entries.length; i++) {
                var entry = entries[i];
                 comp.options[comp.length] = new Option(entry.firstChild.nodeValue,entry.getAttribute("key"));
            } 
        }
        else {
           alert("Problem: " + req.statusText);
       } 
    }
}
</script>
<br>
Click here to asynchronously put some values on the select bellow: <input type="button" value="OK" onClick="getValues();" />
<br>
<select id="list">
</select>
</body>
</html>
