/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DAO.UpdateFacultyDAO;
import DAO.UpdateHodDAO;
import DTO.HodDTO;
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
public class UpdateHod extends HttpServlet {

     public void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doDelete(req, resp); //To change body of generated methods, choose Tools | Templates.
    }

 public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session =req.getSession(true);
     HodDTO s1 = ( HodDTO)session.getAttribute("updateuser");
       if(req.getParameter("address")!="")
       s1.setAddress(req.getParameter("address"));
           if(req.getParameter("post")!="")
       s1.setPost(req.getParameter("post"));
               if(req.getParameter("ctc")!="")
       s1.setCtc(req.getParameter("ctc"));
                   if(req.getParameter("contact")!="")
       s1.setContactno(req.getParameter("contact"));
                       if(req.getParameter("emailid")!="")
       s1.setEmailid(req.getParameter("emailid"));
                           if(req.getParameter("fathername")!="")

       s1.setFathername(req.getParameter("fathername"));
                               if(req.getParameter("specilization")!="")
       s1.setSpecilization(req.getParameter("specilization"));
                                   if(req.getParameter("name")!="")
       s1.setName(req.getParameter("name"));
                                       if(req.getParameter("rank")!="")
       s1.setRank(req.getParameter("rank"));
                                           if(req.getParameter("password")!="")
       s1.setPassword(req.getParameter("password"));
                                             if(req.getParameter("allotedclass")!="")
       s1.setAllotedclass(req.getParameter("allotedclass"));
       
       UpdateHodDAO d1=new UpdateHodDAO();
       d1.getUpdate(s1);
       resp.sendRedirect("Admin.jsp");
    }

   

}
