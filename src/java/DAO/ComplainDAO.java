/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DB.DbConnector;
import DTO.AllviewDTO;
import DTO.BoxDTO;
import DTO.ComplainDTO;
import DTO.FacultyDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

/**
 *
 * @author HP
 */
public class ComplainDAO {
    
    public void add(BoxDTO user)
    {
        Statement st= DbConnector.getStatement();
         try{
        
            String query= "INSERT INTO complainbox VALUES('"+user.getId()+"','"+user.getBox()+"')";
              System.out.println(query);
             int rs=st.executeUpdate(query);
       }
     catch(SQLException e){
                  System.out.println("er");
                 System.out.println(e);
             }

        
    }
            
            public void getset(ComplainDTO user)
    {
     Statement st= DbConnector.getStatement();
    
    try{
        
            String query= "SELECT * FROM complainbox";
              System.out.println(query);
              ResultSet rs= st.executeQuery(query);
                Vector<BoxDTO>arr=new Vector<BoxDTO>();
              while(rs.next())
              {
               BoxDTO s1= new  BoxDTO();
                // set in studentdto
                
                s1.setId(rs.getString(1));
                s1.setBox(rs.getString(2));
               arr.add(s1);
              }
                user.setArr(arr); 
              
       }
     catch(SQLException e){
                  System.out.println("er");
                 System.out.println(e);
             }

}
}
