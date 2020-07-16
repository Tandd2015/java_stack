<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="Great Ideas project Edit Idea Page" content="Spring Boot project named Great Ideas">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Great Ideas project Edit Idea Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.4.1.js" integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU=" crossorigin="anonymous"></script>
		<link rel="stylesheet" type="text/css" href="/css/main.css">
		<script type="text/javascript" src="/js/main.js"></script>
    </head>
	<body>
		<div class="container-fluid">
			<nav class="navbar navbar-dark bg-dark">
                <li class="nav-item">
                    <a class="nav-link" href="/ideas">Ideas</a>
                </li>
                <li class="nav-item">
					<a class="nav-link" href="/logout">Logout</a>
                </li>
            </nav>
			<div class="row four">
				<h1><c:out value="${ideaModel.subject}"/></h1>
			</div>
			<div class="row four">
				<form:form action="/ideas/${ideaModel.id}" method="post" modelAttribute="ideaModel">
					<input type="hidden" name="_method" value="put">
					<div class="row four">
						<form:label path="subject">Content: </form:label>
						<form:errors path="subject"/>
						<form:input path="subject"/>
					</div>
					<div class="row four">
						<input type="submit" class="btn btn-outline-warning" value="Update"/>
					</div>
				</form:form>
			</div>
			<div class="row four threee">
				<form action="/ideas/${ideaModel.id}" method="post">
					<input type="hidden" name="_method" value="delete">
					<input type="submit" class="btn btn-outline-danger" value="Delete">
				</form>
			</div>	
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
	</body>
</html>