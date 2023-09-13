/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DB.DbConnector;
import DTO.UserDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author HP
 */
public class Admindao {
     public boolean isLogin(UserDTO user)
    {
        
        Statement st= DbConnector.getStatement();
        String id= user.getId();
                String password= user.getPassword();
                
                
                
             String tablePass="";
             
            
             try{
                 String query = "SELECT password FROM logincred WHERE instituteid='"+id+"'";
                 
                 System.out.println(query);
                     
                 ResultSet rs= st.executeQuery(query);
                 System.out.println(rs);
                 if(rs.next())
                 {
                     tablePass=rs.getString(1);
                       System.out.println(tablePass);
                 }
                 else
                 {
                     System.out.println("er");
                     return false;
                 }
                  String query2 = "SELECT role FROM logincred WHERE instituteid='"+id+"'";
                  ResultSet rs2= st.executeQuery(query2);
                  if(rs2.next())
                  {
                   
                   String role=rs2.getString(1);
                   user.setRole(role);
                  }
                   
             }
             catch(SQLException e){
                  System.out.println("er");
                 System.out.println(e);
             }
             System.out.println(tablePass);
return (id!=null && password!=null && !id.trim().equals("") && password.equals(tablePass));




        
    }
    
    
    
    

}
