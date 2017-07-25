<%-- 
    Document   : 2q1
    Created on : Jul 22, 2017, 10:02:26 PM
    Author     : plumi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@ page import="java.math.*" %>
        <% String numbr = request.getParameter("num");
           BigInteger original;
           original = new BigInteger(numbr);
           BigInteger results = original.pow(2);
        %>
        <H3>The square of <%= original %> is <%= results %></H3>
    </body>
</html>
