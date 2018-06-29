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

public class filekadai2 {
    public static void main(String[]args){
        try{
            File f=new File("myIntroduce.txt");
            FileReader fr=new FileReader(f);
            BufferedReader br=new BufferedReader(fr);
            System.out.println(br.readLine());
            fr.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
