/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.FacultyDAO;
import DAO.HodDAO;
import DAO.StudentDAO;
import DTO.ComplainDTO;
import DTO.FacultyDTO;
import DTO.HodDTO;
import DTO.StudentDTO;
import DTO.UserDTO;
import Model.ComplainRender;
import Model.LoginAuth;
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
public class LoginChecker extends HttpServlet {


   public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       resp.sendRedirect("login.html") ;   }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     String id= req.getParameter("id");
      String password= req.getParameter("password");
      
   
       UserDTO  user= new UserDTO();
         HttpSession session =req.getSession(true);
           
         
         
            user.setPassword(password);
            user.setId(id);
            
            
                ComplainDTO c1=new ComplainDTO();
        session.setAttribute("complainobj", c1);
        ComplainRender r1=new ComplainRender();
            r1.render(c1);
            
            
       LoginAuth l1= new LoginAuth();  
       
            if(l1.isLogin(user))
            {    
               String role= user.getRole();
                session.setAttribute("role", role);
                 
               if(role.equalsIgnoreCase("admin"))
               {
                  
                   resp.sendRedirect("Admin.jsp");
                   
               }   
               else if(role.equalsIgnoreCase("student"))
               {
                   StudentDTO s1=new StudentDTO();
                   s1.setEnrollmentno(id);
                   
                   StudentDAO u1=new StudentDAO();
                   u1.getSetData(s1);
                   session.setAttribute("dto", s1);
                    resp.sendRedirect("student.jsp");
               }
                else if(role.equalsIgnoreCase("faculty"))
               {
                   FacultyDTO s1=new FacultyDTO();
                   s1.setInstituteid(id);
                   
                   FacultyDAO u1=new FacultyDAO();
                   u1.getSetData(s1);
                   session.setAttribute("dto", s1);
                    resp.sendRedirect("faculty.jsp");
               }
               
                else if(role.equalsIgnoreCase("hod"))
               {
                   HodDTO s1=new HodDTO();
                   s1.setInstituteid(id);
                   
                   HodDAO u1=new HodDAO();
                   u1.getSetData(s1);
                   session.setAttribute("dto", s1);
                    resp.sendRedirect("hod.jsp");
               }
               else
            resp.sendRedirect("login.html");   
               
            }
            else
            {
                System.out.println("hello");
               resp.sendRedirect("login.html") ;   
            }
                 
    }

  
}
