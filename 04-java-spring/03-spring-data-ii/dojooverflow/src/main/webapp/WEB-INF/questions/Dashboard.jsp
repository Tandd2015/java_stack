<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="Dojo OverFlow project Dashboard page" content="Spring Boot project named Dojo OverFlow">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Dojo OverFlow project Dashboard page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.4.1.js" integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU=" crossorigin="anonymous"></script>
		<link rel="stylesheet" type="text/css" href="/css/main.css">
		<script type="text/javascript" src="/js/main.js"></script>
    </head>
	<body>
		<div class="container-fluid">
			<nav class="navbar navbar-dark bg-dark">
                <li class="nav-item">
                    <a class="nav-link" href="/questions">DashBoard</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/questions/new">New Question</a>
                </li>
            </nav>
			<div class="row four">		
 				<h1>Questions Dashboard</h1>
			</div>
			<div class="row songsTable">
				<table class="table table-striped table-dark">
					<thead>
						<tr>
							<th scope="col">Question</th>
							<th scope="col">Tags</th>
						</tr>
					</thead>
					<tbody>
					<c:forEach items="${questions}" var="question">
						<tr>
							<td><a href="/questions/${question.id}"><c:out value="${question.insertQ}"/></a></td>
							<td>
								<c:forEach items="${question.tags}" var="tag">
									<p class="inline">${tag.insertT}<c:if test="${ question.tags.indexOf(tag) != question.tags.size() - 1 }">, </c:if></p>
								</c:forEach>
							</td>
						</tr>
					</c:forEach>
					</tbody>				
				</table>
			</div>
			<div class="row four">		
            	<a href="/questions/new">New Question</a>
			</div>
		</div>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
	</body>
</html>