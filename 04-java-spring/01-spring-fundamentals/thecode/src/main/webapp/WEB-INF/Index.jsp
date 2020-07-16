<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="The Code" content="Spring Boot project named The Code">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>The Code</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.4.1.js" integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU=" crossorigin="anonymous"></script>
		<link rel="stylesheet" type="text/css" href="css/main.css">
		<script type="text/javascript" src="js/main.js"></script>
    </head>
    <body>
        <div class="container-fluid">
            <c:out value="${error}"/>
            <div class="row right">
            	<p>What is the Code?</p>
            </div>
	        <div class="row right">
       	     	<div class="form-group row">
    	        	<form action="/maybecode" method="POST"> 
				    	<label for="testpass" class="col-sm-2 col-form-label">PassCode</label>
			    		<div class="col-sm-10">
			      			<input type="text" class="form-control" id="testpass" name="testpass">
			      		</div>
            			<div class="form-group row right">
            				<button type="submit" class="btn btn-outline-success">Try Code</button>
              			</div>        
            		</form>
   				</div>
			</div>
        </div>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>