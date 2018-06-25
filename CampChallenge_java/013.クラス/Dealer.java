/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author miyuki
 */

 // Dealerクラス 
public class Dealer extends Human {
    
//フィールド追加(山札デッキ)　　整数で表現するためarraylist<integer>     
      protected ArrayList<Integer> cards = new ArrayList<>();
      
//追加メソッド①　山札に全てのカード(13*4=52)を追加
       public Dealer(){          
//4回繰り返す　for文の中にfor文を書く
           for(int i=0; i<4; i++){
//カード  
                for(int j=1; j<=13; j++){
                   cards.add(j);//cardsにすべてのカードを追加
               }
            }
       }
       
//追加メソッド②　山札からランダムに2枚引き、引いたカードを戻り値とする
       public ArrayList<Integer> deal(){
//戻り値用の変数x           
           ArrayList<Integer>x=new ArrayList<>();
//乱数クラス生成
           Random rand = new Random();
//ランダムに2枚引く
        for(int i=0; i<2; i++){
//乱数取得(cards.size()の初期値52)
        Integer index= rand.nextInt(cards.size());
        x.add(cards.get(index));
//山札から2枚削除
        cards.remove(index);
        }
//戻り値           
           return x;
}
//追加メソッド③　山札からランダムに1枚引き、引いたカードを戻り値とする
       public ArrayList<Integer> hit(){
//戻り値用変数y           
           ArrayList<Integer>y=new ArrayList<>();
//乱数クラス生成           
           Random rand = new Random();
//山札からランダムに1枚引く

            for(int i=0; i<1; i++){
//乱数取得               
           Integer index= rand.nextInt(cards.size());
           y.add(cards.get(index));
//山札から1枚削除
           cards.remove(index);
            }
//戻り値          
           return y;
        }

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
