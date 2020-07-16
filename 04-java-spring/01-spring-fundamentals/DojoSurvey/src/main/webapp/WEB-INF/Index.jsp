<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="Dojo Survey Home Page" content="Spring Boot project named Dojo Survey">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Dojo Survey Home Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.4.1.js" integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU=" crossorigin="anonymous"></script>
		<link rel="stylesheet" type="text/css" href="css/main.css">
		<script type="text/javascript" src="js/main.js"></script>
    </head>
    <body>
        <div class="container-fluid">
            <nav class="navbar navbar-dark bg-dark">
                <li class="nav-item">
                    <a class="nav-link" href="/">Home</a>
                </li>
            </nav>
            <main>
            	<h1>Dojo Survey</h1>
                <form class="four" action="/result" method="post">
                    <div class="row">
                        <div class="form-group">
                            <label for="firstName">First Name: </label>
                            <input type="text" class="form-control" id="firstName" name="firstName" placeholder="First Name">
                            <label for="lastName">Last Name: </label>
                            <input type="text" class="form-control" id="lastName" name="lastName" placeholder="Last Name">
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-group">
                            <label for="dojoLocation">Dojo Location: </label>
                            <select class="custom-select" id="dojoLocation" name="dojoLocation">
							<c:forEach items="${locationsList}" var="location">
								<option value="<c:out value='${location}location'/>"><c:out value='${location}'/></option>
							</c:forEach>
                            </select>
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-group">
                            <label for="${favoriteLanguage}">Favorite Language: </label>
                            <select class="custom-select"  id="favoriteLanguage" name="favoriteLanguage">
							<c:forEach items="${favoriteList}" var="favorite">
								<option value="<c:out value='${favorite}'/>"><c:out value='${favorite}'/></option>
							</c:forEach>
                            </select>
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-group">
                            <label for="textArea">Comment (Optional): </label>
                            <textarea class="form-control" id="textArea" name="textArea" rows="3"></textarea>
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-group">
                            <button type="submit" class="btn btn-outline-primary">Submit</button>
                        </div>
                    </div>
                </form>
            </main>
        </div>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>