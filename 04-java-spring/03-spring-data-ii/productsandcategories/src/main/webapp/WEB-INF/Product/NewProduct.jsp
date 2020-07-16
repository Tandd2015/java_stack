<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="Products and Categories project New Products page" content="Spring Boot project named Products and Categories">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Products and Categories project New Product page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.4.1.js" integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU=" crossorigin="anonymous"></script>
		<link rel="stylesheet" type="text/css" href="/css/main.css">
		<script type="text/javascript" src="/js/main.js"></script>
    </head>
	<body>
		<div class="container-fluid">
			<nav class="navbar navbar-dark bg-dark">
                <li class="nav-item">
                    <a class="nav-link" href="/">DashBoard</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/categories/new">New Category</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/products/new">New Product</a>
                </li>
            </nav>
			<div class="row four">		
				<h1>New Product</h1>
			</div>
			<div class="row four">
				<form:form action="/products/new" method="post" modelAttribute="product">
					<div class="row">
						<form:label path="name">Name: </form:label>
						<form:errors path="name"/>
						<form:input type="text" path="name"/>
					</div>
					<div class="row">
						<form:label path="description">Description: </form:label>
						<form:errors path="description"/>
						<form:input type="text-area" path="description"/>
					</div>
					<div class="row">
						<form:label path="price">Price: </form:label>
						<form:errors path="price"/>
						<form:input type="number" path="price"/>
					</div>
					<input type="submit" class="btn btn-outline-success" value="Create"/>
				</form:form>
			</div>
		</div>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
	</body>
</html>