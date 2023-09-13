/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DAO.ComplainDAO;
import DTO.ComplainDTO;
import javax.servlet.http.HttpSession;

/**
 *
 * @author HP
 */
public class ComplainRender {
    
    public void render(ComplainDTO user)
    {        
         ComplainDAO s1=new ComplainDAO();    
   
        s1.getset(user);
     
       
    
    
}

    }
