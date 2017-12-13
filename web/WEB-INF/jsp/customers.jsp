<%-- 
    Document   : customer
    Created on : Dec 13, 2017, 9:56:53 AM
    Author     : RomyRivaldy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List Customer</title>
    </head>
    <body>
        <h1>Customer</h1>
        <c:forEach var="cu" items="${customers}">
            <p><a href="${cu.customerId}">${cu.name}</a> di ${cu.city} </p>
        </c:forEach>
    </body>
</html>
