<%-- 
    Document   : hod
    Created on : Aug 26, 2023, 9:30:11 PM
    Author     : HP
--%>

<%@page import="DTO.HodDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HOD PAGE</title>
        <link rel="stylesheet" href="hod.css">
    </head>
    <body>
           <% 
           String id= (String)session.getAttribute("role");
           
           if(id==null)
              response.sendRedirect("login.html");
      
            HodDTO u1= (HodDTO)session.getAttribute("dto");
          %>  
         <div class="nav">

    <div id="navlist">
    <div id="logoitem"><img id="logo" src="logo.png" alt=""/>IIST</div>

    <div id="aboutus"> <a href="#"> AboutUs</a> </div>
    <div id="contactus"> <a href="#">ContactUs</a> </div></div>
    <div class="nav-2">
     <div id="btn"><a href="complainBox.jsp" >ComplainBOx</a></div>
    <div id="btn"><a href="logout.jsp">LogOut</a></div></div> 
  </div>
              
        
<div class="student">

  <div id="personal"><h3> Personal Details </h3>
      <div class="">Your Name : <%= u1.getName()%></div>
    <div  class="">Father Name : <%= u1.getFathername()%></div>

    <div class="">Email Id : <%= u1.getEmailid()%> </div>
   <div class="">Contact No : <%= u1.getContactno()%></div>  
      <div class="">Address : <%= u1.getAddress()%></div>
  </div>

  <div id="complainbx"> <div id="complain"><h2>Add Complain</h2></div>
      <form  action="ComplainBoxController" method="post"><input name="id" value="hod" type="hidden"> <textarea name="box" id="" cols="30" rows="10" placeholder="Enter Your Complain Here"></textarea>  <button type="submit">Submit</button></form>

  </div>
  <div id="institute"> <h3> Institute Details</h3>
      <div class=""> Institute Id:  <%= u1.getInstituteid()%> </div>
        <div class="">Post:  <%= u1.getPost()%></div>
      <div class="">Specialization: <%= u1.getSpecilization()%></div>
  <div class="">CTC Status:  <%= u1.getCtc()%></div>
      <div class="">Branch Alloted:  <%= u1.getAllotedclass()%></div>
    <div class="">Your Rank:  <%= u1.getRank()%></div>
  </div>
</div>
  

        
    </body>
</html>
