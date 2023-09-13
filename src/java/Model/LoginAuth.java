/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DAO.Admindao;
import DTO.UserDTO;

/**
 *
 * @author HP
 */
public class LoginAuth {
    
    
    public boolean isLogin(UserDTO user)
    {   
        Admindao d1= new Admindao();
        
        
        if(d1.isLogin(user))
         return true;
        return false;
        
            
}
}
