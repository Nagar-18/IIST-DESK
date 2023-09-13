<%-- 
    Document   : Admin
    Created on : Aug 25, 2023, 2:41:18 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
        <link rel="stylesheet" href="admin.css"  />
    </head>
   <body>
       <% 
     String role=  (String) session.getAttribute("role");
      
if(role==null)
response.sendRedirect("login.html");
  %>

 
  <div class="nav">

    <div id="navlist">
    <div id="logoitem"><img id="logo" src="logo.png" alt=""/>IIST</div>

 


    <div id="aboutus"> <a href="#"> AboutUs</a> </div>
    <div id="contactus"> <a href="#">ContactUs</a> </div></div>
   rr <div class="nav-2">
      <div id="btn"><a href="complainBox.jsp" >ComplainBox</a></div>
    <div  id="btn"><a href="logout.jsp" >LogOut</a></div>
    </div>
    
  </div>



<div class="attribute">
  <div id="student"><h3> Manage Student</h3>
      <div class="mg-y"><form action="StudentController" method="post"  ><input style='  background-color: transparent;
    border: none;' name="data" type="submit" value="Add Student" ></form></div>
     <div class="mg-y"><form action="StudentController" method="post"  ><input style='  background-color: transparent;
    border: none;' name="data" type="submit" value="Remove Student" ></form></div>
     <div class="mg-y"><form action="StudentController" method="post"  ><input style='  background-color: transparent;
    border: none;' name="data" type="submit" value="Update Student" ></form></div>
       
 <div class="mg-y"><form action="StudentController" method="post"  ><input style='  background-color: transparent;
    border: none;' name="data" type="submit" value="View Individuals Report" ></form></div>
         <div class="mg-y"><form action="ViewAllController" method="post"  ><input style='  background-color: transparent;
    border: none;' name="data" type="submit" value="View All Students" ></form></div>
   
          </div>
  <div id="faculty"><h3> Manage Faculty</h3>
         <div class="mg-y"><form action="FacultyController" method="post"  ><input style='  background-color: transparent;
    border: none;' name="data" type="submit" value="Add Faculty" ></form></div>
     <div class="mg-y"><form action="FacultyController" method="post"  ><input style='  background-color: transparent;
    border: none;' name="data" type="submit" value="Remove Faculty" ></form></div>
      <div class="mg-y"><form action="FacultyController" method="post"  ><input style='  background-color: transparent;
    border: none;' name="data" type="submit" value="Update Faculty" ></form></div>
      <div class="mg-y"><form action="FacultyController" method="post"  ><input style='  background-color: transparent;
    border: none;' name="data" type="submit" value="View Individuals Report" ></form></div>
      <div class="mg-y"><form action="ViewAllController" method="post"  ><input style='  background-color: transparent;
    border: none;' name="data" type="submit" value="View All Faculty's" ></form></div>
 
  </div>
  <div id="hod"> <h3> Manage HOD</h3>
        <div class="mg-y"><form action="HodController" method="post"  ><input style='  background-color: transparent;
    border: none;' name="data" type="submit" value="Add HOD" ></form></div>
   <div class="mg-y"><form action="HodController" method="post"  ><input style='  background-color: transparent;
    border: none;' name="data" type="submit" value="Remove HOD" ></form></div>
   <div class="mg-y"><form action="HodController" method="post"  ><input style='  background-color: transparent;
    border: none;' name="data" type="submit" value="Update HOD" ></form></div>
   <div class="mg-y"><form action="HodController" method="post"  ><input style='  background-color: transparent;
    border: none;' name="data" type="submit" value="View Individuals Report" ></form></div>
   <div class="mg-y"><form action="ViewAllController" method="post"  ><input style='  background-color: transparent;
    border: none;' name="data" type="submit" value="View All HOD's" ></form></div>
 
  
  </div>
</div>s

  
 
   
</body>
           
            
       
    </body>
</html>
