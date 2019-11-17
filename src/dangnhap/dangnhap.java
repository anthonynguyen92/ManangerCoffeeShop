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
   
    public String codeDangNhap() throws SQLException, ClassNotFoundException{
        System.out.println("Nhập user:");
        setUser(sc.nextLine());
        System.out.println("Nhập PassWord:");
        setPassWord(sc.nextLine());
         
         
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String url= "jdbc:sqlserver://DESKTOP-OGC62EG\\SAS:1433;"
                        + "databaseName=quanlycafe;user=sa;password=123";
                Connection conn = DriverManager.getConnection(url);
                String sql = "SELECT * FROM Login where username=? and password=?";
            try{
                
                PreparedStatement pst= conn.prepareStatement(sql);
                pst.setString(1, this.getUser());
                pst.setString(2, this.getPassWord());
                ResultSet rs=pst.executeQuery();
                if(rs.next()){
                    MenuChinh mn= new MenuChinh();
                    //System.out.print("thanh cong");
                    mn.taaa();
                }else{
                   
                    System.out.print("Đăng nhập thất bại!");
                    
                }
                
            
        }catch(Exception e){
             //System.out.print("Kết nối Thất Bại!");
        }
         
        return sql;
         
         

  
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
