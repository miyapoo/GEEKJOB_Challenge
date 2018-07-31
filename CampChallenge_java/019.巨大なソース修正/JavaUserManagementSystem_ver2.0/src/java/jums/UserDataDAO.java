package jums;

import base.DBManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * ユーザー情報を格納するテーブルに対しての操作処理を包括する
 * DB接続系はDBManagerクラスに一任
 * 基本的にはやりたい1種類の動作に対して1メソッド
 * @author hayashi-s
 */
public class UserDataDAO {
    
    //インスタンスオブジェクトを返却させてコードの簡略化
    public static UserDataDAO getInstance(){
        return new UserDataDAO();
    }
    
    /**
     * データの挿入処理を行う。現在時刻は挿入直前に生成
     * @param ud 対応したデータを保持しているJavaBeans
     * @throws SQLException 呼び出し元にcatchさせるためにスロー 
     */
    public void insert(UserDataDTO ud) throws SQLException{
        Connection con = null;
        PreparedStatement st = null;
        try{
            con = DBManager.getConnection();
            st =  con.prepareStatement("INSERT INTO user_t(name,birthday,tell,type,comment,newDate) VALUES(?,?,?,?,?,?)");
            st.setString(1, ud.getName());
            st.setDate(2, new java.sql.Date(ud.getBirthday().getTime()));//指定のタイムスタンプ値からSQL格納用のDATE型に変更
            st.setString(3, ud.getTell());
            st.setInt(4, ud.getType());
            st.setString(5, ud.getComment());
            st.setTimestamp(6, new Timestamp(System.currentTimeMillis()));
            st.executeUpdate();
            System.out.println("insert completed");
        }catch(SQLException e){
            System.out.println(e.getMessage());
            throw new SQLException(e);
        }finally{
            //DB削除
            if(con != null){
                con.close();
            }
        }

    }
    
    /**
     * データの検索処理を行う。
     * @param ud 対応したデータを保持しているJavaBeans
     * @throws SQLException 呼び出し元にcatchさせるためにスロー 
     * @return 検索結果
     */
    public ArrayList<UserDataDTO> search(UserDataDTO ud) throws SQLException{
        Connection con = null;
        PreparedStatement st = null;
        try{
            ArrayList<UserDataDTO>resultList=new ArrayList<UserDataDTO>();
            con = DBManager.getConnection();
            
            //
            String sql = "SELECT * FROM user_t";
            boolean flag = false;
            
            boolean flName=false;
            boolean flBirthday=false;
            boolean flType=false;
            
            if (!ud.getName().equals("")) {
                sql += " WHERE name like ?";
                flag = true;
                flName=true;
            }
            if (ud.getBirthday()!=null) {
                if(!flag){
                    sql += " WHERE birthday like ?";
                    flag = true;
                }else{
                    sql += " AND birthday like ?";
                }
                flBirthday=true;
            }
            if (ud.getType()!=0) {
                if(!flag){
                    sql += " WHERE type like ?";
                }else{
                    sql += " AND type like ?";
                }
                flType=true;
            }
            
            st =  con.prepareStatement(sql);
            
            int i=1;
            if(flag){
                if(flName){
              st.setString(i, "%"+ud.getName()+"%");
              i++;
            }
            if(flBirthday){
               st.setString(i,"%"+new SimpleDateFormat("yyyy").format(ud.getBirthday())+"%"); 
               i++;
            }
            if(flType){
               st.setInt(i,ud.getType()); 
            }
            }
            ResultSet rs=st.executeQuery();
            
            while(rs.next()){
                UserDataDTO resultUd = new UserDataDTO();
                resultUd.setUserID(rs.getInt(1));
                resultUd.setName(rs.getString(2));
                resultUd.setBirthday(rs.getDate(3));
                resultUd.setTell(rs.getString(4));
                resultUd.setType(rs.getInt(5));
                resultUd.setComment(rs.getString(6));
                resultUd.setNewDate(rs.getTimestamp(7));
            
            resultList.add(resultUd);
            }
            System.out.println("search completed");

            return resultList;
        
        }catch(SQLException e){
            System.out.println(e.getMessage());
            throw new SQLException(e);
        }finally{
            if(con != null){
                con.close();
            }
        }

    }
    
    /**
     * ユーザーIDによる1件のデータの検索処理を行う。
     * @param ud 対応したデータを保持しているJavaBeans
     * @throws SQLException 呼び出し元にcatchさせるためにスロー 
     * @return 検索結果
     */
    public UserDataDTO searchByID(UserDataDTO ud) throws SQLException{
        Connection con = null;
        PreparedStatement st = null;
        try{
            con = DBManager.getConnection();
            
            String sql = "SELECT * FROM user_t WHERE userID = ?";
            
            st =  con.prepareStatement(sql);
            st.setInt(1, ud.getUserID());
            
            ResultSet rs = st.executeQuery();
            rs.next();
            UserDataDTO resultUd = new UserDataDTO();
            resultUd.setUserID(rs.getInt(1));
            resultUd.setName(rs.getString(2));
            resultUd.setBirthday(rs.getDate(3));
            resultUd.setTell(rs.getString(4));
            resultUd.setType(rs.getInt(5));
            resultUd.setComment(rs.getString(6));
            resultUd.setNewDate(rs.getTimestamp(7));
            
            System.out.println("searchByID completed");

            return resultUd;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            throw new SQLException(e);
        }finally{
            if(con != null){
                con.close();
            }
        }

    }
    
    //〇更新処理用メソッドUpdateResult

    public void update(UserDataDTO ud) throws SQLException {
            Connection con = null;
            PreparedStatement st = null;
        try {
            //DB接続
                con = DBManager.getConnection();
            //更新用SQL文に各情報をDTOから格納
            st = con.prepareStatement("update user_t set name=?,birthday=?,tell=?,type=?,comment=?,newDate=? where userID=?");
            st.setString(1, ud.getName());
            st.setDate(2, new java.sql.Date(ud.getBirthday().getTime()));   //Date型に変換
            st.setString(3, ud.getTell());
            st.setInt(4, ud.getType());
            st.setString(5, ud.getComment());
            st.setTimestamp(6,new Timestamp(System.currentTimeMillis()));
            st.setInt(7, ud.getUserID());
            st.executeUpdate();
                System.out.print("update completed");

        } catch (SQLException e) {
                System.out.print(e.getMessage());
                throw new SQLException(e);
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }
    
    public void delete(int id) throws SQLException{
        Connection con=null;
        PreparedStatement st=null;
        
        try{
            con=DBManager.getConnection();
            
            st=con.prepareStatement("delete from user_t where userID=?;");
            
            st.setInt(1,id);
            st.executeUpdate();
            
            System.out.print("delete completed");
        }catch(SQLException e){
            System.out.println(e.getMessage());
            throw new SQLException(e);
        }finally{
            if(con!=null){
                con.close();
            }
        }
    }
    
}
