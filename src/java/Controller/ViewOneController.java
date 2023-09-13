/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.FacultyDAO;
import DAO.HodDAO;
import DAO.StudentDAO;
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
public class ViewOneController extends HttpServlet {

  public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
               String id= req.getParameter("id");
         HttpSession session =req.getSession(true);
       String val=  (String)session.getAttribute("viewone");
       if(val.equalsIgnoreCase("student"))
       {
           StudentDAO u1=new StudentDAO();
           
            StudentDTO user=new StudentDTO();
          user.setEnrollmentno(id);
                    u1.getSetData(user);
               session.setAttribute("viewobj", user);
               resp.sendRedirect("viewOneStudent.jsp");
       }
        else if(val.equalsIgnoreCase("faculty"))
       {
           FacultyDAO u1=new FacultyDAO();
           
            FacultyDTO user=new FacultyDTO();
          user.setInstituteid(id);
                    u1.getSetData(user);
               session.setAttribute("viewobj", user);
               resp.sendRedirect("viewOneFaculty.jsp");
       }
          else if(val.equalsIgnoreCase("hod"))
       {
           HodDAO u1=new HodDAO();
           
            HodDTO user=new HodDTO();
          user.setInstituteid(id);
                    u1.getSetData(user);
               session.setAttribute("viewobj", user);
               resp.sendRedirect("viewOneHod.jsp");
       }
       
    }

  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
    }

   
}
