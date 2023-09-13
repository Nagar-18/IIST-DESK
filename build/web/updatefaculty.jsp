<%-- 
    Document   : updateFaculty
    Created on : Aug 28, 2023, 4:02:10 PM
    Author     : HP
--%>

<%@page import="DTO.FacultyDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel='stylesheet' href="addstudent.css"/>
    </head>
    <body>
         <body>
       <div class="nav">

    <div id="navlist">
    <div id="logoitem"><img id="logo" src="logo.png" alt=""/>IIST</div>

 


    <div id="aboutus"> <a href="#"> AboutUs</a> </div>
    <div id="contactus"> <a href="#">ContactUs</a> </div></div>
    <div id="btn"><a href="Admin.jsp">Cancel</a</div>
  </div>
        <% 
            FacultyDTO user=( FacultyDTO)session.getAttribute("updateuser");
            %>
       <div class="from">
                    <H2> Upadte Faculty in Our DataBase</H2>
                    <form action="UpdateFaculty" method="POST">
                        <table class="flex" >
                           
                        <tr>
                            <td><strong>InstitueID :</strong></td>
                            <td><input type="text" disabled="true" name="id" placeholder="<%=user.getInstituteid()%>"></td>
                       
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
                            <td><strong>Post:</strong></td>
                            <td><input type="text" name="post" placeholder="<%=user.getPost()%>"></td>
        
                        </tr>
                        
                         <tr>
                            <td><strong>Rank:</strong></td>
                            <td><input type="text" name="rank" placeholder="<%=user.getRank()%>"></td>
        
<!--                        </tr>
                         <tr>-->
                            <td><strong>CTC:</strong></td>
                            <td><input type="text" name="ctc" placeholder="<%=user.getCtc()%>"></td>
        
                        </tr>
                         <tr>
                            <td><strong>Attendance:</strong></td>
                            <td><input type="text" name="specilization" placeholder="<%=user.getSpecilization()%>"></td>
                              <td><strong>AllotedClass:</strong></td>
                            <td><input type="text" name="allotedclass" placeholder="<%=user.getAllotedclass()%>"></td>
                        </tr>
                        </th>
                        </table>
                        <div class="btn"><Button type="submit"> Submit</button></div>
                    </form>
    </body>
</html>
