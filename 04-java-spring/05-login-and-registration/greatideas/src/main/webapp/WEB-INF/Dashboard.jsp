<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="Great Ideas project Dashboard Page" content="Spring Boot project named Great Ideas">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Great Ideas project Dashboard Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.4.1.js" integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU=" crossorigin="anonymous"></script>
		<link rel="stylesheet" type="text/css" href="/css/main.css">
		<script type="text/javascript" src="/js/main.js"></script>
    </head>
	<body>
		<div class="container-fluid">
			<div class="row four">		
 				<h1>Welcome, ${userModel.name}</h1>
			</div>
			<div class="row four">		
	 			<nav class="navbar navbar-dark bg-dark">
	                <li class="nav-item">
	                    <h3>Ideas</h3>
	                </li>
	                <li class="nav-item">
	                    <a class="nav-link" href="/ideas">Low Likes</a>
	                </li>
	                <li class="nav-item">
	                    <a class="nav-link" href="/ideas">High Likes</a>
	                </li>
	                <li class="nav-item">
						<a class="nav-link" href="/logout">Logout</a>
	                </li>
	            </nav>
			</div>
			<div class="row four">
 				<table class="table table-striped table-dark">
					<thead>
						<tr>
							<th scope="col">Idea</th>
							<th scope="col">Created By:</th>
							<th scope="col">Likes</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>
					<c:forEach items="${ideaList}" var="idea">
						<tr>
							<td><a href="/ideas/${idea.id}"><c:out value="${idea.subject}"/></a></td>
							<td><p>${idea.userModel.name}</p></td>
							<td><p>${idea.usersLiked.size()}</p></td>
							<td>
								<c:choose>
									<c:when test="${ idea.usersLiked.contains(userModel) }">
										<a class="btn btn-danger" href="ideas/dislike/${ idea.id }">Dislike It</a>
									</c:when>
									<c:otherwise>
										<a class="btn btn-success" href="ideas/like/${ idea.id }">Like It</a>
									</c:otherwise>
								</c:choose>
							</td>
						</tr>
					</c:forEach>
					</tbody>				
				</table>
			</div>	
			<div class="row four">
				<a class="btn btn-primary" href="/ideas/new">Create an Idea</a>
			</div>
		</div>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
	</body>
</html>
