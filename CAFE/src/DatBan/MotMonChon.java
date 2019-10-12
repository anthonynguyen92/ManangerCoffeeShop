/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatBan;

import QuanLyMon.Mon;

/**
 *
 * @author shini
 */
public class MotMonChon {

    private static int dem = 0;
    private int thuTu = 0;
    private Mon mon;
    private int soLuong;
    private double thanhTien;

    public MotMonChon(Mon mon, int soLuong) {
        this.thuTu = ++dem;
        this.mon = mon;
        this.soLuong = soLuong;
        this.thanhTien = mon.getGia() * this.soLuong;
    }

    @Override
    public String toString() {
        String m = String.format("Thứ tự: %d\tTên món: %s\t"
                + "Đơn giá: %,.1f\t" + "Số lượng: %d\t"
                + "Thành tiền: %,.1f\n", this.getThuTu(), mon.getTenMon(), mon.getGia(), this.soLuong, this.thanhTien);
        return m;
    }

    /**
     * @return the mon
     */
    public Mon getMon() {
        return mon;
    }

    /**
     * @param mon the mon to set
     */
    public void setMon(Mon mon) {
        this.mon = mon;
    }

    /**
     * @return the soLuong
     */
    public int getSoLuong() {
        return soLuong;
    }

    /**
     * @param soLuong the soLuong to set
     */
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    /**
     * @return the thanhTien
     */
    public double getThanhTien() {
        return thanhTien;
    }

    /**
     * @param thanhTien the thanhTien to set
     */
    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    /**
     * @return the thuTu
     */
    public int getThuTu() {
        return thuTu;
    }

    /**
     * @param thuTu the thuTu to set
     */
    public void setThuTu(int thuTu) {
        this.thuTu = thuTu;
    }

}
