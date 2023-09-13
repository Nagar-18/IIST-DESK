<%-- 
    Document   : remove
    Created on : Aug 28, 2023, 8:58:38 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link rel="stylesheet" href="style.css">
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
                    <H2> Remove from IIST-Desk</H2>
                 
            
                    <form action="RemoveOne" method="POST">
                        <table >
                        <tr>
                            <td><strong>InstitueID :</strong></td>
                            <td><input type="text" name="id" placeholder="Enter Your ID"></td>
        
                        </tr>
                     </table>
                        <div class="btn"><Button type="submit"> Submit</button></div>
                    </form>
                </div>
            </div>
    </body>
</html>
