/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

import java.io.*;
import java.util.Date;

/**
 *
 * @author miyuki
 */


public class classkadai {
    public static void main(String[]args){
        

         try{
            File f=new File("class.log");
            FileWriter fw=new FileWriter(f);
            fw.write("①処理内容：Mathクラスの累乗計算");
            System.out.println("①処理内容：Mathクラスの累乗計算");
            
            Date d = new Date();
            fw.write("②処理開始:"+d);
            System.out.println("②処理開始:"+d);
            
            
            double d1=2.0;
            double d2=3.0;
            double d3=-4.0;
            double d4=5.0;
            fw.write("[1]2の3乗="+Math.pow(d1,d2));
            System.out.println("[1]2の3乗="+Math.pow(d1,d2));
            fw.write("[2]3の5乗="+Math.pow(d2,d4));
            System.out.println("[2]3の5乗="+Math.pow(d2,d4));
            fw.write("[3]-4の3乗="+Math.pow(d3,d2));
            System.out.println("[3]-4の3乗="+Math.pow(d3,d2));
        
            
            fw.write("③処理終了:"+d);
            System.out.println("③処理開始:"+d);
            
            fw.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    
}
}
   
        
    
    
    

