/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DB.DbConnector;
import DTO.StudentDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author HP
 */
public class AddDAO {
    
    
public  boolean addStudent(StudentDTO user)
{
    Statement st= DbConnector.getStatement();
     
             
            
             try{
String query = "INSERT INTO studentdata VALUES('"+user.getEnrollmentno()+"','"+user.getName()+"','"+user.getFathername()+"','"+user.getEmailid()+"','"+user.getContactno()+"','"
+user.getAddress()+"','"+user.getAttendance()+"','"+user.getFees()+"','"+user.getCgpa()+"','"+user.getRank()+"')";
                 
                 System.out.println(query);
                     
               boolean rs= st.execute(query);
                 System.out.println(rs);
                
                  String query2 =  "INSERT INTO logincred VALUES('"+user.getEnrollmentno()+"','"+user.getPassword()+"','student')";
                 boolean rs2= st.execute(query2);
                 
               return  rs&&rs2;
                 
                   
             }
             catch(SQLException e){
                  System.out.println("er");
                 System.out.println(e);
             }
return true;}
}
