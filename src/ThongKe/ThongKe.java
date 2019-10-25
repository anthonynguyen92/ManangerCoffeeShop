/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThongKe;

import java.util.ArrayList;
import java.util.Calendar;
import DatBan.HoaDon;
import DatBan.QuanLiDatBan;

/**
 *
 * @author shini
 */
public class ThongKe {

    private QuanLiDatBan qlDatBan;

    public ThongKe(QuanLiDatBan qlDatBan) {
        this.qlDatBan = qlDatBan;
    }

    public void ThongKeTheoThang() {// trong JAVA tháng tính từ 0 - 11
        for (int i = 1; i <= 12; i++) {
            double tongTien = 0.0;
            for (HoaDon hoaDon : qlDatBan.getQlDatBan()) {
                if (hoaDon.getNgayLap().get(Calendar.MONTH) + 1 == i) {
                    tongTien += hoaDon.tinhTongTien();
                }
            }
            System.out.println("Tháng " + i + ":" + tongTien);
        }
    }

    public void ThongKeTheoQuy() {
        for (int i = 1; i <= 4; i++) {
            double tongTien = 0.0;
            for (int j = 3 * i; j >= 3 * (i - 1) + 1; j--) {
                for (HoaDon hoaDon : qlDatBan.getQlDatBan()) {
                    if (hoaDon.getNgayLap().get(Calendar.MONTH) >= j
                            && hoaDon.getNgayLap().get(Calendar.MONTH) <= j) {
                        tongTien += hoaDon.tinhTongTien();
                    }
                }

            }
            System.out.println("Qúy " + i + ": " + tongTien);
        }
    }
}
