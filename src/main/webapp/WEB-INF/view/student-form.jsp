<%--
  Created by IntelliJ IDEA.
  User: maya
  Date: 16.06.19
  Time: 11:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Student Registration Form</title>
</head>
<body>


<form:form action = "processForm" modelAttribute="student">

    First name: <form:input path="firstName"/>
    <br>
    Last name: <form:input path="lastName"/>
    <br><br>

    Country:
    <form:select path="country">

        <form:options items="${student.countryOptions}"/>

    </form:select>

    <br><br>

    Favorite language:
    Java <form:radiobutton path="favoriteLanguage" value="Java"/>
    Python <form:radiobutton path="favoriteLanguage" value="Python"/>
    C <form:radiobutton path="favoriteLanguage" value="C"/>

    <br><br>

    Operating systems:

    Linux <form:checkbox path="operatingSystems" value="Linux"/>
    Mac OS <form:checkbox path="operatingSystems" value="Mac OS"/>
    MS Windows <form:checkbox path="operatingSystems" value="MS Windows"/>

    <br><br>


    <input type="submit" value="Submit">

</form:form>

</body>
</html>
