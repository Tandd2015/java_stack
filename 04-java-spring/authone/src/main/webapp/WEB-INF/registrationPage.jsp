<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
        <meta charset="UTF-8">
        <meta name="Spring Security project Registration Page" content="Spring Boot project named Spring Security">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spring Security project Registration Page</title>
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
            </nav>
			<div class="row four">		
 				<h1>Register!</h1>
			</div>
			<div class="row four">		
 				<p><form:errors path="userModel.*"/></p>
			    <c:if test="${errorMessage != null}">
	    			<c:out value="${errorMessage}"></c:out>
	 			</c:if>
			</div>
			<div class="row four">		
 				<form:form method="POST" action="/registration" modelAttribute="userModel">
					<div class="row four">
						<form:label path="emailAddress">Email Address: </form:label>
						<form:input type="email" path="emailAddress"/>
					</div>
					<div class="row four">
						<form:label path="username">Username: </form:label>
						<form:input type="text" path="username"/>
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
						<form:label path="firstName">First Name: </form:label>
						<form:input type="text" path="firstName"/>
					</div>
					<div class="row four">
						<form:label path="middleName">Middle Name: </form:label>
						<form:input type="text" path="middleName"/>
					</div>
					<div class="row four">
						<form:label path="lastName">Last Name: </form:label>
						<form:input type="text" path="lastName"/>
					</div>
					<div class="row four">
						<form:label path="suffixName">Suffix Name: </form:label>
						<form:input type="text" path="suffixName"/>
					</div>
					<div class="row four">
						<form:label path="birthday">Birthday: </form:label>
						<form:input type="date" path="birthday"/>
					</div>
					<div class="row four">
						<form:label path="houseAptStreet">House or Apartment #, Street Address: </form:label>
						<form:input type="text" path="houseAptStreet"/>
					</div>
					<div class="row four">
						<form:label path="city">City: </form:label>
						<form:input type="text" path="city"/>
					</div>
					<div class="row four">
						<form:label path="stateProvince">State or Province: </form:label>
						<form:input type="text" path="stateProvince"/>
					</div>
					<div class="row four">
						<form:label path="zipCode">Zip Code: </form:label>
						<form:input type="number" path="zipCode"/>
					</div>
					<div class="row four">
						<form:label path="country">Country: </form:label>
						<form:input type="text" path="country"/>
					</div>
					<div class="row four">
						<input type="submit" value="Register!"/>
					</div>
 				</form:form>
			</div>			
		</div>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
	</body>
</html>