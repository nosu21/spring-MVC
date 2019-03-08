<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>

<html>
<head>

<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/test.css"/> 
	
<title>Customer Registration form</title>
</head>

<body>
<i>Fill out the form. Asterisk (*) means required</i>
	<form:form action="processForm" modelAttribute="customer">
	
		First Name: <form:input path="firstName" />
		<br>
		<br>
		Last Name: (*) <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error"></form:errors>
		<br>
		<br>
		<input type="submit" value="submit" />
	</form:form>
</body>
</html>