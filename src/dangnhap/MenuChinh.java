/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dangnhap;

import DatBan.DanhSachMonChon;
import QuanLyMon.DanhMucEnum;
import DatBan.HoaDon;
import QuanLyMon.MonFactory;
import DatBan.MotMonChon;
import QuanLyNhanVien.NhanVien;
import DatBan.QuanLiDatBan;
import QuanLyMon.QuanLiMon;
import QuanLyNhanVien.QuanLiNhanVien;
import ThongKe.ThongKe;
import QuanLyMon.ThucAn;
import QuanLyMon.DoUong;
import QuanLyMon.Mon;
import QuanLyBan.QuanLiBan;
import QuanLyBan.Ban;
import java.text.ParseException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class MenuChinh {

    public void menu(QuanLiNhanVien qlnv, QuanLiMon qlmon, QuanLiBan qlban,
            QuanLiDatBan qlDatBan, ThongKe ThongKe) throws ParseException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        int chon;
        do {
            System.out.println("***CHƯƠNG TRÌNH QUẢN LÍ QUÁN CAFE***");
            System.out.println("1. Quản lí nhân viên");
            System.out.println("2. Quản lí món");
            System.out.println("3. Quản lí bàn");
            System.out.println("4. Đặt bàn");
            System.out.println("5. Thống kê");
            System.out.println("0. Thoát");
            System.out.print("Chọn số: ");
            chon = scanner.nextInt();
            switch (chon) {
                case 1:
                    menuNhanVien(qlnv);
                    break;
                case 2:
                    menuMon(qlmon);
                    break;
                case 3:
                    menuBan(qlban);
                    break;
                case 4:
                    menuDatBan(qlmon, qlban, qlDatBan);
                    break;
                case 5:
                    menuThongKe(qlDatBan);
                case 0:
                    System.out.println("Cảm ơn bạn đã sử dụng");
                    System.exit(0);
                    break;
            }
        } while (chon != 0);
    }

    public static void menuNhanVien(QuanLiNhanVien qlnv) throws ParseException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
         NhanVien nv =new NhanVien();
         int chon1 = 0;
        do {
            if(nv.getMaNV()== 0  || nv.getHoTen()==null|| nv.getGioiTinh()==null){
                
            }else{
            System.out.println("---Chức Năng Nhân Viên---");
            System.out.println("1. Thêm Nhân Viên");
            System.out.println("2. Xóa Nhân Viên");
            System.out.println("3. Cập nhật Nhân Viên");
            System.out.println("4. Xem danh sách Nhân Viên");
            System.out.println("0. Quay lại");
            System.out.print("Chọn số: ");
            chon1 = scanner.nextInt();
            switch (chon1) {
                case 1:
                    NhanVien newnv = new NhanVien();
                    newnv.Nhap();
                    qlnv.themNhanVien(newnv);
                    break;
                case 2:
                    NhanVien NV= new NhanVien();
                    NV.xoa();
                    
                    break;
                case 3:
                   /* System.out.print("Nhập mã số nhân viên cần cập nhật: ");
                    int capnhat = scanner.nextInt();
                    for (NhanVien nv : qlnv.getDs()) {
                        if (nv.getMaNV() == capnhat) {
                            nv.capNhat(scanner);
                        }
                    }*/
<<<<<<< HEAD
                    
                    nv.capNhat();
=======
<<<<<<< HEAD
                    
                    nv.capNhat();
=======
                    NhanVien nv= new NhanVien();
                    nv.capNhat(scanner);
>>>>>>> 6ee39a48a58289ea2f1e4b28911c9f72b024d7c0
>>>>>>> d5106294992485f0ae5360b5f928989a4ada8548
                    
                    break;
                case 4:
                    System.out.println("===Danh Sach Nhan Vien===");
                    nv.ShowData();
                    break;
                case 0:
                    break;
            }
        } 
        }while (chon1 != 0);
                
            
           
        
  }


    public static  void menuMon(QuanLiMon qlmon) {
        Scanner scanner = new Scanner(System.in);
        int chon2;
        do {
            System.out.println("---Quản Lí Thực Đơn---");
            System.out.println("1. Thêm món");
            System.out.println("2. Xóa món");
            System.out.println("3. Xem thực đơn");
            System.out.println("4. Tìm kiếm");
            System.out.println("5. Sắp xếp theo giá");
            System.out.println("0. Quay lại");
            System.out.print("Chọn số: ");

            chon2 = scanner.nextInt();
            switch (chon2) {
                case 1:
                    System.out.println("1. Thức ăn");
                    System.out.println("2. Đồ uống ");
                    System.out.println("Chọn danh mục: ");
                    int chonDanhMuc;
                    chonDanhMuc = scanner.nextInt();
                    Mon monThem1,
                     monThem2;
                    switch (chonDanhMuc) {
                        case 1:
                            monThem1 = MonFactory.layLoai(DanhMucEnum.THUC_AN);
                            monThem1.Nhap(scanner);
                            qlmon.themMon(monThem1);
                            break;
                        case 2:
                            monThem2 = MonFactory.layLoai(DanhMucEnum.DO_UONG);
                            monThem2.Nhap(scanner);
                            qlmon.themMon(monThem2);
                            break;
                        default:
                            System.out.println("Khong hợp lệ.\n");
                    }

                    break;
                case 2:
                    int maMonXoa;
                    System.out.print("Nhập mã món cần xóa: ");
                    maMonXoa = scanner.nextInt();
                    for (Mon mon : qlmon.getThucdon()) {
                        if (mon.getMaMon() == maMonXoa) {
                            qlmon.xoaMon(mon);
                        }
                        // Khong xoa duoc mon cuoi       

                    }
                    break;
                case 3:
                    System.out.println("=== Thực Đơn ===");
                    System.out.print(qlmon);
                    break;
                case 4:
                    System.out.println("1. Tìm kiếm theo tên");
                    System.out.println("2. Tìm kiếm theo khoảng giá");
                    System.out.print("Chọn: ");
                    int chonTimKiem = scanner.nextInt();
                    switch (chonTimKiem) {
                        case 1:
                            System.out.print("Nhập tên tìm kiếm: ");
                            String hungCase4 = scanner.nextLine();
                            String tenTimKiem = scanner.nextLine();
                            System.out.println(qlmon.timKiemTheoTen(tenTimKiem));
                            break;
                        case 2:
                            System.out.print("Nhập giá trong khoảng: ");
                            double gia1 = scanner.nextDouble();
                            double gia2 = scanner.nextDouble();
                            System.out.println(qlmon.timKiemTheoGia(gia1, gia2));
                            break;
                    }
                    break;
                case 5:
                    System.out.println("1. Sắp xếp tăng dần");
                    System.out.println("2. Sắp xếp giảm dần");
                    System.out.print("Chọn: ");
                    int chonSapXep = scanner.nextInt();
                    switch (chonSapXep) {
                        case 1:
                            System.out.println("===Danh sách sau khi sắp xếp===");
                            qlmon.sapXepTang();
                            System.out.println(qlmon);
                            break;
                        case 2:
                            System.out.println("===Danh sách sau khi sắp xếp===");
                            qlmon.sapXepGiam();
                            System.out.println(qlmon);
                            break;
                    }
                    break;
            }
        } while (chon2 != 0);
    }

    public static void menuBan(QuanLiBan qlban) {
        Scanner scanner = new Scanner(System.in);
        int chonBan;
        do {
            System.out.println("---Quản Lí Bàn---");
            System.out.println("1. Thêm bàn");
            System.out.println("2. Xóa bàn");
            System.out.println("3. Xem danh sách bàn Trống");
            System.out.println("4. Tra cứu theo súc chứa");
            System.out.println("0. Quay lại");
            System.out.print("Chọn số: ");

            chonBan = scanner.nextInt();
            int sucChua = 0;
            switch (chonBan) {
                case 1: //thêm bàn
                    System.out.print("Sức chứa: ");
                    sucChua = scanner.nextInt();
                    Ban newBan = new Ban(sucChua);
                    qlban.themBan(newBan);
                    break;
                case 2: //Xóa bàn
                    String tenBan = "";
                    System.out.print("Nhập mã bàn cần xoa: ");
                    String hungLine = scanner.nextLine();
                    tenBan = scanner.nextLine();
                    for (Ban ban : qlban.getDsBan()) {
                        if (ban.getMaBan().equals(tenBan)) {
                            qlban.xoaBan(ban);
                        }
                    }
                    break;
                
                case 3:// xem danh sách bàn trống
                    System.out.println("===Danh sách bàn trống===");
                    System.out.println(qlban.xemDSBanTrong());
                    break;
                case 4:
                    System.out.println("Nhập vao sức chứa các bàn cần tìm: ");
                    sucChua = scanner.nextInt();
                    System.out.println("===Danh sách các bàn theo SỨC CHỨA===");
                    System.out.println(qlban.traCuu(sucChua));
                    break;
            }
        } while (chonBan != 0);

    }

    public static void menuDatBan(QuanLiMon qlmon, QuanLiBan qlban,
            QuanLiDatBan qlDatBan) {
        Scanner scanner = new Scanner(System.in);
        int chonBan, chonMon, soLuong;
        System.out.println("--- Danh sách Bàn Trống ---");
        System.out.println(qlban.xemDSBanTrong());
        System.out.print("Chọn số BÀN cần đặt: ");
        chonBan = scanner.nextInt();
        for (Ban ban : qlban.getDsBan()) {
            if (ban.getSoBan() == chonBan) {
                ban.setTinhTrang(false);//set tình trạng bàn có người

                DanhSachMonChon dsMonChon = new DanhSachMonChon();
                HoaDon hoaDon = new HoaDon();
                do {
                    System.out.println("Thực đơn: ");
                    System.out.println(qlmon);
                    System.out.println("0. Thoát");
                    System.out.println("-1. Thanh toán");

                    System.out.print("Chọn MÓN cần đặt: ");
                    chonMon = scanner.nextInt();

                    if (chonMon == -1) {
                        System.out.println("Thông tin hóa đơn: ");
                        System.out.println(hoaDon);
                        qlDatBan.themHoaDon(hoaDon);
                        ban.setTinhTrang(true);
                        break;
                    }
                    for (Mon mon : qlmon.getThucdon()) {
                        if (mon.getMaMon() == (chonMon)) {
                            System.out.print("Số lượng: ");
                            soLuong = scanner.nextInt();
                            MotMonChon monChon = new MotMonChon(mon, soLuong);
                            dsMonChon.themMotMonChon(monChon);
                            hoaDon.setDsMonChon(dsMonChon);
                        }
                    }
                } while (chonMon != 0);
            }

        }

    }

    public static void menuThongKe(QuanLiDatBan qlDatBan) {
        ThongKe thongKe = new ThongKe(qlDatBan);
        Scanner scanner = new Scanner(System.in);
        int luaChon;
        do {
            System.out.println("1. Thống kê theo tháng");
            System.out.println("2. Thống kê theo quý");
            System.out.println("0. Thoát5");
            System.out.print("Chọn: ");
            luaChon = scanner.nextInt();
            switch (luaChon) {
                case 1:
                    thongKe.ThongKeTheoThang();
                    break;
                case 2:
                    thongKe.ThongKeTheoQuy();
                    break;
     
            }
        } while (luaChon != 0);

    }

