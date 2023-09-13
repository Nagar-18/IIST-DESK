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
public class ComplainDTO {
      Vector<BoxDTO>arr=new Vector<BoxDTO>();

    public Vector<BoxDTO> getArr() {
        return arr;
    }

    public void setArr(Vector<BoxDTO> arr) {
        this.arr = arr;
    }
      
}
