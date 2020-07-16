<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
	<head>
    <head>
        <meta charset="UTF-8">
        <meta name="Drivers License project New Person page" content="Spring Boot project named Drivers License">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Drivers License project New License page</title>
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
                    <a class="nav-link" href="/persons">DashBoard</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/persons/new">New Person</a>
                </li>
            </nav>
			<div class="row four">		
				<h1>New License</h1>
			</div>
			<div class="row four">
				<form:form action="/licenses/new" method="post" modelAttribute="license">
  					<p>
						<form:label path="person">Person</form:label>
						<form:errors path="person"/>
						<form:select class="form-control" path="person">
						<c:forEach items="${persons}" var="person">
						    <form:option value="${person.id}"> ${person.firstName} ${person.lastName} </form:option> 
						</c:forEach>
						</form:select>
					</p>
					<p>
						<form:label path="state">State</form:label>
						<form:errors path="state"/>
						<form:input type="text" path="state"/>
					</p>
					<p>
						<form:label path="expirationDate">Expiration Date</form:label>
						<form:errors path="expirationDate"/>
						<form:input type="Date" path="expirationDate"/>
					</p>
					<input type="submit" class="btn btn-outline-success" value="Submit"/>
				</form:form>
			</div>
		</div>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
	</body>
</html>