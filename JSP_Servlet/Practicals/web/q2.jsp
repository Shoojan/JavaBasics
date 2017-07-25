<%-- 
    Document   : q2
    Created on : Jul 15, 2017, 6:59:33 PM
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
        <H1>Reading Three Requested Parameters</H1>
        <B>1st Parameter : </B> <%= request.getParameter("param1") %><br/>
        <B>2nd Parameter : </B> <%= request.getParameter("param2") %><br/>
        <B>3rd Parameter : </B> <%= request.getParameter("param3") %>
    </body>
</html>