<<<<<<< HEAD
    public static void close() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
=======
    //public static void close() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   //}//
>>>>>>> d5106294992485f0ae5360b5f928989a4ada8548

  

    public String taaa() throws ClassNotFoundException {
        try {
            QuanLiNhanVien qlnv = new QuanLiNhanVien();
            QuanLiMon qlmon = new QuanLiMon();
            QuanLiBan qlban = new QuanLiBan();
            QuanLiDatBan qlDatBan = new QuanLiDatBan(qlban, qlmon);
            ThongKe thongKe = new ThongKe(qlDatBan);
//            NhanVien nv1 = new NhanVien("Kim Hai", "Nam", "Tp HCM", "28/02/1999", "27/05/2015", "Phuc vu");
//            NhanVien nv2 = new NhanVien("Dai Loc", "Nam", "Cam Ranh", "01/01/1999", "19/04/2018", "Pha Che");
//            NhanVien nv3 = new NhanVien("Quang Truong", "Nam", "Dak Lak", "22/05/1999", "13/07/2019", "Quan Li");
//            Mon mon1 = new ThucAn("Banh Mi", 15000, "Con ban", "Toi", "Co");
//            Mon mon2 = new DoUong("Nuoc suoi", 5000, "Con ban", "Sang", "Co");
//            Mon mon3 = new ThucAn("Banh Ngot", 7000, "Con ban", "Chieu", "Co");
//            Ban ban1 = new Ban(10);
//            Ban ban2 = new Ban(8);
//            Ban ban3 = new Ban(20);
<<<<<<< HEAD
//            qlnv.themNhanVien(nv1);
//            qlnv.themNhanVien(nv2);
//            qlnv.themNhanVien(nv3);
=======
////            qlnv.themNhanVien(nv1);
////            qlnv.themNhanVien(nv2);
////            qlnv.themNhanVien(nv3);
>>>>>>> d5106294992485f0ae5360b5f928989a4ada8548
//            qlmon.themMon(mon1);
//            qlmon.themMon(mon2);
//            qlmon.themMon(mon3);
//            qlban.themBan(ban1);
//            qlban.themBan(ban2);
//            qlban.themBan(ban3);
            menu(qlnv, qlmon, qlban, qlDatBan, thongKe);
        } catch (ParseException ex) {
            Logger.getLogger(MenuChinh.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
}
