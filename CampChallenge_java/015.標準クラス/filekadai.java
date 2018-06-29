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
import java.io.*;

public class filekadai {
    public static void main(String[]args){
       try{ 
           File f=new File("myIntroduce.txt");
           FileWriter fw=new FileWriter(f);
           fw.write("私の名前は、三宅未有紀です。1994/12/30生まれの、現在23才です。趣味は、音楽と映画とディズニーです！よろしくお願いします。");

           fw.close();
    }
       catch(IOException e){
        e.printStackTrace();
    }
    }
}
