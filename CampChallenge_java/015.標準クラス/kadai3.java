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
public class kadai3 {
    public static void main(String[]args){
        String words="きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます";
        String w1=words.replace("I","い");
        String w2=w1.replace("U","う");
        System.out.println(w2);
    }
}
