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
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class QuanLiMon {

    private ArrayList<Mon> thucdon = new ArrayList<>();
    Connection conn = null;
    private PreparedStatement ptmt = null;

    public void themMon(Mon mon) {
        thucdon.add(mon);
    }

    public int xoaMon(Mon mon) {
        DAO t = new DAO();
        conn = t.ketNoi();
        String sql = "DELETE FROM ThucDon where MaMon =" + mon.getMaMon();
        try {
            ptmt = conn.prepareStatement(sql);

            int k = ptmt.executeUpdate();
            if (k != 0) {
                System.out.print("Xoa thanh cong");
            } else {
                System.out.print("Xoa khong thanh cong");
            }
            ptmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        thucdon.remove(mon);
        return 0;
    }

    public QuanLiMon timKiemTheoTen(String kw) {
        QuanLiMon dskq = new QuanLiMon();
        for (Mon mon : thucdon) {
            if (mon.getTenMon().contains(kw)) {
                dskq.themMon(mon);
            }
        }
        return dskq;
    }

    public QuanLiMon timKiemTheoGia(double gia1, double gia2) {
        QuanLiMon dskq = new QuanLiMon();
        for (Mon mon : thucdon) {
            if (mon.getGia() >= gia1 && mon.getGia() <= gia2) {
                dskq.themMon(mon);
            }
        }
        return dskq;
    }

    public void sapXepTang() {
        this.thucdon.sort((mon1, mon2) -> mon1.soSanh(mon2));
    }

    public void sapXepGiam() {
        this.thucdon.sort((mon1, mon2) -> -mon1.soSanh(mon2));
    }

    @Override
    public String toString() {
        String m = "";
        for (Mon mon : this.thucdon) {
            m += mon;
        }
        return m; //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<Mon> getThucdon() {
        return thucdon;
    }

    public void setThucdon(ArrayList<Mon> thucdon) {
        this.thucdon = thucdon;
    }

}
