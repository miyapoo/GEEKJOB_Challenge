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




public class timestamp {
    public static void main(String[]args){
        
        Calendar c= Calendar.getInstance();
        c.set(2016,0,1,0,0,0);
        
        Date d=c.getTime();
        
        System.out.println(d.getTime());
       }
}

