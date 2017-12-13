<%-- 
    Document   : registration
    Created on : Dec 12, 2017, 4:40:57 PM
    Author     : RomyRivaldy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Form Registration</title>
    </head>
    <body>
        <h1>Form Registration</h1>
        <form:form action="register/save" modelAttribute="registerBean" method="POST" >
            <table>
                <tr><td><form:label path="firstName">First Name</form:label></td>
                    <td><form:input path="firstName"/></td></tr>
                <tr><td><form:label path="lastName">Last Name</form:label></td>
                    <td><form:input path="lastName"/></td></tr>
                <tr><td><form:label path="username">Username</form:label></td>
                    <td><form:input path="username"/></td></tr>
                <tr><td><form:label path="password">Password</form:label></td>
                    <td><form:password path="password" /></td></tr>
                <tr><td></td><td><form:button name="submitButton" value="Submit">Submit</form:button></td></tr>            
            </table>            
        </form:form>
    </body>
</html>