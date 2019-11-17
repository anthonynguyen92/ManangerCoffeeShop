/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyNhanVien;

import controller.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class QuanLiNhanVien {

    Connection conn = null;
    private PreparedStatement ptmt = null;

    private ArrayList<NhanVien> ds = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    SimpleDateFormat f = new SimpleDateFormat("dd/mm/yyyy");
    

    public void themNhanVien(NhanVien nv) {
        this.getDs().add(nv);
    }

    public QuanLiNhanVien traCuuNhanVien(String kw) throws ParseException {
        QuanLiNhanVien dctc = new QuanLiNhanVien();
        System.out.println("1.Theo họ tên.");
        System.out.println("2.Theo giới tính.");
        System.out.println("3.Theo ngày sinh.");
        System.out.println("4.Theo quê quán.");
        System.out.print("Chọn mục tra cứu: ");
        int chon = scanner.nextInt();
        switch (chon) {
            case 1:
                for (NhanVien nv : dctc.ds) {
                    if (nv.getHoTen().toLowerCase().contains(kw.toLowerCase())) {
                        dctc.ds.add(nv);
                    }
                }
            case 2:
                for (NhanVien nv : dctc.ds) {
                    if (nv.getGioiTinh().toLowerCase().contains(kw.toLowerCase())) {
                        dctc.ds.add(nv);
                    }
                }
            case 3:
                for (NhanVien nv : dctc.ds) {
                    if (nv.getQueQuan().toLowerCase().contains(kw.toLowerCase())) {
                        dctc.ds.add(nv);
                    }
                }
            case 4:
                for (NhanVien nv : dctc.ds) {
                    if (nv.getNgaySinh().equals(f.parse(kw))) {
                        dctc.ds.add(nv);
                    }
                }
        }
        return dctc;
    }

    @Override
    public String toString() {
        String m = "";
        for (NhanVien nv : ds) {
            m += nv;
        }
        return m;
    }

    public ArrayList<NhanVien> getDs() {
        return ds;
    }

    public void setDs(ArrayList<NhanVien> ds) {
        this.ds = ds;
    }

}
