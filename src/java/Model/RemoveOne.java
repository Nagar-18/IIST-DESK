/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DAO.RemoveDAO;
import DTO.RemoveDTO;
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
public class RemoveOne extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
         RemoveDTO t1= new RemoveDTO();
         HttpSession s=req.getSession(true);
         System.out.println(req.getParameter("id"));
              t1.setId(req.getParameter("id"));
              String r=(String)s.getAttribute("remove");
             t1.setRole(r);
              RemoveDAO d1= new  RemoveDAO();
      d1.remove(t1);
      resp.sendRedirect("Admin.jsp");
    }

  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    }

    
}
