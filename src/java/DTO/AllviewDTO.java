/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Vector;

/**
 *
 * @author HP
 */
public class AllviewDTO {
    
    
  Vector<StudentDTO>arr=new Vector<StudentDTO>();
  Vector<FacultyDTO>farr=new Vector<FacultyDTO>();
   Vector<HodDTO>harr=new Vector<HodDTO>();


    public Vector<FacultyDTO> getFarr() {
        return farr;
    }

    public void setFarr(Vector<FacultyDTO> farr) {
        this.farr = farr;
    }

    public Vector<HodDTO> getHarr() {
        return harr;
    }

    public void setHarr(Vector<HodDTO> harr) {
        this.harr = harr;
    }

  

    public Vector<StudentDTO> getArr() {
        return arr;
    }

    public void setArr(Vector<StudentDTO> arr) {
        this.arr = arr;
    }

     


   
    
}
