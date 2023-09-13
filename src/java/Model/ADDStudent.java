/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DAO.AddDAO;
import DTO.StudentDTO;
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
public class ADDStudent extends HttpServlet {





  public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       StudentDTO s1 =new StudentDTO();
       
       s1.setAddress(req.getParameter("address"));
       s1.setAttendance(req.getParameter("attendance"));
       s1.setCgpa(req.getParameter("cgpa"));
       s1.setContactno(req.getParameter("contact"));
       s1.setEmailid(req.getParameter("emailid"));
       s1.setEnrollmentno(req.getParameter("id"));
       s1.setFathername(req.getParameter("fathername"));
       s1.setFees(req.getParameter("fees"));
       s1.setName(req.getParameter("name"));
       s1.setRank(req.getParameter("rank"));
       s1.setPassword(req.getParameter("password"));
       
     AddDAO d1=new AddDAO();
      boolean f= d1.addStudent(s1);
      if(f)
       resp.sendRedirect("Admin.jsp");
      else
          resp.sendRedirect("Addstudent.jsp");
    }

   public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
    }

  
}


