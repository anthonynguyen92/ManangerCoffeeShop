/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatBan;

import QuanLyMon.QuanLiMon;
import QuanLyBan.QuanLiBan;
import java.util.ArrayList;

/**
 *
 * @author shini
 */
public class QuanLiDatBan {

    private ArrayList<HoaDon> qlDatBan = new ArrayList<>();
    private QuanLiBan qlBan;
    private QuanLiMon qlMon;

    public QuanLiDatBan() {
    }

    ;
    public QuanLiDatBan(QuanLiBan qlBan, QuanLiMon qlMon) {
        this.qlBan = qlBan;
        this.qlMon = qlMon;
    }

    public void themHoaDon(HoaDon hoaDon) {
        this.qlDatBan.add(hoaDon);
    }

    public void xoaHoaDon(HoaDon hoaDon) {
        this.qlDatBan.remove(hoaDon);
    }

    public String xemDSHoaDon() {
        String m = "";
        for (HoaDon hd : qlDatBan) {
            m += hd;
        }
        return m;
    }

    /**
     * @return the qlDatBan
     */
    public ArrayList<HoaDon> getQlDatBan() {
        return qlDatBan;
    }

    /**
     * @param qlDatBan the qlDatBan to set
     */
    public void setQlDatBan(ArrayList<HoaDon> qlDatBan) {
        this.qlDatBan = qlDatBan;
    }

}
