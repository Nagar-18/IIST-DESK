/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DB.DbConnector;
import DTO.FacultyDTO;
import DTO.StudentDTO;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author HP
 */
public class UpdateFacultyDAO {
    
     public FacultyDTO  fetchSet(String id)
    {  
      FacultyDTO d1=new FacultyDTO();
     
       
       d1.setInstituteid(id);
       FacultyDAO t1=new FacultyDAO();
       t1.getSetData(d1);
       return d1;
    }
     
      public  boolean getUpdate(FacultyDTO user)
            {
                 Statement st= DbConnector.getStatement();
                    try{
String query = "UPDATE hoddata SET name='"+user.getName()+"', fathername='"+user.getFathername()+"', emailid='"+user.getEmailid()+"', contactno='"+user.getContactno()+"', address='"
+user.getAddress()+"',post='"+user.getPost()+"',specilization='"+user.getSpecilization()+"',ctc='"+user.getCtc()+"',allotedclass='"+user.getAllotedclass()+"',rank='"+user.getRank()+"' WHERE instituteid='"+user.getInstituteid()+"'";
                 
                 System.out.println(query);
                     
               boolean rs= st.execute(query);
                 System.out.println(rs);
                
                  String query2 =  "UPDATE logincred SET password='"+user.getPassword()+"' WHERE instituteid='"+user.getInstituteid()+"'";
                 boolean rs2= st.execute(query2);
           
                 
                   
             }
             catch(SQLException e){
                  System.out.println("er");
                 System.out.println(e);
             }
                
           return true; }
}
