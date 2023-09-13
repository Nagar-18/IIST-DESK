<%-- 
    Document   : logout
    Created on : Aug 22, 2023, 9:47:45 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LogOut</title>
    </head>
    <body>
<% 
   session.invalidate();
   response.sendRedirect("login.html");
%>
    </body>
</html>
