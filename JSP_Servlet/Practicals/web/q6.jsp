<%-- 
    Document   : q6
    Created on : Jul 22, 2017, 9:07:56 PM
    Author     : plumi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%! private double randomNum = Math.random(); %>
    <%
        String bgColor = "";
        int a = (int)(Math.random() * 10);
        if ( a <= 3 ) {
            bgColor = "GREEN";
        } else if ((a > 3)&&(a <= 5) ){
            bgColor = "RED";
        } else if ((a > 5)&&(a <= 8) ){
            bgColor = "BLUE";
        } else{
            bgColor = "YELLOW";
        }
    %>
  
    <BODY BGCOLOR="<%= bgColor %>">
        <H2>Random Number: <%= randomNum %>
            <a href="q6.jsp"> Refresh </a>
        </H2>
    </body>
</html>
