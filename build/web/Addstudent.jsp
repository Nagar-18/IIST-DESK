<%-- 
    Document   : Add
    Created on : Aug 27, 2023, 7:22:29 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel='stylesheet' href="student.css"/>
    </head>
    
    <body>
         
  <div class="nav">

    <div id="navlist">
    <div id="logoitem"><img id="logo" src="logo.png" alt=""/>IIST</div>

 


    <div id="aboutus"> <a href="#"> AboutUs</a> </div>
    <div id="contactus"> <a href="#">ContactUs</a> </div></div>
    <div id="btn"><a href="logout.jsp">Cancel</a></div>
  </div>
       <div class="from">
                    <H2>Adding Student in Our DataBase</H2>
                    <form action="ADDStudent" method="POST">
                        <table class="flex" >
                           
                        <tr>
                            <td><strong>InstitueID :</strong></td>
                            <td><input type="text" name="id" placeholder="Enter EnrollmentNo of Student"></td>
                       
<!--                        <tr>-->
        
                            <td><strong> Password :</strong></td>
                            <td> <input type="password" name="password" placeholder=" Enter Password"></td>
                        </tr><!--
-->                          <tr>
                            <td><strong>Name of Student</strong></td>
                            <td><input type="text" name="name" placeholder="Enter Name of Student"></td>
        
<!--                        </tr>
                          <tr>-->
                            <td><strong>Father-Name :</strong></td>
                            <td><input type="text" name="fathername" placeholder="Enter Father-Name of Student"></td>
        
                        </tr><!--
-->                         <tr>
                            <td><strong> EmailId:</strong></td>
                            <td><input type="text" name="emailid" placeholder="Enter Email-Id of Student"></td>
        
<!--                        </tr>   -->
<!--                     
                          

                          <tr>-->
                            <td><strong> Contact:</strong></td>
                            <td><input type="text" name="contact" placeholder="Enter Contact of Student"></td>
        
                        </tr>
                           <tr>
                            <td><strong> Address:</strong></td>
                            <td><input type="text" name="address" placeholder="Enter Adress of Student"></td>
        
<!--                        </tr>
                           <tr>-->
                            <td><strong>Fees-Due:</strong></td>
                            <td><input type="text" name="fees" placeholder="Enter Due-Amount of Student"></td>
        
                        </tr>
                        
                         <tr>
                            <td><strong>Rank:</strong></td>
                            <td><input type="text" name="rank" placeholder="Enter Rank of Student"></td>
        
<!--                        </tr>
                         <tr>-->
                            <td><strong>CGPA:</strong></td>
                            <td><input type="text" name="cgpa" placeholder="Enter cgpa of Student"></td>
        
                        </tr>
                         <tr>
                            <td><strong>Attendance:</strong></td>
                            <td><input type="text" name="attendance" placeholder="Enter Attendance of Student"></td>
        
                        </tr>
                        </th>
                        </table>
                        <div class="btn"><Button type="submit"> Submit</button></div>
                    </form>
    </body>
</html>
