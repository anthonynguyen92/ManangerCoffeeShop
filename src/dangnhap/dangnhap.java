/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dangnhap;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class dangnhap {
    private String user;
    private String passWord;
    Scanner sc= new Scanner(System.in);
<<<<<<< HEAD
   
    public String codeDangNhap() throws SQLException, ClassNotFoundException{
=======
<<<<<<< HEAD
   
    public String codeDangNhap() throws SQLException, ClassNotFoundException{
=======
    public int codeDangNhap(){
        return 0;
    }
    public int codeDangNhap(String user, String passWord) throws SQLException, ClassNotFoundException{
>>>>>>> 6ee39a48a58289ea2f1e4b28911c9f72b024d7c0
>>>>>>> d5106294992485f0ae5360b5f928989a4ada8548
        System.out.println("Nhập user:");
        setUser(sc.nextLine());
        System.out.println("Nhập PassWord:");
        setPassWord(sc.nextLine());
<<<<<<< HEAD
         
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String url= "jdbc:sqlserver://DESKTOP-OGC62EG\\SAS:1433;"
            + "databaseName=quanlycafe;user=sa;password=123";
                Connection conn = DriverManager.getConnection(url);
                String sql = "SELECT * FROM Login where username=? and password=?";
            try{
=======
<<<<<<< HEAD
         
         
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String url= "jdbc:sqlserver://DESKTOP-OGC62EG\\SAS:1433;"
                        + "databaseName=quanlycafe;user=sa;password=123";
                Connection conn = DriverManager.getConnection(url);
                String sql = "SELECT * FROM Login where username=? and password=?";
            try{
                
=======
         try{
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String url= "jdbc:sqlserver://ADMIN\\SQLEXPRESS03:1433;"
             + "databaseName=QuanLyCaFe;user=sa;password=123";
                Connection conn = DriverManager.getConnection(url);
                String sql = "SELECT * FROM Login where username=? and password=?";
>>>>>>> 6ee39a48a58289ea2f1e4b28911c9f72b024d7c0
>>>>>>> d5106294992485f0ae5360b5f928989a4ada8548
                PreparedStatement pst= conn.prepareStatement(sql);
                pst.setString(1, this.getUser());
                pst.setString(2, this.getPassWord());
                ResultSet rs=pst.executeQuery();
                if(rs.next()){
<<<<<<< HEAD
                 MenuChinh mn= new MenuChinh();
                 //System.out.print("thanh cong");
                 mn.taaa();
                }else{
                     System.out.print("Đăng nhập thất bại!");
=======
<<<<<<< HEAD
                    MenuChinh mn= new MenuChinh();
                    //System.out.print("thanh cong");
                    mn.taaa();
                }else{
                   
                    System.out.print("Đăng nhập thất bại!");
                    
=======
                 MenuChinh mn= new MenuChinh();
                 mn.taaa();
                }else{
                     System.out.print("Đăng nhập thất bại!");
>>>>>>> 6ee39a48a58289ea2f1e4b28911c9f72b024d7c0
>>>>>>> d5106294992485f0ae5360b5f928989a4ada8548
                }
                
            
        }catch(Exception e){
<<<<<<< HEAD
             //System.out.print("Kết nối Thất Bại!");
        }
        return sql;
=======
<<<<<<< HEAD
             //System.out.print("Kết nối Thất Bại!");
        }
         
        return sql;
         
         
=======
             System.out.print("Kết nối Thất Bại!");
        }
        return 0;
>>>>>>> 6ee39a48a58289ea2f1e4b28911c9f72b024d7c0
>>>>>>> d5106294992485f0ae5360b5f928989a4ada8548

  
}
    public static void main(String[] arg) throws SQLException, ClassNotFoundException{
        dangnhap dn= new dangnhap();
        dn.codeDangNhap();
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the passWord
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * @param passWord the passWord to set
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    
    
       
}
