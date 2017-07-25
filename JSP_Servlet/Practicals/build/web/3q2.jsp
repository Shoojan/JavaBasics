<%-- 
    Document   : 3q2
    Created on : Jul 22, 2017, 11:17:36 PM
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
        <% String newsPage;
            if (Math.random() < 0.5)
              newsPage="gn.jsp";
            else
              newsPage="bn.jsp";
         %>
         <jsp:include page="<%= newsPage %>" flush="true" />
    </body>
</html>
