/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

import java.util.ArrayList;

/**
 *
 * @author miyuki
 */
//抽象クラス
public abstract class Human {
    
//フィールド
        protected ArrayList<Integer> myCards = new ArrayList<>();
        
        
        //抽象メソッド
        abstract public int open();
        abstract public void setCard(ArrayList<Integer> a);
        abstract public boolean checkSum();
        
   }
    

