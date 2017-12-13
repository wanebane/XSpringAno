<%-- 
    Document   : page
    Created on : Dec 12, 2017, 1:49:48 PM
    Author     : RomyRivaldy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
        <title>Annotation</title>
    </head>
    <body>
        <jsp:include page="head.jsp"></jsp:include>
            <div class="container">
                <h1>${message}</h1>
            <a href="register">Please Register</a><br/><br/>
            <a href="customers/all">Show Customers</a><br/><br/>
            <a href="products/all">Show Products</a>
        </div>
    </body>
</html>
