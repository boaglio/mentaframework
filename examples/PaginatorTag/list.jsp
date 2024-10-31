<%@ taglib uri="/WEB-INF/lib/mentawai.jar" prefix="mtw" %>

<html>
<body>
<h1>Hello Paginator Tag!</h1>

<h3>More info here: <a href="http://forum.mentaframework.org/posts/list/193.page#3276">http://forum.mentaframework.org/posts/list/193.page#3276</a></h3>

<h4>Here is my list paginated:</h4>

<mtw:paginator size="5" value="myList">

	<mtw:isEmpty negate="true">
	
		<h5>Results <mtw:resultFrom /> - <mtw:resultTo /> of about <mtw:resultTotal /></h5>
		
	</mtw:isEmpty>

    <mtw:hasPrevious>
        
        <a href="HelloPaginator.mtw?page=<mtw:out />"><b>&lt;-Prev</b></a>&nbsp;&nbsp;
        
    </mtw:hasPrevious>
    
    <mtw:pageNumbers pagesToShow="3">
    
        <mtw:isCurrPage>
            <mtw:out />&nbsp;&nbsp;
        </mtw:isCurrPage>
        
        <mtw:isCurrPage negate="true">
            <a href="HelloPaginator.mtw?page=<mtw:out />"><mtw:out /></a>&nbsp;&nbsp;
        </mtw:isCurrPage>
    
    </mtw:pageNumbers>
    
    <mtw:hasNext>
        
        <a href="HelloPaginator.mtw?page=<mtw:out />"><b>Next-&gt;</b></a>
        
    </mtw:hasNext>
    
    <br><br>
    
    <font color="blue">
    
    <mtw:loop>
    
        <mtw:out /><br>
        
    </mtw:loop>
    
    </font>
    
    <br>
    
    <mtw:hasPrevious>
        
        <a href="HelloPaginator.mtw?page=<mtw:out />"><b>&lt;-Prev</b></a>&nbsp;&nbsp;
        
    </mtw:hasPrevious>
    
    <mtw:pageNumbers pagesToShow="3">
    
        <mtw:isCurrPage>
            <mtw:out />&nbsp;&nbsp;
        </mtw:isCurrPage>
        
        <mtw:isCurrPage negate="true">
            <a href="HelloPaginator.mtw?page=<mtw:out />"><mtw:out /></a>&nbsp;&nbsp;
        </mtw:isCurrPage>
    
    </mtw:pageNumbers>
    
    <mtw:hasNext>
        
        <a href="HelloPaginator.mtw?page=<mtw:out />"><b>Next-&gt;</b></a>
        
    </mtw:hasNext>
    
</mtw:paginator>
    
</body>
</html>