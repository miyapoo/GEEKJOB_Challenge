/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jums;

/**
 *
 * @author miyuki
 */

import java.io.Serializable;

//フォームから受け取ったデータ自体を格納できるJavaBeans(UserDataBeans.java)を作成
    public class UserDataBeans implements Serializable{
        
//各フォームの値を変数に格納
        private String name=""; 
        private String year="";
        private String month="";
        private String day="";
        private String type="";
        private String tell="";
        private String comment="";
//メソッド    
    public UserDataBeans(){}

    public String getname(){
        return this.name;
        }
    public void setname(String n){
        this.name=n;
    }
    public String getyear(){
        return this.year;
    }
    
    public void setyear(String y){
        this.year=y;
    }
    
    public String getmonth(){
        return this.month;
    }
    public void setmonth(String m){
        this.month=m;
    }
    public String getday(){
        return this.day;
    }
    public void setday(String d){
        this.day=d;
    }
    
    public String gettype(){
        return this.type;
    }
    
    public void settype(String ty){
        this.type=ty;
    }
    
    public String gettell(){
        return this.tell;
    }
    public void settell(String t){
        this.tell=t;
    }
    
    public String getcomment(){
        return this.comment;
    }
    
    public void setcomment(String c){
        this.comment=c;
    }    
}
