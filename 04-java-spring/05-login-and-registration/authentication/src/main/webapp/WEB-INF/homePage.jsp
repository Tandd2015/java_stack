<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="Controllers and Views project Home Page" content="Spring Boot project named Controllers and Views">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Controllers and Views project Home Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.4.1.js" integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU=" crossorigin="anonymous"></script>
		<link rel="stylesheet" type="text/css" href="/css/main.css">
		<script type="text/javascript" src="/js/main.js"></script>
    </head>
	<body>
		<div class="container-fluid">
			<nav class="navbar navbar-dark bg-dark">
                <li class="nav-item">
                    <a class="nav-link" href="/registration">Registration</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/login">Login</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/home">DashBoard</a>
                </li>
            </nav>
			<div class="row four">		
 				<h1>Registered or Logged in!</h1>
			</div>
			<div class="row four">
				<p>Email Address: <c:out value="${userModel.emailAddress}"/></p>
			</div>
			<div class="row four">
				<p>Username: <c:out value="${userModel.username}"/></p>
			</div>
			<div class="row four">
				<p>First Name: <c:out value="${userModel.firstName}"/></p>
			</div>
			<div class="row four">
				<p>Middle Name: <c:out value="${userModel.middleName}"/></p>
			</div>
			<div class="row four">
				<p>Last Name: <c:out value="${userModel.lastName}"/></p>
			</div>
			<div class="row four">
				<p>Suffix Name: <c:out value="${userModel.suffixName}"/></p>
			</div>
			<div class="row four">
				<p>Birthday: <c:out value="${userModel.birthday}"/></p>
			</div>
			<div class="row four">
				<p>House or Apartment #, Street Address: <c:out value="${userModel.houseAptStreet}"/></p>
			</div>
			<div class="row four">
				<p>City: <c:out value="${userModel.city}"/></p>
			</div>
			<div class="row four">
				<p>State or Province: <c:out value="${userModel.stateProvince}"/></p>
			</div>
			<div class="row four">
				<p>Zip Code: <c:out value="${userModel.zipCode}"/></p>
			</div>
			<div class="row four">
				<p>Country: <c:out value="${userModel.country}"/></p>
			</div>
			<div class="row four">
				<a href="/logout">Logout</a>
			</div>			
		</div>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
	</body>
</html>