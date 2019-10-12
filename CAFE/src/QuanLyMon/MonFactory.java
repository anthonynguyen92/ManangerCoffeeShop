/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyMon;

import QuanLyMon.ThucAn;
import QuanLyMon.DoUong;
import QuanLyMon.Mon;

/**
 *
 * @author DELL
 */
public class MonFactory {

    private MonFactory() {
    }
    public static final Mon layLoai(DanhMucEnum danhMuc) {
        switch (danhMuc) {
            case THUC_AN:
                return new ThucAn();

            case DO_UONG:
                return new DoUong();
        }
        return null;
    }
}
