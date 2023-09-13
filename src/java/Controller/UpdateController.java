/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.UpdateDAO;
import DAO.UpdateFacultyDAO;
import DAO.UpdateHodDAO;
import DTO.FacultyDTO;
import DTO.HodDTO;
import DTO.StudentDTO;
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
public class UpdateController extends HttpServlet {

 
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        String id= req.getParameter("id");
         HttpSession session =req.getSession(true);
       String updateval=  (String)session.getAttribute("update");
       
         if(updateval.equalsIgnoreCase("student"))
         {
              UpdateDAO d1=new UpdateDAO(); 
       StudentDTO user= d1.fetchSet(id);
      
       session.setAttribute("updateuser", user);
       resp.sendRedirect("updatestudent.jsp");
         }
         else if(updateval.equalsIgnoreCase("faculty"))
         { UpdateFacultyDAO d1 =new UpdateFacultyDAO();
            FacultyDTO u1= d1.fetchSet(id);
              session.setAttribute("updateuser", u1);
       resp.sendRedirect("updatefaculty.jsp");
         }
         else if(updateval.equalsIgnoreCase("hod"))
         {
             UpdateHodDAO d1 =new UpdateHodDAO();
          HodDTO u1= d1.fetchSet(id);
              session.setAttribute("updateuser", u1);
       resp.sendRedirect("updatehod.jsp");
         }
    }

   public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    }

    
}
