<%-- 
    Document   : complainBox
    Created on : Aug 29, 2023, 1:48:02 PM
    Author     : HP
--%>

<%@page import="DTO.BoxDTO"%>
<%@page import="java.util.Vector"%>
<%@page import="DTO.ComplainDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="viewallcss.css"/>
    </head>
    <body>
        <div>
                  <div class="nav">

    <div id="navlist">
    <div id="logoitem"><img id="logo" src="logo.png" alt=""/>IIST</div>

    <div id="aboutus"> <a href="#"> AboutUs</a> </div>
    <div id="contactus"> <a href="#">ContactUs</a> </div></div>
   <div id="btn"><a href="Admin.jsp">Close</a></div>
  </div>
            <div id="personal">
                <div>
            <table>
                    <% 
               ComplainDTO u1=(ComplainDTO)session.getAttribute("complainobj");
                Vector<BoxDTO>v=u1.getArr();
                
               for(int i=0;i<v.size();i++){
         %>
                <tr>
                <h2>Complain By <%=v.get(i).getId()%> :   <%=v.get(i).getBox()%></h2>
            
                </tr>
                      <%
                   
           }%>
            </table>
                </div>
        </div>
            </div>
    </body>
</html>
