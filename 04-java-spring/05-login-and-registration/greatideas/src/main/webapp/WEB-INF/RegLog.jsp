<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="Great Ideas project Registration and Login Page" content="Spring Boot project named Great Ideas">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Great Ideas project Registration and Login Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.4.1.js" integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU=" crossorigin="anonymous"></script>
		<link rel="stylesheet" type="text/css" href="/css/main.css">
		<script type="text/javascript" src="/js/main.js"></script>
    </head>
	<body>
		<div class="container-fluid">
			<div class="col four">
				<div class="row four">		
	 				<h1>Register</h1>
				</div>
				<div class="row four">		
	 				<p><form:errors path="userModel.*"/></p>
				</div>
				<div class="row four">		
	 				<form:form method="POST" action="/registration" modelAttribute="userModel">
						<div class="row four">
							<form:label path="emailAddress">Email Address: </form:label>
							<form:input type="email" path="emailAddress"/>
						</div>
						<div class="row four">
							<form:label path="name">Name: </form:label>
							<form:input type="text" path="name"/>
						</div>
						<div class="row four">
							<form:label path="password">Password: </form:label>
							<form:password path="password"/>
						</div>
						<div class="row four">
							<form:label path="passwordConfirmation">Password Confirmation: </form:label>
							<form:password path="passwordConfirmation"/>
						</div>
						<div class="row four">
							<input type="submit" value="Register"/>
						</div>
	 				</form:form>
				</div>
			</div>
			<div class="col four">
				<div class="row four">		
	 				<h1>Login</h1>
				</div>
				<div class="row four">		
	 				<form method="POST" action="/login">
						<div class="row four">
							<label for="emailaddress">Email Address: </label>
							<input type="email" id="emailaddress" name="emailaddress"/>
						</div>
						<div class="row four">
							<label for="password">Password: </label>
							<input id="password" name="password"/>
						</div>
						<div class="row four">
							<input type="submit" value="Login"/>
						</div>
	 				</form>
				</div>
			</div>			
		</div>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
	</body>
</html>