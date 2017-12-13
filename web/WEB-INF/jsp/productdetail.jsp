<%-- 
    Document   : productdetail
    Created on : Dec 13, 2017, 3:17:23 PM
    Author     : RomyRivaldy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>About ${products.description}</title>
    </head>
    <body>
        <h1>${products.description}</h1>
        Product ID : ${products.productId}<br/>
        Purchase Cost : USD$ ${products.purchaseCost}<br/>
        Quantity On Hand : ${products.quantityOnHand}<br/>
        Markup : ${products.markup}<br/>
        Available : ${products.available}<br/>
        Description : ${products.description}<br/>
    </body>
</html>
