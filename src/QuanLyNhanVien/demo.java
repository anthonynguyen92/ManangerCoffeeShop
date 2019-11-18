/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyNhanVien;

import controller.DAO;
import dangnhap.MenuChinh;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class demo {
        Connection conn= null;
        private PreparedStatement ptmt = null;
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
<<<<<<< HEAD
            + "databaseName=quanlycafe;";
=======
                        + "databaseName=quanlycafe;user=sa;password=123";
>>>>>>> d5106294992485f0ae5360b5f928989a4ada8548
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
                // mn.taaa();
                }else{
                     System.out.print("Đăng nhập thất bại!");
                }
            
            
        }catch(Exception e){
             //System.out.print("Kết nối Thất Bại!");
        }
        return sql;
        }
  
public String testthemNhanVien(){
        DAO t = new DAO();
        conn = t.ketNoi();
<<<<<<< HEAD
        String sql = "INSERT INTO dbo.NhanVien(MaNV,HoTen,GioiTinh,QueQuan,NgaySinh,NgayVaoLam) VALUES(2,'an','nam','dl','12/12/2012','01/12/2011');";
=======
        String sql = "INSERT INTO dbo.NhanVien(MaNV,HoTen,GioiTinh,QueQuan,NgaySinh,NgayVaoLam) VALUES(3,'an','nam','dl','12/12/2012','01/12/2011');";
>>>>>>> d5106294992485f0ae5360b5f928989a4ada8548
        try {
            ptmt = conn.prepareStatement(sql);
            //ptmt.executeUpdate(sql);
            int k = ptmt.executeUpdate();  
            
        } catch (Exception e) {
            e.printStackTrace();
        }
       return sql;
        
    }
public String xoaNhanVIen() {
        DAO t = new DAO();
        conn = t.ketNoi();
        //System.out.print("Mã NV: ");
       // this.maNV=scanner.nextInt();
        String sql = "DELETE FROM NhanVien where MaNv =2";
        try {
             ptmt = conn.prepareStatement(sql);
            // ptmt.setInt(1, this.getMaNV());
            int k = ptmt.executeUpdate();
            ptmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sql;
        
    }
public String capNhatNhanVien() throws ParseException{
         DAO t = new DAO();
        conn = t.ketNoi();
        String ngaySinhTam;
        String ngayVaoLamTam;
       

<<<<<<< HEAD
        String sql ="UPDATE NhanVien set HoTen ='linh' , GioiTinh = 'nu', QueQuan ='hcm' "  + " where MaNv =2" ; /*"update NhanVien set QueQuan = '"+this.getQueQuan()+"';"
=======
        String sql ="UPDATE NhanVien set HoTen = 'Nam' , GioiTinh = 'nam', QueQuan ='dl' "  + " where MaNv =1" ; /*"update NhanVien set QueQuan = '"+this.getQueQuan()+"';"
>>>>>>> d5106294992485f0ae5360b5f928989a4ada8548
                + "HoTen = '"+this.getHoTen()+"';"
                + "GioiTinh = '"+this.getGioiTinh()+"' where MaNv ='"+this.getMaNV()+"'";*/
        try {
            ptmt = conn.prepareStatement(sql);   
           
            int k = ptmt.executeUpdate();
           
            ptmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
       return sql;
}
public static void main(String[] arg) throws SQLException, ClassNotFoundException{
     demo dm=new demo();
     dm.testthemNhanVien();
    // dm.codeDangNhap();
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
