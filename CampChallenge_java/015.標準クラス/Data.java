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
import java.util.Date;
import java.text.SimpleDateFormat;


public class Data {
    public static void main(String[]args){
        Date d=new Date();
        
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒");
        String dateString=sdf.format(d);
        System.out.println(dateString);
        
        }
}
