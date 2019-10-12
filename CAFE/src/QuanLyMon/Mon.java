/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyMon;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public abstract class Mon {

    private static int dem = 0;
    private int maMon;
    private String tenMon;
    private double gia;
    private String tinhTrang;
    private String thoiDiemBan;

    {
        setMaMon(++dem);
        tinhTrang = "Còn bán";
    }

    public Mon() {

    }

//    public abstract String layLoai();

    public Mon(String ten, double gia, String tinhTrang, String thoiDiemBan) {

        this.tenMon = ten;
        this.gia = gia;
        this.tinhTrang = tinhTrang;
        this.thoiDiemBan = thoiDiemBan;
    }

    public void Nhap(Scanner scanner) {
        String hungNextline1 = scanner.nextLine();
        System.out.print("Tên món: ");
        this.tenMon = scanner.nextLine();
        System.out.print("Giá: ");
        this.gia = scanner.nextDouble();
        String hungNextline2 = scanner.nextLine();
        System.out.print("Thời điểm bán: ");
        this.thoiDiemBan = scanner.nextLine();
    }

    @Override
    public String toString() {
        String m = String.format("Mã món: %s\tTên món: %s\tGiá: %,.2f\tTình trạng:"
                + " %s\tThời điểm bán: %s\t", this.getMaMon(),
                this.tenMon, this.gia, this.tinhTrang, this.thoiDiemBan);
        return m; //To change body of generated methods, choose Tools | Templates.
    }

    public int soSanh(Mon mon1) {
        double k = this.getGia() - mon1.getGia();
        if (k > 0) {
            return 1;
        } else {
            return -1;
        }

    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public String getThoiDiemBan() {
        return thoiDiemBan;
    }

    public void setThoiDiemBan(String thoiDiemBan) {
        this.thoiDiemBan = thoiDiemBan;
    }

    /**
     * @return the maMon
     */
    public int getMaMon() {
        return maMon;
    }

    /**
     * @param maMon the maMon to set
     */
    public void setMaMon(int maMon) {
        this.maMon = maMon;
    }

}
