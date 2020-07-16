<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.codingdojo.pets.models.Animal, com.codingdojo.pets.models.Cat"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	Animal animal = (Animal)request.getAttribute("animal");
	String type = (animal instanceof Cat) ? "Cat" : "Dog";
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
		<title>New <%= type %></title>
	</head>
	<body>
		<div class="container-fluid">
			<h1>Your Created: <%= animal.getBreed() %> and Another way today <c:out value="${ animal.getBreed()}"/> </h1>
			<h3>Animals Affection: <c:out value="${animal.showAffection()}"/> </h3>	
		</div>
	</body>
</html>