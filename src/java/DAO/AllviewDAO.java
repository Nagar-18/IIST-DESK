/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DB.DbConnector;
import DTO.AllviewDTO;
import DTO.StudentDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

/**
 *
 * @author HP
 */
public class AllviewDAO {
    
    public void getset(AllviewDTO user)
    {
     Statement st= DbConnector.getStatement();
    
      
       try{
        
            String query= "SELECT * FROM studentdata";
              System.out.println(query);
              ResultSet rs= st.executeQuery(query);
                Vector<StudentDTO>arr=new Vector<StudentDTO>();
              while(rs.next())
              {
                 StudentDTO s1= new StudentDTO();
                // set in studentdto
                
                s1.setName(rs.getString(2));
              s1.setFathername(rs.getString(3));
              s1.setEmailid(rs.getString(4));
              s1.setContactno(rs.getString(5));
              s1.setAddress(rs.getString(6));
              s1. setAttendance(rs.getString(7));
              s1.setFees(rs.getString(8));
              s1.setCgpa(rs.getString(9));
              s1.setRank(rs.getString(10));
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

