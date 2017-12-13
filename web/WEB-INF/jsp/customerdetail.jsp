<%-- 
    Document   : customerdetail
    Created on : Dec 13, 2017, 11:26:10 AM
    Author     : RomyRivaldy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>
            Limit ${customers.name}
        </title>
    </head>
    <body>
        <h1>${customers.name}</h1>
        Credit Limit : USD ${customers.creditLimit}
    </body>
</html>
