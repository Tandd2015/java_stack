<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="Products and Categories project New Category page" content="Spring Boot project named Products and Categories">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Products and Categories project New Category page</title>
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
				<h1><c:out value="${category.name}"/></h1>
			</div>
			<div class="row four">		
				<div class="col-md-2">				
					<h3>Products: </h3>
				</div>
				<div class="form-group col-md-4 four">				
					<form:form action="/categories/connection" method="post" modelAttribute="connection">
						<form:input type="hidden" path="categoryModel" value="${category.id}"/>
						<form:label  path="productModel">Add Products: </form:label>
						<form:errors path="productModel"/>
						<form:select class="form-control" path="productModel">
						<c:forEach items="${choiceProducts}" var="product">
							<option value="${product.id}">${product.name}</option>
						</c:forEach>
						</form:select>
						<div class="form-group row fours">
							<input type="submit" class="btn btn-outline-success" value="Add"/>
						</div>		
					</form:form>
				</div>
			</div>
			<c:forEach items="${category.products}" var="categori">
				<div class="row four">
					<p class="row four" value="${categori.id}"> - ${categori.name}</p>				
				</div>
			</c:forEach>
		</div>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
	</body>
</html>