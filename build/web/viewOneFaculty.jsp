<%-- 
    Document   : viewProfessor
    Created on : Aug 28, 2023, 7:54:53 PM
    Author     : HP
--%>

<%@page import="DTO.FacultyDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

     <link rel="stylesheet" href="viewone.css">
    </head>
    <body>

           <% 
    
             FacultyDTO u1= (FacultyDTO)session.getAttribute("viewobj");
           if(u1==null)
              response.sendRedirect("login.html");
      
          
          %>  
          
          
         <div class="nav">

    <div id="navlist">
    <div id="logoitem"><img id="logo" src="logo.png" alt=""/>IIST</div>

    <div id="aboutus"> <a href="#"> AboutUs</a> </div>
    <div id="contactus"> <a href="#">ContactUs</a> </div></div>
   <div id="btn"><a href="Admin.jsp">Close</a></div>
  </div>
              
        
<div class="student">

  <div id="personal"><h3> Personal Details </h3>
      <div class="">Your Name : <%= u1.getName()%></div>
    <div  class="">Father Name : <%= u1.getFathername()%></div>

    <div class="">Email Id : <%= u1.getEmailid()%> </div>
   <div class="">Contact No : <%= u1.getContactno()%></div>  
      <div class="">Address : <%= u1.getAddress()%></div>
  </div>

 
  <div id="institute"> <h3> Institute Details</h3>
      <div class=""> Institute Id:  <%= u1.getInstituteid()%> </div>
        <div class="">Post:  <%= u1.getPost()%></div>
      <div class="">Specialization: <%= u1.getSpecilization()%></div>
  <div class="">CTC Status:  <%= u1.getCtc()%></div>
      <div class="">Alloted Class:  <%= u1.getAllotedclass()%></div>
    <div class="">Your Rank:  <%= u1.getRank()%></div>
  </div>
</div>
  

        
    </body>
</html>
