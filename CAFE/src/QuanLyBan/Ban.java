/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyBan;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Ban {

    private int soBan;
    private String maBan;
    private int sucChua;
    private boolean tinhTrang;
    private static int dem = 0;

    {
        tinhTrang = true;
        ++dem;
    }

    public Ban() {
    }

    ;
    public Ban(int sucChua) {
        this.maBan = String.format("B%03d", dem);
        this.soBan = dem;
        this.sucChua = sucChua;
    }

    public void Nhap(Scanner scanner) {
        String hungNextline1 = scanner.nextLine();
        System.out.print("Sức chứa: ");
        this.sucChua = scanner.nextInt();
    }

    @Override
    public String toString() {
        String m = String.format("Số bàn: %d\t"
                + "Mã bàn: %s\t"
                + "Sức chứa: %d\n",
                 this.soBan, this.maBan, this.sucChua);
        return m;
    }

    public String getMaBan() {
        return maBan;
    }

    public void setMaBan(String maBan) {
        this.maBan = maBan;
    }

    public int getSucChua() {
        return sucChua;
    }

    public void setSucChua(int sucChua) {
        this.sucChua = sucChua;
    }

    public boolean isTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    /**
     * @return the soBan
     */
    public int getSoBan() {
        return soBan;
    }

    /**
     * @param soBan the soBan to set
     */
    public void setSoBan(int soBan) {
        this.soBan = soBan;
    }

}
