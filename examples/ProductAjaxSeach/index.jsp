<html>
<head>
<script language="javascript" src="prototype-1.4.0.js">
</script>
<script language="javascript">
    
        function add() {
           var name = $('addName').value;
           var description = $('addDescription').value;
           var params = 'name=' + name + '&description=' + description;
           var url = "product.add.mtw";
           new Ajax.Request (
               url, {
                   method: 'get',
                   parameters: params,
                   onComplete: search, 
                   onFailure: erro
                   
               });
        }
    
        function search() {
           $('updateDiv').style.visibility = 'hidden';
           var name = $('searchName').value;
           var params = "name=" + name;
           var url = 'product.findByName.mtw';
           
           new Ajax.Request (
               url, {
                   method: 'get',
                   parameters: params,
                   onComplete: searchResult,
                   onFailure: erro
                   
               });
               
        } 
        
        function searchResult(req) {

           var productsStr = req.responseText;
          
           $('addName').value = '';
           $('addDescription').value = '';
          
           var str = '';
           var products = eval(productsStr);
           var len = products.length;
           var i;
              
           if (len == 0) {
             str = 'No product found';
           }
           for (i = 0; i < len; i++) {
              str += '<p>'
              str += 'Name: ' + products[i].name + '<br/>';
              str += 'Description: ' + products[i].description + '<br/>';
              str += '<a href="javascript:deleteProduct(' + products[i].id 
                      + ');">Delete</a>|<a href="javascript:callUpdateProduct(' 
                      + products[i].id + ');">Update data</a>';

              str += '</p>';
           }
           $('productList').innerHTML = str;
        }

        function deleteProduct(id) {
           var params = "id=" + id;
           var url = 'product.delete.mtw';
           new Ajax.Request (
               url, {
                   method: 'post',
                   parameters: params,
                   onComplete: search,
                   onFailure: erro
                   
               });
        }

        function erro() {
            alert("Error while acessing the server");
        }

        function updateProduct() {
           var id = $('updateId').value;
           var name = $('updateName').value;
           var description = $('updateDescription').value;
           var params = 'id=' + id + '&name=' + name + '&description=' + description;
           var url = "product.update.mtw";
           new Ajax.Request (
               url, {
                   method: 'get',
                   parameters: params,
                   onComplete: search, 
                   onFailure: erro
                   
               });
        }

        function callUpdateProduct(id) {
           var params = "id=" + id;
           var url = 'product.getById.mtw';
           new Ajax.Request (
               url, {
                   method: 'post',
                   parameters: params,
                   onComplete: showUpdateProduct,
                   onFailure: erro
                   
               });
        }
        
        function showUpdateProduct(req) {
           var productStr = req.responseText;
           var product = eval('(' + productStr + ')');
           $('updateId').value = product.id;
           $('updateName').value = product.name;
           $('updateDescription').value = product.description;
           
           $('updateDiv').style.visibility = "visible";
           
           
        }
    </script>
<title>Products</title>
</head>
<body>
Type the name (or part of it) of the product that you want to search or leave it in blank to search all:
<br />
<input type="text" name="searchName" id="searchName" />
<a href="javascript:search();">Search</a>
<br />
<div id="productList"></div>
<br />
Add product:
<br />
<form id="addForm">
<table>
	<tr>
		<td>Name:</td>
		<td><input type="text" name="name" id="addName" /></td>
	</tr>
	<tr>
		<td>Description:</td>
		<td><input type="text" name="description" id="addDescription" /></td>
	</tr>
</table>
</form>
<a href="javascript:add()">Add</a>
<div id="updateDiv"
	style="visibility:hidden; position:absolute; left:250px; top:50px;">
Update product data: <input type="hidden" name="id" id="updateId" />
<table>
	<tr>
		<td>Name:</td>
		<td><input type="text" name="name" id="updateName" /></td>
	</tr>
	<tr>
		<td>Description:</td>
		<td><input type="text" name="description" id="updateDescription" /></td>
	</tr>
</table>
<a href="javascript:updateProduct();">Confirm</a></div>
</body>
</html>