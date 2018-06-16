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
public class Data {
    public static void main(String[] arg) {
        
        MemberCard m1 = new MemberCard();

        
        m1.setMemberCard(123,"佐藤かなこ");
        m1.show();
    }
}

//クラス宣言
class MemberCard {
    //フィールド宣言
    public int num;
    public String name = "";

    //メソッド宣言①        
    public void setMemberCard(int x, String y) {
        this.num = x;
        this.name = y;
    }
    //メソッド宣言②
    public void show() {
        System.out.println("会員番号:" + num);
        System.out.println("会員氏名:" + name);
    }
}
