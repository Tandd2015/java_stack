<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
	<head>
    <head>
        <meta charset="UTF-8">
        <meta name="Languages Edit Page" content="Spring Boot project named Languages">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Languages Edit Page</title>
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
                    <form action="/languages/${language.id}" method="post">
                   		<input type="hidden" name="_method" value="Delete">
                   		<input class="btn btn-outline-danger" type="submit" value="Delete">
                   </form>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/languages">DashBoard</a>
                </li>
            </nav>
			<div class="row six">
				<form:form action="/languages/${language.id}" method="post" modelAttribute="language">
					<input type="hidden" name="_method" value="put">
					<div class="form-group row">
						<p>
							<form:label path="name">Name</form:label>
							<form:errors path="name"/>
							<form:input path="name"/>
						</p>
					</div>
					<div class="form-group row">
						<p>
							<form:label path="creator">Creator</form:label>
							<form:errors path="creator"/>
							<form:input path="creator"/>
						</p>
					</div>
					<div class="form-group row">
						<p>
							<form:label path="version">Version</form:label>
							<form:errors path="version"/>
							<form:input path="version"/>
						</p>
					</div>
					<div class="form-group row">
						<input type="submit" class="btn btn-outline-success" value="Submit"/>
					</div>					
				</form:form>
			</div>
		</div>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
	</body>
</html>