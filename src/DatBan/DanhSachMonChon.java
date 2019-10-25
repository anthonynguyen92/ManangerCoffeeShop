/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatBan;

import DatBan.MotMonChon;
import java.util.ArrayList;

/**
 *
 * @author shini
 */
public class DanhSachMonChon {

    private ArrayList<MotMonChon> dsMonChon = new ArrayList<>();

    public void themMotMonChon(MotMonChon motMon) {
        dsMonChon.add(motMon);
    }

    public void xoaMotMonChon(MotMonChon motMon) {
        dsMonChon.remove(motMon);
    }

    public double tinhTongTien() {
        double tongTien = 0.0;
        for (MotMonChon motMonChon : dsMonChon) {
            tongTien += motMonChon.getThanhTien();
        }
        return tongTien;
    }

    @Override
    public String toString() {
        String m = "";
        double tongTien = 0.0;
        for (MotMonChon motMonChon : dsMonChon) {
            m += motMonChon;
            tongTien += motMonChon.getThanhTien();
        }
        m += String.format("Tổng Tiền Hóa Đơn là: %,.3f\n", tongTien);
        return m;
    }

    /**
     * @return the dsMonChon
     */
    public ArrayList<MotMonChon> getDsMonChon() {
        return dsMonChon;
    }

    /**
     * @param dsMonChon the dsMonChon to set
     */
    public void setDsMonChon(ArrayList<MotMonChon> dsMonChon) {
        this.dsMonChon = dsMonChon;
    }

}
