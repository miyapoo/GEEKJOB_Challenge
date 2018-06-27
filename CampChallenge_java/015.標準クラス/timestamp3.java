/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

/**
 *
 * @author miyuki
 */
import java.util.Calendar;
import java.util.Date;


public class timestamp3 {
    public static void main(String[]args){
        Calendar c=Calendar.getInstance();
        c.set(2015,0,1,0,0,0);
        Calendar c1=Calendar.getInstance();
        c1.set(2015,11,31,23,59,59);
        
        Date d=c.getTime();
        Date d1=c1.getTime();
        
        System.out.println(d1.getTime()-d.getTime());
        
    }
    
}
