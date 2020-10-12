<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>  
 <%@taglib prefix="spring" uri="http://www.springframework.org/tags/form"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <div align="center">
        <h2>Restaurant Registration</h2>
        <form:form action="addData" method="post" modelAttribute="add">
           <table>
           <tr>
            <td>Restaurant name:</td>
            <td><form:input path="restaurantName" required="true"/></td>
            </tr> 
           <tr>
           <td>Item name:</td>
            <td><form:input path="recipeName1" required="true"/></td>
            </tr>
            <tr> 
            <td>price:</td>
            <td><form:input path="price1" required="true"/></td>
            </tr>
             <tr>
			<td>Item name:</td>
            <td><form:input path="recipeName2" required="true"/></td>
            </tr>
            <tr>
         	<td> price:</td>
           <td> <form:input path="price2" required="true"/></td>
            </tr>
            <tr>
           <td>Item name:</td>
           <td> <form:input path="recipeName3" required="true"/></td>
            </tr>
            <tr>
            <td> price:</td>
            <td><form:input path="price3" required="true"/></td>
            </tr>
            <tr>
            <td></td>
            <td><form:button>Register</form:button></td>
            </tr>
            </table>
        </form:form>
    </div>
</body>
</html>