<%-- 
    Document   : 3q1
    Created on : Jul 22, 2017, 11:07:41 PM
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
        <H3>Signature Block Page</H3>
        <p>Make a JSP 'signature block' page with your name and email address. Include it in another JSP page. 
            
            So, this is the jsp page named "3q1.jsp" showing this information but the name and email address 
            below have been taken from next jsp page
            named "signature_block.jsp".
            
            Thank You!
        </p>
            <jsp:include page="signature_block.jsp" flush="true" />
    </body>
</html>
