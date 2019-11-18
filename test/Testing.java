/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import QuanLyBan.demotestBan;
import java.util.List;
import QuanLyNhanVien.NhanVien;
import QuanLyNhanVien.demo;
import static com.sun.xml.internal.ws.encoding.policy.FastInfosetFeatureConfigurator.enabled;
import controller.DAO;
import dangnhap.MenuChinh;
import dangnhap.dangnhap;
import java.lang.reflect.Member;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.testng.annotations.*;






public class Testing {
    Connection conn= null;
    public static ResultSet rst;
    public static PreparedStatement ptmt = null;
    private int soBan;
    private String maBan;
    private int sucChua;
   
    private  int dem = 0;
    {
       
        setDem(getDem() + 1);
    }
    
    
    
    @BeforeClass
    public static void StartClass() {
        System.out.println("Bắt Đầu chương trình Test");
    }
    
    @AfterClass
    public static void AfterClass() {
        System.out.println("Kết Thúc chương trình Test");
    }
    
    @Before
     public void start() {
        System.out.println("Start test case");
    }
    
    
    @After
    public void After() {
        System.out.println("After test case");
    }

    @Test
    public void testGetConnection() throws SQLException {
            DAO da= new DAO();
            Connection con = da.ketNoi(); 
            Assert.assertNotNull(con);
            Assert.assertTrue(con.isValid(0));
            con.close();
            System.out.print("Test Thành công\n");
        
    }
//Test Chức Năng Đăng Nhập 
    @Ignore
    @Test //test fail
    public void testdangnhap() throws SQLException, ClassNotFoundException{
          demo dm = new demo();
          dm.codeDangNhap();
          Assert.assertEquals("long", dm.getUser());
          Assert.assertEquals("456", dm.getPassWord()); 
          
          
            return ;
    }
    
    
//Test Chức Năng Thêm Nhân Viên
@Ignore
    @Test
    public void testthemNhanVien() throws ParseException, ClassNotFoundException{
       
        demo dm =new demo();
        String actual =dm.testthemNhanVien() ;
        String expected ="INSERT INTO dbo.NhanVien(MaNV,HoTen,GioiTinh,QueQuan,NgaySinh,NgayVaoLam) VALUES(2,'an','nam','dl','12/12/2012','01/12/2011');";
        Assert.assertEquals(expected,actual);
        System.out.print("Test Thêm Nhân Viên Pass \n");
       
    }
  // Test Chức Năng XÓa Nhân Viên
    @Ignore
    @Test
    public void XoaNhanVien(){        
        demo dm =new demo();
        String actual =dm.xoaNhanVIen() ;
        String expected = "DELETE FROM NhanVien where MaNv =2";
        Assert.assertEquals(expected,actual);
        System.out.print("Test Xóa Nhân Viên Pass \n");    
        
    }
    @Ignore
     @Test
    public void UpdateNhanVien() throws ParseException{        
        demo dm =new demo();
        String actual =dm.capNhatNhanVien() ;
        String expected = "UPDATE NhanVien set HoTen ='linh' , GioiTinh = 'nu', QueQuan ='hcm' "  + " where MaNv =2" ;
        Assert.assertEquals(expected,actual);
        System.out.print("Test Update Nhân Viên Pass \n");    
        
    }
    //@Ignore
    @Test
    public void testqlyban(){
        demotestBan dmtb = new demotestBan();
        String actual = dmtb.demotestBan();
        String expected = "INSERT INTO dbo.Ban(MaBan,SoBan,SucChua) VALUES (3,4,5);";
        Assert.assertEquals(expected,actual);
        
        System.out.print("Test Thành Công Quản  Lý Bàn\n");
             
    }
        
      
              
              
            
        
        
    
        
       
    
  

    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        {
            
             
           org.junit.runner.Result result = JUnitCore.runClasses(Testing.class);

            if (!result.wasSuccessful()) {
                    result.getFailures().forEach((failure) -> {
                    System.err.println(failure);
                    
                });
            } else {
                System.err.println("success");
            }
        }
    }

    private String getUser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getPassWord() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int demotestBan(int sucChua) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    /**
     * @return the maBan
     */
    public String getMaBan() {
        return maBan;
    }

    /**
     * @param maBan the maBan to set
     */
    public void setMaBan(String maBan) {
        this.maBan = maBan;
    }

    /**
     * @return the sucChua
     */
    public int getSucChua() {
        return sucChua;
    }

    /**
     * @param sucChua the sucChua to set
     */
    public void setSucChua(int sucChua) {
        this.sucChua = sucChua;
    }

    /**
     * @return the dem
     */
    public int getDem() {
        return dem;
    }

    /**
     * @param dem the dem to set
     */
    public void setDem(int dem) {
        this.dem = dem;
    }
    
}
