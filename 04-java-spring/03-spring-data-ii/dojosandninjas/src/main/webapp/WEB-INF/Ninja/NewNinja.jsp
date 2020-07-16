<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
	<head>
    <head>
        <meta charset="UTF-8">
        <meta name="Dojos and Ninjas project New Person page" content="Spring Boot project named Dojos and Ninjas">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Dojos and Ninjas project New License page</title>
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
                    <a class="nav-link" href="/ninjas/new">New Ninja</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/dojos/new">New Dojo</a>
                </li>
            </nav>
			<div class="row four">		
				<h1>New License</h1>
			</div>
			<div class="row four">
				<form:form action="/ninjas/new" method="post" modelAttribute="ninja">
					<div class="row">
						<form:label path="dojoModel">Dojo: </form:label>
						<form:errors path="dojoModel"/>
						<form:select class="form-control" path="dojoModel">
						<c:forEach items="${dojos}" var="dojoModel">
							<form:option value="${dojoModel.id}">${dojoModel.name} Location</form:option>
						</c:forEach>
						</form:select>
					</div>
					<div class="row">
						<form:label path="firstName">First Name: </form:label>
						<form:errors path="firstName"/>
						<form:input type="text" path="firstName"/>
					</div>
					<div class="row">
						<form:label path="lastName">Last Name: </form:label>
						<form:errors path="lastName"/>
						<form:input type="text" path="lastName"/>
					</div>
					<div class="row">
						<form:label path="age">Age: </form:label>
						<form:errors path="age"/>
						<form:input type="number" path="age"/>
					</div>
					<input type="submit" class="btn btn-outline-success" value="Create"/>
				</form:form>
			</div>
		</div>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
	</body>
</html>