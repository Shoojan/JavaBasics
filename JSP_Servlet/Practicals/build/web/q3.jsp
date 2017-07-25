<%-- 
    Document   : q3
    Created on : Jul 15, 2017, 7:09:02 PM
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
        <h4>bullet list with a random int.</h4>
        <%!int i=0;%>
        <% int x=1+ (int)(Math.random() * 30);
        while(i<x){
            int randomnum = 1 +(int)(Math.random() * 30);
            out.println("<li>"+randomnum+"</li>");
            i++;
        }%>
      
    </body>
</html>
