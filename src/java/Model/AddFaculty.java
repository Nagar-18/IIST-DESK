/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import DAO.AddFacultyDAO;
import DTO.FacultyDTO;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HP
 */
public class AddFaculty extends HttpServlet {

    
      public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
  FacultyDTO s1 =new FacultyDTO();
       
       s1.setAddress(req.getParameter("address"));
       s1.setAllotedclass(req.getParameter("allotedclass"));
       s1.setCtc(req.getParameter("ctc"));
       s1.setContactno(req.getParameter("contact"));
       s1.setEmailid(req.getParameter("emailid"));
       s1.setInstituteid(req.getParameter("id"));
       s1.setFathername(req.getParameter("fathername"));
       s1.setPost(req.getParameter("post"));
       s1.setName(req.getParameter("name"));
       s1.setRank(req.getParameter("rank"));
       s1.setPassword(req.getParameter("password"));
       s1.setSpecilization(req.getParameter("specilization"));
             

       
     AddFacultyDAO d1=new AddFacultyDAO();
      boolean f= d1.addFaculty(s1);
      if(!f)
       resp.sendRedirect("Admin.jsp");
      else
          resp.sendRedirect("Addfaculty.jsp");
    }

   public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
    }
}
