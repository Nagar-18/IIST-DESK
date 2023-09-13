/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DB.DbConnector;
import DTO.FacultyDTO;

import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author HP
 */
public class AddFacultyDAO {
    
    public  boolean addFaculty(FacultyDTO user)
{
    Statement st= DbConnector.getStatement();
     
             
            
             try{
String query = "INSERT INTO hoddata VALUES('"+user.getInstituteid()+"','"+user.getName()+"','"+user.getFathername()+"','"+user.getEmailid()+"','"+user.getContactno()+"','"
+user.getAddress()+"','"+user.getPost()+"','"+user.getSpecilization()+"','"+user.getCtc()+"','"+user.getAllotedclass()+"','"+user.getRank()+"')";
                 
                 System.out.println(query);
                     
               boolean rs= st.execute(query);
                 System.out.println(rs);
                
                  String query2 =  "INSERT INTO logincred VALUES('"+user.getInstituteid()+"','"+user.getPassword()+"','faculty')";
                 boolean rs2= st.execute(query2);
                 
               return  rs&&rs2;
                 
                   
             }
             catch(SQLException e){
                  System.out.println("er");
                 System.out.println(e);
             }
return true;}
}
