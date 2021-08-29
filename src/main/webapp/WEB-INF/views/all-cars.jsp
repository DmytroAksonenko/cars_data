<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<body>

	<h2>All Cars</h2>
	<br>

	<table>
	
		<tr>
			<th>Model</th>
			<th>VIN</th>
		</tr>

		<c:forEach var="car" items="${allCars}">
			<tr>
				<td>${car.model}</td>
				<td>${car.vin}</td>
			</tr>
		</c:forEach>
		
	</table>
</body>

</html>