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

//Userクラス
public class User extends Human {
    
    //ArrayListで受けたカード情報をmyCardsに追加
       public void setCard(ArrayList<Integer> a){
           
             for(int i=0; i<a.size(); i++){
               myCards.add(a.get(i));
           }
       }
      
//myCardsを確認して、まだカードが必要ならtrue、不必要ならfalseを返却
       public boolean checkSum(){
           int num=open();
//           for(int i=0; i<myCards.size(); i++){
//               num+=myCards.get(i);
//           }
           if(num<17){
               
               return true;
       }
           else{
               
               return false;
           }
           

       }
       

//myCardsのカードの合計値を返却する       
       public int open(){
           int num=0;
           for(int i=0; i<myCards.size(); i++){
               num+=myCards.get(i);
           }
                return num;
       }
}

    







    

