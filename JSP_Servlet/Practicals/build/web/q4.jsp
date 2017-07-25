<%-- 
    Document   : q4
    Created on : Jul 15, 2017, 7:28:22 PM
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
        <%! private int randomInt(int range) {
            return(1 + (int)(Math.random() * range));
            }
        %>
        
        <% int value = Integer.parseInt(request.getParameter("randomnum")); 
           int numEntries = randomInt(value);
             for(int i=0; i<numEntries; i++) {
               out.println("<LI>" + randomInt(value) + "</LI>");
             }
          %>

    </body>
</html>
