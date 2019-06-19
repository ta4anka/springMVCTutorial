<%--
  Created by IntelliJ IDEA.
  User: maya
  Date: 18.06.19
  Time: 12:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Customer Confirmation</title>
</head>
<body>
 The customer is confirmed:  ${customer.firstName}  ${customer.lastName}
<br><br>
Free passes: ${customer.freePasses}
</body>
</html>
