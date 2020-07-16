<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="Ninja Gold Home Page" content="Spring Boot project named Ninja Gold">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Ninja Gold Home Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.4.1.js" integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU=" crossorigin="anonymous"></script>
		<link rel="stylesheet" type="text/css" href="css/main.css">
		<script type="text/javascript" src="js/main.js"></script>
    </head>
    <body>
        <div class="container-fluid">
	        <div class="row" id="gHolder">
	            <div class="col-4">
	                <p>Your Gold:  </p>
	            </div>
	            <div class="col-8" id="aHolder">
	                <p><c:out value="${sessionGold}"/></p>
	            </div>
	        </div>
	        <div class="row" id="sHolder">
	            <div class="col" id="farms">
	                <form action="/process_money" class="text-center" id="1" method="post">
	                    <h1>Farm</h1>
	                    <p>(earns 10 - 20 golds)</p>
	                    <input type="hidden" name="action" value="farm">
	                    <button type="submit" class="btn btn-success btn-lg">Find Gold!</button>
	                </form>
	            </div>
	            <div class="col" id="caves">
	                <form action="/process_money" class="text-center" id="2" method="post">
	                    <h1>Cave</h1>
	                    <p>(earns 5 - 10 golds)</p>
	                    <input type="hidden" name="action" value="cave">
	                    <button type="submit" class="btn btn-primary btn-lg">Find Gold!</button>
	                </form>
	            </div>
	            <div class="col" id="houses">
	                <form action="/process_money" class="text-center" id="3" method="post">
	                    <h1>House</h1>
	                    <p>(earns 2 - 5 golds)</p>
	                    <input type="hidden" name="action" value="house">
	                    <button type="submit" class="btn btn-warning btn-lg">Find Gold!</button>
	                </form>
	            </div>
	            <div class="col" id="casinos">
	                <form action="/process_money" class="text-center" id="4" method="post">
	                    <h1>Casino</h1>
	                    <p>(earns/takes 0 - 50 golds)</p>
	                    <input type="hidden" name="action" value="casino">
	                    <button type="submit" class="btn btn-danger btn-lg">Find Gold!</button>
	                </form>
	            </div>
	        </div>
            <div class="row">
	            <p>Activities:</p>
	            <div class="col" id="aLog">
	            	<c:forEach items="${sessionLog}" var="message">
	            		<c:set var="color" scope="session" value="${currentGold}"/>
	            		<c:choose>
	            			<c:when test="${color < 0}">	            			
			            		<p class="row text-danger"><c:out value="${message}"/></p>
	            			</c:when>
	            			<c:when test="${color >= 0}">	            			
			            		<p class="row text-success"><c:out value="${message}"/></p>
	            			</c:when>
	            		</c:choose>
	            	</c:forEach>
	            </div>
            </div>
            <div class="row" id="aLog1">
            	<form action="/clears" method="post">
            		<button type="submit" class="btn btn-primary btn-lg btn-block">Play Again?</button>
            	</form> 
            </div>
        </div>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>