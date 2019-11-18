/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyMon;

import QuanLyMon.Mon;
import controller.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class DoUong extends Mon {

    private String coDa;
    private DanhMucEnum danhMuc;
    Connection conn= null;
    private PreparedStatement ptmt = null;

    public DoUong() {
    }

    ;
    public DoUong(String ten, double gia, String tinhTrang, String thoiDiemBan, String da) {
        super(ten, gia, tinhTrang, thoiDiemBan);
        this.coDa = da;
    }

    @Override
    public void Nhap(Scanner scanner) {
        super.Nhap(scanner);
        System.out.print("Có đá: ");
        this.coDa = scanner.nextLine();
        DAO t = new DAO();
        conn = t.ketNoi();
        String sql = "INSERT INTO dbo.ThucDon(MaMon,TenMon,Gia,TinhTrang,ThoiDiemBan,CoDa) VALUES(?,?,?,?,?,?);";
        try {
            ptmt = conn.prepareStatement(sql);
            ptmt.setInt(1, this.getMaMon());
            ptmt.setString(2, this.getTenMon());
            ptmt.setDouble(3, this.getGia());
            ptmt.setString(4, this.getTinhTrang());
            ptmt.setString(5, this.getThoiDiemBan());
            ptmt.setString(6, this.getCoDa());
            
            int k = ptmt.executeUpdate();
            if(k!=0){
                System.out.print("Them thanh cong");
            }
            else
                System.out.print("Them khong thanh cong");
            ptmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
       
    }

    @Override
    public String toString() {
        String m = super.toString();
        m += String.format("Có đá: %s\n", this.coDa);
        return m; //To change body of generated methods, choose Tools | Templates.
    }

//    @Override
//    public String layLoai() {
//        return "Đồ uống";
//    }

    public String getCoDa() {
        return coDa;
    }

    public void setCoDa(String coDa) {
        this.coDa = coDa;
    }

}
