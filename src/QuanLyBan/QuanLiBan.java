/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyBan;

import QuanLyBan.Ban;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class QuanLiBan {

    private ArrayList<Ban> dsBan = new ArrayList<>();

    public void themBan(Ban ban) {
        this.getDsBan().add(ban);
    }

    public void xoaBan(Ban ban) {
        this.getDsBan().remove(ban);
    }

  

    public QuanLiBan traCuu(int sucChua) {
        QuanLiBan qlBanMoi = new QuanLiBan();
        for (Ban ban : this.getDsBan()) {
            if (ban.getSucChua() == sucChua) {
                qlBanMoi.themBan(ban);
            }
        }
        return qlBanMoi;
    }

    public QuanLiBan xemDSBanTrong() {
        QuanLiBan dsBanTrong = new QuanLiBan();
        for (Ban ban : this.getDsBan()) {
            if (ban.isTinhTrang() == true) {
                dsBanTrong.themBan(ban);
            }
        }
        return dsBanTrong;
    }

    @Override
    public String toString() {
        String m = "";
        for (Ban ban : this.dsBan) {
            m += ban;
        }
        return m;
    }

    /**
     * @return the dsBan
     */
    public ArrayList<Ban> getDsBan() {
        return dsBan;
    }

    /**
     * @param dsBan the dsBan to set
     */
    public void setDsBan(ArrayList<Ban> dsBan) {
        this.dsBan = dsBan;
    }
}
