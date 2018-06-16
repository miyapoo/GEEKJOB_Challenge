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
public class Newclass {
    public static void main(String[] arg){
//インスタンス化
    BlackCard b1= new BlackCard();
   
    b1.setMemberCard(6,"椎名");
    b1.show();
    b1.setBlackCard();
    b1.show();
    }
}
//クラスの継承
class BlackCard extends MemberCard{
    //フィールドは親クラスのみ
    //int num会員番号, String name会員氏名
    
//メソッド宣言
    public void setBlackCard(){
        this.num=0;
        this. name="";
    }
    
 }
