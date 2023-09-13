<%-- 
    Document   : addFaculty
    Created on : Aug 28, 2023, 7:50:04 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>  <link rel='stylesheet' href="addstudent.css"/>
    </head>
         <link rel='stylesheet' href="addstudent.css"/>
    </head>
    <body>
           <div class="nav">

    <div id="navlist">
    <div id="logoitem"><img id="logo" src="logo.png" alt=""/>IIST</div>

 


    <div id="aboutus"> <a href="#"> AboutUs</a> </div>
    <div id="contactus"> <a href="#">ContactUs</a> </div></div>
    <div id="btn"><a href="Admin.jsp">Cancel</a></div>
  </div>
       <div class="from">
                    <H2>Adding  Faculty in Our DataBase</H2>
                    <form action="AddFaculty" method="POST">
                        <table class="flex" >
                           
                        <tr>
                            <td><strong>InstitueID :</strong></td>
                            <td><input type="text" name="id" placeholder="Enter EnrollmentNo of Faculty"></td>
                       
<!--                        <tr>-->
        
                            <td><strong> Password :</strong></td>
                            <td> <input type="password" name="password" placeholder=" Enter Password"></td>
                        </tr><!--
-->                          <tr>
                            <td><strong>Name of Student</strong></td>
                            <td><input type="text" name="name" placeholder="Enter Name of Faculty"></td>
        
<!--                        </tr>
                          <tr>-->
                            <td><strong>Father-Name :</strong></td>
                            <td><input type="text" name="fathername" placeholder="Enter Father-Name of Faculty"></td>
        
                        </tr><!--
-->                         <tr>
                            <td><strong> EmailId:</strong></td>
                            <td><input type="text" name="emailid" placeholder="Enter Email-Id of Faculty"></td>
        
<!--                        </tr>   -->
<!--                     
                          

                          <tr>-->
                            <td><strong> Contact:</strong></td>
                            <td><input type="text" name="contact" placeholder="Enter Contact of Student"></td>
        
                        </tr>
                           <tr>
                            <td><strong> Address:</strong></td>
                            <td><input type="text" name="address" placeholder="Enter Adress of Faculty"></td>
        
<!--                        </tr>
                           <tr>-->
                            <td><strong>POST:</strong></td>
                            <td><input type="text" name="post" placeholder="Enter Due-Amount of Faculty"></td>
        
                        </tr>
                        
                         <tr>
                            <td><strong>Specilization:</strong></td>
                            <td><input type="text" name="specilization" placeholder="Enter Rank of Faculty"></td>
        
<!--                        </tr>
                         <tr>-->
                            <td><strong>CTC:</strong></td>
                            <td><input type="text" name="ctc" placeholder="Enter cgpa of Faculty"></td>
        
                        </tr>
                         <tr>
                              <td><strong>AllotedClass:</strong></td>
                            <td><input type="text" name="allotedclass" placeholder="Enter AllotedClass of Faculty"></td>
                            <td><strong>Rank:</strong></td>
                            <td><input type="text" name="rank" placeholder="Enter Attendance of Faculty"></td>
        
                        </tr>
                        </th>
                        </table>
                        <div class="btn"><Button type="submit"> Submit</button></div>
                    </form>
    </body>
</html>
