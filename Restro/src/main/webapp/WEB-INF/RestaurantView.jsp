<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
</style>
</head>
<body>
	<div align="center">

		<c:forEach items="${recipes}" var="l">

			<h2>${l.restaurantName}</h2>

			<table>
				<tr>
					<th>Recipe Name</th>
					<th>Price</th>
				</tr>
				<tr>
					<td>${l.recipeName1}</td>
					<td>${l.price1}</td>
				</tr>
				<tr>
					<td>${l.recipeName2}</td>
					<td>${l.price2}</td>
				</tr>
				<tr>
					<td>${l.recipeName3}</td>
					<td>${l.price3}</td>
				</tr>
			</table>

		</c:forEach>
		<br> <br> <a href="/">Go to Home Page</a>

	</div>
</body>
</html>