/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyBan;

import QuanLyNhanVien.demo;
import controller.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class demotestBan {
    Connection conn= null;
    private PreparedStatement ptmt = null;
    private int soBan;
    private String maBan;
    private int sucChua;
    private boolean tinhTrang;
    private static int dem = 0;

    {
        tinhTrang = true;
        ++dem;
    }
     public  String demotestBan() {
        
        DAO t = new DAO();
        conn = t.ketNoi();
        String sql ="INSERT INTO dbo.Ban(MaBan,SoBan,SucChua) VALUES (3,2,5);";
        try {
            ptmt = conn.prepareStatement(sql);
            //ptmt.executeUpdate(sql);
            int k = ptmt.executeUpdate();  
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sql;
        
        
       
    }
    
   /* public int Nhap(int sucChua) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Sức chứa: ");
        this.sucChua = scanner.nextInt();
        return sucChua;
    }*/
    public static void main(String[] arg) throws SQLException, ClassNotFoundException{
     
   demotestBan nc= new demotestBan();
   nc.demotestBan();
   
 }
}
