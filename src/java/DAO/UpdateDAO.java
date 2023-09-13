/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DB.DbConnector;
import DTO.StudentDTO;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.http.HttpSession;

/**
 *
 * @author HP
 */
public class UpdateDAO {
    
    public StudentDTO  fetchSet(String id)
    {  
       StudentDTO d1=new StudentDTO();
     
       
       d1.setEnrollmentno(id);
       StudentDAO t1=new StudentDAO();
       t1.getSetData(d1);
       return d1;
    }
    public  boolean getUpdate(StudentDTO user)
            {
                 Statement st= DbConnector.getStatement();
                    try{
String query = "UPDATE studentdata SET name='"+user.getName()+"', fathername='"+user.getFathername()+"', emailid='"+user.getEmailid()+"', contactno='"+user.getContactno()+"', address='"
+user.getAddress()+"',attendance='"+user.getAttendance()+"',fees='"+user.getFees()+"',cgpa='"+user.getCgpa()+"',rank='"+user.getRank()+"' WHERE enrollmentno='"+user.getEnrollmentno()+"'";
                 
                 System.out.println(query);
                     
               boolean rs= st.execute(query);
                 System.out.println(rs);
                
                  String query2 =  "UPDATE logincred SET password='"+user.getPassword()+"' WHERE instituteid='"+user.getEnrollmentno()+"'";
                 boolean rs2= st.execute(query2);
           
                 
                   
             }
             catch(SQLException e){
                  System.out.println("er");
                 System.out.println(e);
             }
                
           return true; }
}

