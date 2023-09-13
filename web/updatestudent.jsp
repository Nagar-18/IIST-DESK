<%-- 
    Document   : updateInterface
    Created on : Aug 28, 2023, 1:24:49 PM
    Author     : HP
--%>

<%@page import="DTO.StudentDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
        <% 
            StudentDTO user=(StudentDTO)session.getAttribute("updateuser");
            %>
       <div class="from">
                    <H2> Upadte Student in Our DataBase</H2>
                    <form action="UpdateStudent" method="POST">
                        <table class="flex" >
                           
                        <tr>
                            <td><strong>InstitueID :</strong></td>
                            <td><input type="text" name="id" disabled="true" placeholder="<%=user.getEnrollmentno()%>"></td>
                       
<!--                        <tr>-->
        
                            <td><strong> Password :</strong></td>
                            <td> <input type="password" name="password" placeholder=" <%=user.getPassword()%>"></td>
                        </tr><!--
-->                          <tr>
                            <td><strong>Name of Student</strong></td>
                            <td><input type="text" name="name" placeholder="<%=user.getName()%>"></td>
        
<!--                        </tr>
                          <tr>-->
                            <td><strong>Father-Name :</strong></td>
                            <td><input type="text" name="fathername" placeholder="<%=user.getFathername()%>"></td>
        
                        </tr><!--
-->                         <tr>
                            <td><strong> EmailId:</strong></td>
                            <td><input type="text" name="emailid" placeholder="<%=user.getEmailid()%>"></td>
        
<!--                        </tr>   -->
<!--                     
                          

                          <tr>-->
                            <td><strong> Contact:</strong></td>
                            <td><input type="text" name="contact" placeholder="<%=user.getContactno()%>"></td>
        
                        </tr>
                           <tr>
                            <td><strong> Address:</strong></td>
                            <td><input type="text" name="address" placeholder="<%=user.getAddress()%>"></td>
        
<!--                        </tr>
                           <tr>-->
                            <td><strong>Fees-Due:</strong></td>
                            <td><input type="text" name="fees" placeholder="<%=user.getFees()%>"></td>
        
                        </tr>
                        
                         <tr>
                            <td><strong>Rank:</strong></td>
                            <td><input type="text" name="rank" placeholder="<%=user.getRank()%>"></td>
        
<!--                        </tr>
                         <tr>-->
                            <td><strong>CGPA:</strong></td>
                            <td><input type="text" name="cgpa" placeholder="<%=user.getCgpa()%>"></td>
        
                        </tr>
                         <tr>
                            <td><strong>Attendance:</strong></td>
                            <td><input type="text" name="attendance" placeholder="<%=user.getAttendance() %>"></td>
        
                        </tr>
                        </th>
                        </table>
                        <div class="btn"><Button type="submit"> Submit</button></div>
                    </form>
    </body>
</html>
