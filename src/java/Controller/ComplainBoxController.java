/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.ComplainDAO;
import DTO.BoxDTO;
import DTO.ComplainDTO;
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
public class ComplainBoxController extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("id");
        String box =req.getParameter("box");
        
        BoxDTO b1= new BoxDTO();
        b1.setId(id);
        b1.setBox(box);
        
         ComplainDAO s1=new ComplainDAO();
         s1.add(b1);
         
        if(id.equalsIgnoreCase("student"))
            resp.sendRedirect("student.jsp");
        
        else if(id.equalsIgnoreCase("faculty"))
                        resp.sendRedirect("faculty.jsp");
        else
                        resp.sendRedirect("hod.jsp");
        
        

        
    }

public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
    }


}
