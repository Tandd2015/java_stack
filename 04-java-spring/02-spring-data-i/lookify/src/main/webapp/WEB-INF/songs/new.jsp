<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
	<head>
    <head>
        <meta charset="UTF-8">
        <meta name="Lookify New Page" content="Spring Boot project named Lookify">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Lookify New Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.4.1.js" integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU=" crossorigin="anonymous"></script>
		<link rel="stylesheet" type="text/css" href="/css/main.css">
		<script type="text/javascript" src="/js/main.js"></script>
    </head>
	</head>
	<body>
		<div class="container-fluid">
            <nav class="navbar navbar-dark bg-dark justify-content-end">
                <li class="nav-item">
                    <a class="nav-link" href="/songs">Dashboard</a>
                </li>
            </nav>
			<div class="row newBookForm">
				<form:form action="/songs" method="post" modelAttribute="song">
					<p>
						<form:label path="title">Title</form:label>
						<form:errors path="title"/>
						<form:input class="inputNewBookForm" path="title"/>
					</p>
					<p>
						<form:label path="artist">Artist</form:label>
						<form:errors path="artist"/>
						<form:input class="inputNewBookForm" path="artist"/>
					</p>
					<p>
						<form:label path="rating">Rating(1 - 10)</form:label>
						<form:errors path="rating"/>
						<form:input class="inputNewBookForm" type="number" path="rating"/>
					</p>
					<input type="submit" class="btn btn-outline-success" value="Add Song"/>
				</form:form>
			</div>
		</div>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
	</body>
</html>