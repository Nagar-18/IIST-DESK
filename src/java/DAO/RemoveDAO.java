/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DB.DbConnector;
import DTO.RemoveDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author HP
 */
public class RemoveDAO {
   
    public boolean remove(RemoveDTO s1)
    {
        String role=s1.getRole();
        String id=s1.getId();
        System.out.println(role+id);
        
        
        
    Statement st= DbConnector.getStatement();
    
          if(role.equalsIgnoreCase("hod") || role.equalsIgnoreCase("faculty"))
          {
              
              
                
       
        try{
           
            String query= "DELETE  FROM hoddata WHERE instituteid='"+id+"'";
              System.out.println(query);
              int rs= st.executeUpdate(query);
        

         }
              
              
    
          catch(SQLException e){
                  System.out.println("er");
                 System.out.println(e);
             }
              
              
              
          }   
          else if(role.equalsIgnoreCase("student"))
          {
                   try{
           
            String query= "DELETE  FROM studentdata WHERE enrollmentno='"+id+"'";
              System.out.println(query);
              int rs= st.executeUpdate(query);
        

         }
              
              
    
          catch(SQLException e){
                  System.out.println("er");
                 System.out.println(e);
             }
              
          }     
    return true;
    }
    
}
