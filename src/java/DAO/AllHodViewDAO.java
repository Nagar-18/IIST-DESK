/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DB.DbConnector;
import DTO.AllviewDTO;
import DTO.FacultyDTO;
import DTO.HodDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

/**
 *
 * @author HP
 */
public class AllHodViewDAO {
    
        public void getset(AllviewDTO user)
    {
     Statement st= DbConnector.getStatement();
    
      
       try{
        
            String query= "SELECT * FROM hoddata where post='hod'";
              System.out.println(query);
              ResultSet rs= st.executeQuery(query);
                Vector<HodDTO>arr=new Vector<HodDTO>();
              while(rs.next())
              {
               HodDTO s1= new  HodDTO();
                // set in studentdto
                
                s1.setName(rs.getString(2));
              s1.setFathername(rs.getString(3));
              s1.setEmailid(rs.getString(4));
              s1.setContactno(rs.getString(5));
              s1.setAddress(rs.getString(6));
              s1.setPost(rs.getString(7));
              s1.setSpecilization(rs.getString(8));
              s1.setCtc(rs.getString(9));
                s1.setAllotedclass(rs.getString(10));
              s1.setRank(rs.getString(11));
               arr.add(s1);
              }
                user.setHarr(arr); 
              
       }
     catch(SQLException e){
                  System.out.println("er");
                 System.out.println(e);
             }

        

}
}
