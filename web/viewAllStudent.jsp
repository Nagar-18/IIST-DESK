<%-- 
    Document   : viewAllStudent
    Created on : Aug 29, 2023, 6:55:49 AM
    Author     : HP
--%>


<%@page import="DTO.StudentDTO"%>
<%@page import="java.util.Vector"%>
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
               <td><h3> Fees</h3></td> 
                <td><h3>Attendance </h3></td> 
                <td> <h3> CGPA</h3></td> 
                 <td> <h3> Rank</h3></td> 
            
            
            
        </tr>
           <% 
               AllviewDTO u1=(AllviewDTO)session.getAttribute("allview");
                Vector<StudentDTO>v=u1.getArr();
               for(int i=0;i<v.size();i++){
         %>

        <tr>
            <td >
                <h3>  <%= v.get(i).getName()%></h3></td>
            <td> <h3> <%= v.get(i).getFathername() %></h3></td>
            <td><h3><%= v.get(i).getEmailid()%></h3></td> 
             <td><h3><%= v.get(i).getContactno() %></h3></td> 
              <td><h3> <%= v.get(i).getAddress()%></h3></td> 
               <td><h3> <%= v.get(i).getFees()%></h3></td> 
                <td><h3><%= v.get(i).getAttendance()%></h3></td> 
                <td> <h3> <%= v.get(i).getCgpa()%></h3></td> 
                 <td> <h3><%= v.get(i).getRank()%></h3></td> 
            
            
            
        </tr>
        
        
 
    
    
               <%
                   
           }%>
          
           </table>    
        </div>
      
              
        
    </body>
</html>
