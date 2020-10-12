<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
<div align="center">
<h2>Welcome To RestroEats</h2><br/>
<a href="/AddRestaurant">Add your Restaurant</a><br/><br/>
<h3>Available Restaurants</h3>
<table>
 <c:forEach items="${restro}" var="l">
     <tr>
         <td>
            <a href="/view/${l.rId}">${l.restaurantName}</a><br>
         <td>
     </tr>
 </c:forEach>
</table>

</div>
</body>
</html>