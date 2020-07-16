<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
    <head>
        <meta charset="UTF-8">
        <meta name="Spring Data 1 Home Page" content="Spring Boot project named Spring Data 1">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Spring Data 1 Home Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.4.1.js" integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU=" crossorigin="anonymous"></script>
		<link rel="stylesheet" type="text/css" href="/css/main.css">
		<script type="text/javascript" src="/js/main.js"></script>
    </head>
	</head>
	<body>
		<div class="container-fluid">
			<nav class="navbar navbar-dark bg-dark">
                <li class="nav-item">
                    <a class="nav-link" href="/books">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/books/new">New Book</a>
                </li>
            </nav>
			<div class="row">		
				<h1>All Books</h1>
			</div>
			<div class="row">
				<table class="table table-striped table-dark">
					<thead>
						<tr>
							<th scope="col">Id</th>
							<th scope="col">Title</th>
							<th scope="col">Description</th>
							<th scope="col">Language</th>
							<th scope="col">Number of Pages</th>
						</tr>
					</thead>
					<tbody>
					<c:forEach items="${books}" var="book">
						<tr>
							<th scope="row"><c:out value="${book.id}"/></th>
							<td><c:out value="${book.title}"/></td>
							<td><c:out value="${book.description}"/></td>
							<td><c:out value="${book.language}"/></td>
							<td><c:out value="${book.numberOfPages}"/></td>
						</tr>
					</c:forEach>
					</tbody>				
				</table>
			</div>
			<div class="row">
				<a href="/books/new">New Book</a>
			</div>
		</div>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
	</body>
</html>