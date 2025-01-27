<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="Counter" content="Spring Boot project named Counter">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Counter</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.4.1.js" integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU=" crossorigin="anonymous"></script>
		<link rel="stylesheet" type="text/css" href="css/main.css">
		<script type="text/javascript" src="js/main.js"></script>
    </head>
    <body>
        <div class="container-fluid">
            <nav class="navbar navbar-dark bg-dark">
                <li class="nav-item">
                    <a class="nav-link" href="/">Home</a>
                </li>
            </nav>
            <div class="row right">
            	<h1>Welcome <c:out value=" ${countVisits} "/><a href="/">http://127.0.0.1:8080/counter</a> Times</h1>
            </div>
            <div class="row right">
	            <form action="/resetiteser" method="POST">            
	            	<button type="submit" class="btn btn-outline-danger">Reset Counter</button>
	            </form>
            </div>
            <div class="row right">
            	<a href="/"><button class="btn btn-outline-success">Another one for fun?</button></a>
            </div>
            <div class="row right">
         		<a href="/two"><button class="btn btn-outline-warning">Another Two for fun?</button></a>
            </div>
        </div>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>