<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<style>
	.error {color: red}
</style>
<meta charset="UTF-8">
<title>Student Form</title>
</head>
<body>

	<form:form action="processForm" modelAttribute="student">
	
		First Name: <form:input path="firstName"/>
		<form:errors path="firstName" cssClass="error"/>
		<br>
		
		
		Last Name: <form:input path="lastName"/>
				<form:errors path="lastName" cssClass="error"/>
		
		<br>
		
		<form:select path="country">
			<form:options items="${student.countryOptions}" />
		</form:select>
		
		<br><br>
		
		Age: 
		<form:input path="age"/>
		<form:errors path="age" cssClass="error"/>
		<br>
		
		Favorite Language: <br>
		
		Javascript <form:radiobutton path="favoriteLanguage" value="Javascript"/>	<br>	
		Java <form:radiobutton path="favoriteLanguage" value="Java"/> <br>
		C# <form:radiobutton path="favoriteLanguage" value="C#"/> <br>
		
		
		<br><br>
		
		Operation System: <br>
		
		Windows <form:checkbox path="operationSystems" value="Windows"/> <br>
		Linux <form:checkbox path="operationSystems" value="Linux" /> <br>
		OsX <form:checkbox path="operationSystems" value="OsX" /> <br>
		
		<input type="submit" value="Submit"/>
		
	</form:form>

</body>
</html>