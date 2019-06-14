<%--
  Created by IntelliJ IDEA.
  User: maya
  Date: 14.06.19
  Time: 10:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello,${param.userName}</title>
</head>
<body>
Hello, Spring MVC
<br>
User name: ${param.userName}    <!--"userName" it's from form: name="userName"-->
<br>
The message: ${myMessage} <!--retrive the data from Model model(HelloWorldController)-->

</body>
</html>
