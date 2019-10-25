/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatBan;

import DatBan.MotMonChon;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author shini
 */
public class HoaDon {

    private static int demHD = 0;
    private int maHD;
    private GregorianCalendar ngayLap;
    private DanhSachMonChon dsMonChon;
    SimpleDateFormat f = new SimpleDateFormat("dd/MM/YYYY");
    Calendar cal = Calendar.getInstance();

    {
        maHD = ++demHD;
        ngayLap = new GregorianCalendar();
    }

    public HoaDon() {
    }

    ;
    public HoaDon(DanhSachMonChon dsMonChon) {
        this.dsMonChon = dsMonChon;
    }

    public double tinhTongTien() {
        double tongTien = 0.0;
        for (MotMonChon motMonChon : dsMonChon.getDsMonChon()) {
            tongTien += motMonChon.getThanhTien();
        }
        return tongTien;
    }

    @Override
    public String toString() {
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        String m = String.format("Mã Hóa Đơn: %s\n "
                + "Ngày Lập: %s\n",
                this.maHD, f.format(this.getNgayLap().getTime()));
        m += dsMonChon;
        return m;

    }

    /**
     * @return the maHD
     */
    public int getMaHD() {
        return maHD;
    }

    /**
     * @param maHD the maHD to set
     */
    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }

    /**
     * @return the ngayLap
     */
    /**
     * @return the dsMonChon
     */
    public DanhSachMonChon getDsMonChon() {
        return dsMonChon;
    }

    /**
     * @param dsMonChon the dsMonChon to set
     */
    public void setDsMonChon(DanhSachMonChon dsMonChon) {
        this.dsMonChon = dsMonChon;
    }

    /**
     * @return the ngayLap
     */
    public GregorianCalendar getNgayLap() {
        return ngayLap;
    }

    /**
     * @param ngayLap the ngayLap to set
     */
    public void setNgayLap(GregorianCalendar ngayLap) {
        this.ngayLap = ngayLap;
    }

    /**
     * @return the ngayLap
     */
    /**
     * @return the ngayLap
     */
}
