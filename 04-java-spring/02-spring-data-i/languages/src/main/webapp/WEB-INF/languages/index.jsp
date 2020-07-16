<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
	<head>
    <head>
        <meta charset="UTF-8">
        <meta name="Spring Data 1 New Page" content="Spring Boot project named Spring Data 1">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Spring Data 1 New Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.4.1.js" integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU=" crossorigin="anonymous"></script>
		<link rel="stylesheet" type="text/css" href="/css/main.css">
		<script type="text/javascript" src="/js/main.js"></script>
    </head>
	</head>
	<body>
		<div class="container-fluid">
			<div class="row">
				<table class="table table-striped">
					<thead>
						<tr>
							<th scope="col">Name</th>
							<th scope="col">Creator</th>
							<th scope="col">Version</th>
							<th scope="col">Actions</th>
						</tr>
					</thead>
					<tbody>
					<c:forEach items="${languages}" var="language">
						<tr>
							<td scope="row"><a href="/languages/<c:out value='${language.id}'/>"><c:out value="${language.name}"/></a></td>
							<td><c:out value="${language.creator}"/></td>
							<td><c:out value="${language.version}"/></td>
							<td>
								<nav class="nav">
					               <li class="nav-item five">
					                   <form action="/languages/${language.id}" method="post">
					                   		<input type="hidden" name="_method" value="delete">
					                   		<input class="btn btn-outline-danger" type="submit" value="Delete">
					                   </form>
					               </li>
					               <li class="nav-item five">
					                   <a class="btn btn-outline-warning" href="/languages/${language.id}/edit">Edit</a>
					               </li>
					           </nav>
							</td>
						</tr>
					</c:forEach>
					</tbody>				
				</table>
			</div>
			<div class="row four">
				<form:form action="/languages" method="post" modelAttribute="language">
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