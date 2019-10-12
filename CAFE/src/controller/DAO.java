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
import java.util.ArrayList;
 
public class DAO {
    private  String DB_URL = "jdbc:sqlserver://localhost:1433;"
            + "databaseName=QuanLiCafe;";
    private static String USER_NAME = "sa";
    private static String PASSWORD = "123456";
    private Connection conn; 
    
    public Connection ketNoi(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(DB_URL, USER_NAME,PASSWORD);
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
    
}

