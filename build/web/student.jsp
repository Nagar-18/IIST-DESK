<%-- 
    Document   : home.jsp
    Created on : Aug 24, 2023, 8:30:51 PM
    Author     : HP
--%>

<%@page import="DTO.StudentDTO"%>
<%@page import="DAO.StudentDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <link rel="stylesheet" href="student.css">
    </head>
    <body>
         <div class="nav">

    <div id="navlist">
    <div id="logoitem"><img id="logo" src="logo.png" alt=""/>IIST</div>

 


    <div id="aboutus"> <a href="#"> AboutUs</a> </div>
    <div id="contactus"> <a href="#">ContactUs</a> </div></div>
    <div id="btn"><a href="logout.jsp">LogOut</a></div>
  </div>
        
        <% 
           String id= (String)session.getAttribute("role");
           
           if(id==null)
              response.sendRedirect("login.html");
      
            StudentDTO u1= (StudentDTO)session.getAttribute("dto");
          %>  
        
<div class="student">

  <div id="personal"><h3> Personal Details </h3>
      <div class="">Your Name : <%= u1.getName()%></div>
    <div  class="">Father Name : <%= u1.getFathername()%></div>

    <div class="">Email Id : <%= u1.getEmailid()%> </div>
   <div class="">Contact No : <%= u1.getContactno()%></div>  
      <div class="">Address : <%= u1.getAddress()%></div>
  </div>

  <div id="complainbx"> <div id="complain"><h2>Add Complain</h2></div>
  <form  action="ComplainBoxController" method="post"><input name="id" value="student" type="hidden"> <textarea name="box" id="" cols="30" rows="10" placeholder="Enter Your Complain Here"></textarea> <Button type="submit ">Submit</button></form>
 
  </div>
  <div id="institute"> <h3> Institue Details</h3>
      <div class=""> Enrollment No:  <%= u1.getEnrollmentno()%> </div>
        <div class="">Year:III </div>
      <div class="">Attendance Status: <%= u1.getAttendance()%></div>
  <div class="">Fees Status:  <%= u1.getFees()%></div>
      <div class="">CGPA :  <%= u1.getCgpa()%></div>
    <div class="">Rank:  <%= u1.getRank()%></div>
  </div>

</div>
        
        
    </body>
</html>
