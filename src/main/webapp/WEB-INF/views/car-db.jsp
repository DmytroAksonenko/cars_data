<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<body>

	<h2>Data</h2>
	<br>
	<form action="uploadFile" method="post">
		<div>
			<label for="file">Choose file to upload</label> <input type="file"
				id="file" name="file">
		</div>
		<div>
			<button>Submit</button>
		</div>
	</form>

</body>

</html>