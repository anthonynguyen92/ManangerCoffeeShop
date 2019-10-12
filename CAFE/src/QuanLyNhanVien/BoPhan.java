/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyNhanVien;

import QuanLyNhanVien.NhanVien;
import java.util.List;

/**
 *
 * @author DELL
 */
public class BoPhan {

    private List<NhanVien> ds;
    private int maBoPhan;
    private String tenBoPhan;
    private int demMa = 0;
    {
        demMa++;
    }
    public BoPhan() {
        this.maBoPhan = demMa;
        this.tenBoPhan = "";
    }

    public int getMaBoPhan() {
        return maBoPhan;
    }

    public void setMaBoPhan(int maBoPhan) {
        this.maBoPhan = maBoPhan;
    }

    public String getTenBoPhan() {
        return tenBoPhan;
    }

    public void setTenBoPhan(String tenBoPhan) {
        this.tenBoPhan = tenBoPhan;
    }

}
