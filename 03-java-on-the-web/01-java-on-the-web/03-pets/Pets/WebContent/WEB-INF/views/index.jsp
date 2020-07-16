  
<%-- <%@ page language="java" contentType="text/html; ISO-8859-1"
    pageEncoding="ISO-8859-1"%> --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
		<title>Index jsp</title>
	</head>
	<body>
	    <div class="container-fluid">
		    <div class="row">
		    	<div class="col">
				    <h3>Add a Cat....</h3>
				    <form action="/Pets/cats" method="post">
				        <div class="form-group col-md-12">    
				            <label class="col-md-4 col-form-label incline" for="name">Cat Name: </label>
				            <input type="text" class="form-control manufacturer_holder col-md-5 incline" id="catName" name="name" placeholder="Cat Name">
				        </div>
				        <div class="form-group col-md-12">
				            <label class="col-md-4 col-form-label incline" for="breed">Cat Breed: </label>
				            <input type="text" class="form-control col-md-5 incline" id="catBreed" name="breed" placeholder="Cat Breed">
				        </div>
				        <div class="form-group col-md-12">
				            <label class="col-md-4 col-form-label incline" for="weight">Cat Weight: </label>
				            <input type="number" class="form-control col-md-5 incline" id="catWeight" name="weight" placeholder="Cat Weight">
				        </div>
				        <div class="left form-group col-md-12">
				            <button type="submit" class="btn btn-primary">Add Cat Now!</button>
				        </div>
				    </form>
		    	</div>
		    	<div class="col">
				    <h3>Add a Dog....</h3>
				    <form action="/Pets/dogs" method="post">
				        <div class="form-group col-md-12">    
				            <label class="col-md-4 col-form-label incline" for="name">Dog Name: </label>
				            <input type="text" class="form-control manufacturer_holder col-md-5 incline" id="dogName" name="name" placeholder="Dog Name">
				        </div>
				        <div class="form-group col-md-12">
				            <label class="col-md-4 col-form-label incline" for="breed">Dog Breed: </label>
				            <input type="text" class="form-control col-md-5 incline" id="dogBreed" name="breed" placeholder="Dog Breed">
				        </div>
				        <div class="form-group col-md-12">
				            <label class="col-md-4 col-form-label incline" for="weight">Dog Weight: </label>
				            <input type="number" class="form-control col-md-5 incline" id="dogWeight" name="weight" placeholder="Dog Weight">
				        </div>
				        <div class="left form-group col-md-12">
				            <button type="submit" class="btn btn-primary">Add Dog Now!</button>
				        </div>
				    </form>
		    	</div>
		    </div>
	    </div>
	</body>
</html>