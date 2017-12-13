<%-- 
    Document   : products
    Created on : Dec 13, 2017, 3:05:29 PM
    Author     : RomyRivaldy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="p" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product List</title>
    </head>
    <body>
        <h1>Products</h1>
        <p:forEach var="pr" items="${product}">
            <p><a href=${pr.productId}>${pr.description}</a> price $USD ${pr.purchaseCost}</p>
        </p:forEach>
    </body>
</html>
