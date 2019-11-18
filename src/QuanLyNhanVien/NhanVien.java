/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyNhanVien;

import controller.DAO;
import dangnhap.MenuChinh;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class NhanVien {
   Connection conn= null;
   private PreparedStatement ptmt = null;
          
    private int maNV;
    private String hoTen;
    private String gioiTinh;
    private String queQuan;
    private Date ngaySinh;
    private Date ngayVaoLam;
    private String boPhan;
    private static int demMaNV = 0;
   

    Scanner scanner = new Scanner(System.in);
    SimpleDateFormat f = new SimpleDateFormat("dd/mm/yyyy");

    public NhanVien() throws ParseException, ClassNotFoundException {
        this.maNV = ++demMaNV;
        this.hoTen = "";
        this.gioiTinh = "";
        this.queQuan = "";
        this.ngaySinh = f.parse("0/00/0000");
        this.ngayVaoLam = f.parse("0/00/0000");
       
    }
   
    public NhanVien(String ten, String gioiTinh, String queQuan, String ngaySinh, String ngayVaoLam, String bp) throws ParseException {
        this.maNV = ++demMaNV;
        this.hoTen = ten;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
        this.ngaySinh = f.parse(ngaySinh);
        this.ngayVaoLam = f.parse(ngayVaoLam);
        this.boPhan = bp;
        //this.boPhan.setTenBoPhan(bp);
       /* DAO t = new DAO();
        conn = t.ketNoi();
        String sql = "INSERT INTO dbo.NhanVien(MaNV,HoTen,GioiTinh,QueQuan,NgaySinh,NgayVaoLam) VALUES(?,?,?,?,?,?);";
        try {
            ptmt = conn.prepareStatement(sql);
            ptmt.setInt(1, this.getMaNV());
            ptmt.setString(2, this.getHoTen());
            ptmt.setString(3, this.getGioiTinh());
            ptmt.setString(4, this.getQueQuan());
            ptmt.setDate(5, new java.sql.Date(this.getNgaySinh().getTime()));
            ptmt.setDate(6, new java.sql.Date(this.getNgayVaoLam().getTime()));
            
            int k = ptmt.executeUpdate();
            if(k!=0){
                System.out.print("Them thanh cong");
            }
            else
                System.out.print("Them khong thanh cong");
            ptmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> d5106294992485f0ae5360b5f928989a4ada8548
    public int ShowData(){
        DAO t = new DAO();
        conn = t.ketNoi();
        String sql = "SELECT * FROM NhanVien";
        Statement st;
        
       try {
           ptmt =conn.prepareStatement(sql);
           ResultSet k=ptmt.executeQuery();
           
            if (k != null) {
                System.out.print("show thanh cong");
            } else {
                System.out.print("update khong thanh cong");
            }
            ptmt.close();
            conn.close();
           
       } catch (SQLException ex) {
           ex.printStackTrace();
       }
       return 0;
        
    }
    
<<<<<<< HEAD
=======
=======
    public ResultSet getData(){
        ResultSet rs=null;
        String sqlCommand = "select *from NhanVien";
        Statement st;
        
       try {
           st=conn.createStatement();
           rs=st.executeQuery(sqlCommand);
       } catch (SQLException ex) {
           Logger.getLogger(NhanVien.class.getName()).log(Level.SEVERE, null, ex);
       }
       return rs;
        
    }
    public void showData(ResultSet rs){
       /* try{
            while(rs.next()){
               System.out.printf(%f,%10s,%20s,%30s,%+
               +0
               
               );  
            }
           
        }*/
    }
>>>>>>> 6ee39a48a58289ea2f1e4b28911c9f72b024d7c0
>>>>>>> d5106294992485f0ae5360b5f928989a4ada8548
     public int xoa() {
        DAO t = new DAO();
        conn = t.ketNoi();
        System.out.println("==== Nhập thông tin Cần Xóa ====");

        System.out.print("Mã NV: ");
        this.maNV=scanner.nextInt();
        String sql = "DELETE FROM NhanVien where MaNv =?";
        try {
<<<<<<< HEAD
             ptmt = conn.prepareStatement(sql);
=======
<<<<<<< HEAD
             ptmt = conn.prepareStatement(sql);
=======
            ptmt = conn.prepareStatement(sql);
>>>>>>> 6ee39a48a58289ea2f1e4b28911c9f72b024d7c0
>>>>>>> d5106294992485f0ae5360b5f928989a4ada8548
             ptmt.setInt(1, this.getMaNV());
            

            int k = ptmt.executeUpdate();
            if (k != 0) {
                System.out.print("Xoa thanh cong");
            } else {
                System.out.print("Xoa khong thanh cong");
            }
            ptmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
        
    }
<<<<<<< HEAD
    public int capNhat() throws ParseException{
=======
<<<<<<< HEAD
    public int capNhat() throws ParseException{
=======
    public int capNhat(Scanner scanner) throws ParseException{
>>>>>>> 6ee39a48a58289ea2f1e4b28911c9f72b024d7c0
>>>>>>> d5106294992485f0ae5360b5f928989a4ada8548
         DAO t = new DAO();
        conn = t.ketNoi();
        String ngaySinhTam;
        String ngayVaoLamTam;
        System.out.println("==== Nhập thông tin Cập Nhật ====");
       
        String nextLine = scanner.nextLine();
        System.out.print("Họ tên: ");
        this.hoTen = scanner.nextLine();
        System.out.print("Giới tính: ");
        this.gioiTinh = scanner.nextLine();
        System.out.print("Quê quán: ");
        this.queQuan = scanner.nextLine();
        System.out.print("Ngày sinh: ");
        ngaySinhTam = scanner.nextLine();
        this.ngaySinh = f.parse(ngaySinhTam);
        System.out.print("Ngày vào làm: ");
        ngayVaoLamTam = scanner.nextLine();
        this.ngayVaoLam = f.parse(ngayVaoLamTam);
        System.out.print("Mã Nhân Viên: ");
        this.maNV=scanner.nextInt();
//        System.out.print("Bộ phận: ");
//        this.boPhan.setTenBoPhan(scanner.nextLine());
        String sql ="UPDATE NhanVien set HoTen =? , GioiTinh = ?, QueQuan =? "  + " where MaNv =?" ; /*"update NhanVien set QueQuan = '"+this.getQueQuan()+"';"
                + "HoTen = '"+this.getHoTen()+"';"
                + "GioiTinh = '"+this.getGioiTinh()+"' where MaNv ='"+this.getMaNV()+"'";*/
        try {
            ptmt = conn.prepareStatement(sql);   
            ptmt.setString(1, this.getHoTen());
            ptmt.setString(2, this.getGioiTinh());
            ptmt.setString(3, this.getQueQuan());
           // ptmt.setDate(4, new java.sql.Date(this.getNgaySinh().getTime()));
            //ptmt.setDate(5, new java.sql.Date(this.getNgayVaoLam().getTime()));
            ptmt.setInt(4, this.getMaNV());
            int k = ptmt.executeUpdate();
            if(k!=0){
                System.out.print("Cập nhật thành công");
            }
            else
                System.out.print("Cập nhật không thành công");
            ptmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
       return 0;
        
    }
<<<<<<< HEAD
    public String Nhap() throws ParseException {
=======
<<<<<<< HEAD
    public String Nhap() throws ParseException {
=======
    public int Nhap(Scanner scanner) throws ParseException {
>>>>>>> 6ee39a48a58289ea2f1e4b28911c9f72b024d7c0
>>>>>>> d5106294992485f0ae5360b5f928989a4ada8548
        DAO t = new DAO();
        conn = t.ketNoi();
        String ngaySinhTam;
        String ngayVaoLamTam;
        System.out.println("==== Nhập thông tin nhân viên ====");
       
        System.out.print("Mã Nhân Viên");
        this.maNV=scanner.nextInt();
        String nextLine = scanner.nextLine();
        System.out.print("Họ tên: ");
        this.hoTen = scanner.nextLine();
        System.out.print("Giới tính: ");
        this.gioiTinh = scanner.nextLine();
        System.out.print("Quê quán: ");
        this.queQuan = scanner.nextLine();
        System.out.print("Ngày sinh: ");
        ngaySinhTam = scanner.nextLine();
        this.ngaySinh = f.parse(ngaySinhTam);
        System.out.print("Ngày vào làm: ");
        ngayVaoLamTam = scanner.nextLine();
        this.ngayVaoLam = f.parse(ngayVaoLamTam);
        System.out.print("Bộ phận: ");
        this.boPhan = scanner.nextLine();
        String sql = "INSERT INTO dbo.NhanVien(MaNV,HoTen,GioiTinh,QueQuan,NgaySinh,NgayVaoLam) VALUES(?,?,?,?,?,?);";
        try {
            if(this.maNV==0 ||this.hoTen== null || this.gioiTinh==null || this.queQuan==null){
                System.out.print("Nhập Thiếu THông Tin\n");
            }else{
            ptmt = conn.prepareStatement(sql);
            ptmt.setInt(1, this.getMaNV());
            ptmt.setString(2, this.getHoTen());
            ptmt.setString(3, this.getGioiTinh());
            ptmt.setString(4, this.getQueQuan());
            ptmt.setDate(5, new java.sql.Date(this.getNgaySinh().getTime()));
            ptmt.setDate(6, new java.sql.Date(this.getNgayVaoLam().getTime()));
           // ptmt.setString(7, this.boPhan);
            int k = ptmt.executeUpdate();
           if(k!=0){
                System.out.print("Them thanh cong");
            }
            else
                System.out.print("Them khong thanh cong");
            ptmt.close();
            conn.close();}
        } catch (Exception e) {
            e.printStackTrace();
        }
<<<<<<< HEAD
       return sql;
=======
<<<<<<< HEAD
       return sql;
=======
       return 0;
>>>>>>> 6ee39a48a58289ea2f1e4b28911c9f72b024d7c0
>>>>>>> d5106294992485f0ae5360b5f928989a4ada8548
    }
   
    
    @Override
    public String toString() {
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        String m = String.format("Mã nhân viên: %d\nTên nhân viên: %s\n"
                + "Giới tính: %s\nQuê Quán: %s\nNgày sinh: %s\nNgày vào làm: %s\nBộ phận: %s\n",
                 this.maNV, this.hoTen, this.gioiTinh, this.queQuan,
                f.format(this.ngaySinh), f.format(this.ngayVaoLam), this.boPhan);
        return m; //To change body of generated methods, choose Tools | Templates.
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Date getNgayVaoLam() {
        return ngayVaoLam;
    }

    public void setNgayVaoLam(Date ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }

    /**
     * @return the boPhan
     */
    public String getBoPhan() {
        return boPhan;
    }

    /**
     * @param boPhan the boPhan to set
     */
    public void setBoPhan(String boPhan) {
        this.boPhan = boPhan;
    }

<<<<<<< HEAD
   
=======
<<<<<<< HEAD
   
=======
    public boolean Nhap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
>>>>>>> 6ee39a48a58289ea2f1e4b28911c9f72b024d7c0
>>>>>>> d5106294992485f0ae5360b5f928989a4ada8548

    public int xoa(int n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
