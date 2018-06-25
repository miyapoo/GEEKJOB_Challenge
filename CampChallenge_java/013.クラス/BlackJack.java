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



//実行クラス
public class BlackJack {
    
    public static void main(String[]arg){
//インスタンス化 UserとDealerを用意する
        User u1=new User();        
        Dealer d1=new Dealer();
        
//カードを2枚セット
        d1.setCard(d1.deal());
        u1.setCard(d1.deal());
        
        System.out.println("Dealer"+d1.myCards);
        System.out.println("User"+u1.myCards);


//17より少なければカードを1枚引く
        if(d1.checkSum()){
            d1.setCard(d1.hit());
        }
        if(u1.checkSum()){
            u1.setCard(d1.hit());
        }
        
        System.out.println("Dealer"+d1.myCards);
        System.out.println("User"+u1.myCards);
        

//手持ちのカードの最終合計値を表示
        System.out.println("Dealerの合計は"+d1.open());
        System.out.println("Userの合計は"+u1.open());
        
        
//最終結果 条件分岐
       if (d1.open()>21&&u1.open()<22) {
        System.out.println("Userの勝ち");
        }   
       else if (d1.open()<22&&u1.open()>21) {
        System.out.println("Dealerの勝ち");
        }
       else if (d1.open()>u1.open()) {
        System.out.println("Dealerの勝ち");
        }
       else if (d1.open()<u1.open()) {
        System.out.println("Userの勝ち");
        }
       else if (d1.open()==u1.open()) {
        System.out.println("引き分け");
       }

    }
}
    
    



    
        
    


   

   

       
       

    


