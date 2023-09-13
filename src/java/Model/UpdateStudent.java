/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DAO.UpdateDAO;
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
public class UpdateStudent extends HttpServlet {

 public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     HttpSession session =req.getSession(true);
      StudentDTO s1 = (StudentDTO)session.getAttribute("updateuser");
       if(req.getParameter("address")!="")
       s1.setAddress(req.getParameter("address"));
           if(req.getParameter("attendance")!="")
       s1.setAttendance(req.getParameter("attendance"));
               if(req.getParameter("cgpa")!="")
       s1.setCgpa(req.getParameter("cgpa"));
                   if(req.getParameter("contact")!="")
       s1.setContactno(req.getParameter("contact"));
                       if(req.getParameter("emailid")!="")
       s1.setEmailid(req.getParameter("emailid"));
                           if(req.getParameter("fathername")!="")

       s1.setFathername(req.getParameter("fathername"));
                               if(req.getParameter("fees")!="")
       s1.setFees(req.getParameter("fees"));
                                   if(req.getParameter("name")!="")
       s1.setName(req.getParameter("name"));
                                       if(req.getParameter("rank")!="")
       s1.setRank(req.getParameter("rank"));
                                           if(req.getParameter("password")!="")
       s1.setPassword(req.getParameter("password"));
       
       UpdateDAO d1=new UpdateDAO();
       d1.getUpdate(s1);
       resp.sendRedirect("Admin.jsp");
    }

   

}
