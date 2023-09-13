/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DB.DbConnector;
import DTO.HodDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author HP
 */
public class HodDAO {
    public void getSetData(HodDTO user)
    {
                Statement st= DbConnector.getStatement();
        String id= user.getInstituteid();
        try{
           
            String query= "SELECT * FROM hoddata WHERE instituteid='"+id+"' AND post='hod'  ";
              System.out.println(query);
              ResultSet rs= st.executeQuery(query);
         if(rs.next())
         {
              user.setName(rs.getString(2));
              user.setFathername(rs.getString(3));
              user.setEmailid(rs.getString(4));
              user.setContactno(rs.getString(5));
              user.setAddress(rs.getString(6));
              user. setPost(rs.getString(7));
              user.setSpecilization(rs.getString(8));
              user.setCtc(rs.getString(9));
              user.setAllotedclass(rs.getString(10));
          user.setRank(rs.getString(11));

         }
              
               String query2= "SELECT password FROM logincred WHERE instituteid='"+id+"'";
              
              ResultSet rs2= st.executeQuery(query2);
                                     if(rs2.next())
                  user.setPassword(rs2.getString(1));
               
    }
          catch(SQLException e){
                  System.out.println("er");
                 System.out.println(e);
             }
}
}
