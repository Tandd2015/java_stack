<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Checkerboard JavaStack</title>
		<link rel="stylesheet" href="./style.css">
	</head>
	<body>
		<div class="wrapper">
			<%
 				String height = request.getParameter("x") != null ? request.getParameter("x") : "6";
				String width = request.getParameter("y") != null ? request.getParameter("y") : "6";
				int x = Integer.parseInt(height);
				int y = Integer.parseInt(width);
				String color1 = request.getParameter("c1") != null ? request.getParameter("c1") : "color1";
				String color2 = request.getParameter("c2") != null ? request.getParameter("c2") : "color2"; 
			%>

			<%!
				public String getColor(int x, int y) {
					if(x%2 == 0)
						return y%2 == 0 ? "color1" : "color2";
					return y%2 == 0 ? "color2" : "color1";
				}
			%>
			<h1>Checkerboard - Height: <%= height %>, Width: <%= width %></h1>
 			<table>
				<% for(int i = 0; i < x; i++) { %>
					<tr>
						<% for(int k = 0; k < y; k++) { %>
 							<td class="oneSquare <%= getColor(i, k) %>"></td>
						<% } %>
					</tr>
				<% } %>
			</table>
		</div>
	</body>
</html>