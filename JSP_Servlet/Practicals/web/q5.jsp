<%-- 
    Document   : q5
    Created on : Jul 22, 2017, 8:40:13 PM
    Author     : plumi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
            

    <BODY>
        <%! private double randomNum = Math.random(); %>
        <H3>Random Number: <%= randomNum %>
            <a href="q5.jsp"> Refresh </a>
        </H3>
    </body>
</html>
