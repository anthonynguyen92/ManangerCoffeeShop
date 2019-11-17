/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import QuanLyNhanVien.NhanVien;
import java.sql.SQLException;
import java.util.ArrayList;
 
public class DAO {
    private  String DB_URL = "jdbc:sqlserver://DESKTOP-OGC62EG\\SAS:1433;"
                        + "databaseName=quanlycafe;";
    private static String USER_NAME = "sa";
    private static String PASSWORD = "123";
    private static Connection conn; 
    
    public static Connection ketNoi(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
<<<<<<< HEAD
            conn = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-OGC62EG\\SAS:1433;"
                        + "databaseName=quanlycafe;", USER_NAME,PASSWORD);
=======
            conn = DriverManager.getConnection("jdbc:sqlserver://ADMIN\\SQLEXPRESS03:1433;"
            + "databaseName=quanlycafe;", USER_NAME,PASSWORD);
>>>>>>> 6ee39a48a58289ea2f1e4b28911c9f72b024d7c0
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return conn;
    }
    
    // Doc Du lieu tu SQL Server
    public ArrayList <NhanVien> getListNhanVien(){
        ArrayList<NhanVien> list = new ArrayList<>();
        String sql = "SELECT ^ FROM dbo.NhanVien";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                NhanVien nv = new NhanVien();
                nv.setMaNV(rs.getInt("MaNv"));
                nv.setHoTen(rs.getString("HoTen"));
                nv.setGioiTinh(rs.getString("GioiTinh"));
                nv.setQueQuan(rs.getString("QueQuan"));
                nv.setNgaySinh(rs.getDate("NgaySinh"));
                nv.setNgayVaoLam(rs.getDate("NgayVaoLam"));
                nv.setBoPhan(rs.getString("BoPhan"));
                list.add(nv);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }
     /*public static void main(String[] args) throws SQLException{
        DAO connection=new DAO();
        connection.ketNoi();
        
        
        
        if(connection!=null){
            System.out.print("ket noi thanh cong");     
        }
        else{
            System.out.print("khong thanh cong"); 
        }
     }*/

   

    
}

