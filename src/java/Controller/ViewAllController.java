/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.AllFacultyViewDAO;
import DAO.AllHodViewDAO;
import DAO.AllviewDAO;
import DTO.AllviewDTO;
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
public class ViewAllController extends HttpServlet {

   public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
       HttpSession session =req.getSession(true);
     
       String val=req.getParameter("data");
              AllviewDTO t1=new AllviewDTO();
                 session.setAttribute("allview", t1);
       if(val.equalsIgnoreCase("View All Students"))
       {
           AllviewDAO a1=new AllviewDAO();

    
      a1.getset(t1);
      
      resp.sendRedirect("viewAllStudent.jsp");
       }
       else if(val.equalsIgnoreCase("View All Faculty's"))
      {
          AllFacultyViewDAO d1= new AllFacultyViewDAO();
          d1.getset(t1);
          resp.sendRedirect("viewAllFaculty.jsp");
          
               }
           else if(val.equalsIgnoreCase("View All HOD's"))
      {
          AllHodViewDAO d1= new AllHodViewDAO();
          d1.getset(t1);
          resp.sendRedirect("viewAllHod.jsp");
          
               }
    }

 public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      
    }

   
}
