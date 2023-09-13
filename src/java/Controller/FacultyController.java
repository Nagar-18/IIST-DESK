/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author HP
 */
public class FacultyController extends HttpServlet {
   public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String val=req.getParameter("data");
       System.out.println(val);
        HttpSession session = req.getSession(true);
        if(val.equalsIgnoreCase("Add Faculty"))resp.sendRedirect("addFaculty.jsp");
       
                 else if(val.equalsIgnoreCase("Remove Faculty"))
                {
                   
                    
                
                 session.setAttribute("remove", "faculty");
        resp.sendRedirect("remove.jsp");
                }
                  else if(val.equalsIgnoreCase("Update Faculty"))
                {
                      session.setAttribute("update", "faculty");
         resp.sendRedirect("updateid.jsp");
                }
                    else if(val.equalsIgnoreCase("View Individuals Report"))
                {
                   session.setAttribute("viewone", "faculty");
                    resp.sendRedirect("viewOne.jsp");
                }
        else
        resp.sendRedirect("login.html");
    }

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        
    }
 
}
