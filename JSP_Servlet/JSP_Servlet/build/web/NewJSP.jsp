<%-- 
    Document   : NewJSP
    Created on : Jun 22, 2017, 10:31:30 PM
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
        <h1>Hello <%=request.getParameter("data")%>!</h1>
        
        <hr>
        <h2>Data from Form: <%=request.getParameter("Name")%></h2>
        
        
        <%!int i=1;%>
        <%while(i<=10){%>
        TV
        <%i++;}%>
    </body>
</html>
