<%-- 
    Document   : viewAllHod
    Created on : Aug 29, 2023, 12:23:35 PM
    Author     : HP
--%>

<%@page import="DTO.HodDTO"%>
<%@page import="java.util.Vector"%>
<%@page import="DTO.FacultyDTO"%>
<%@page import="DTO.AllviewDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link rel="stylesheet" href="viewallcss.css">
    </head>
    <body>
         <div class="nav">

    <div id="navlist">
    <div id="logoitem"><img id="logo" src="logo.png" alt=""/>IIST</div>

    <div id="aboutus"> <a href="#"> AboutUs</a> </div>
    <div id="contactus"> <a href="#">ContactUs</a> </div></div>
    <div id="btn"><a href="Admin.jsp">Close</a></div>
  </div>
        <div id="personal">
            <table>
          <tr style="color:white">
            <td>
                <h3> Name</h3></td>
            <td> <h3> FatherName</h3></td>
            <td><h3> EmailId </h3></td> 
             <td><h3>ContactNo </h3></td> 
              <td><h3> Address</h3></td> 
               <td><h3> Specilization</h3></td> 
                <td><h3>POST </h3></td> 
                <td> <h3> CTC</h3></td> 
                 <td> <h3> AllotedClass</h3></td> 
            
            
            
        </tr>
           <% 
               AllviewDTO u1=(AllviewDTO)session.getAttribute("allview");
                Vector<HodDTO>v=u1.getHarr();
               for(int i=0;i<v.size();i++){
         %>

        <tr>
            <td >
                <h3>  <%= v.get(i).getName()%></h3></td>
            <td> <h3> <%= v.get(i).getFathername() %></h3></td>
            <td><h3><%= v.get(i).getEmailid()%></h3></td> 
             <td><h3><%= v.get(i).getContactno() %></h3></td> 
              <td><h3> <%= v.get(i).getAddress()%></h3></td> 
               <td><h3> <%= v.get(i).getSpecilization() %></h3></td> 
                <td><h3><%= v.get(i).getPost() %></h3></td> 
                <td> <h3> <%= v.get(i).getCtc() %></h3></td> 
           <td> <h3> <%= v.get(i).getAllotedclass() %></h3></td> 

                
            
            
            
        </tr>
        
        
 
    
    
               <%
                   
           }%>
          
           </table>    
        </div>
      
              
        
    </body>
</html>
