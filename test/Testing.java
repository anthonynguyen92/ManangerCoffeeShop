/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

<<<<<<< HEAD
import QuanLyBan.demotestBan;
import java.util.List;
import QuanLyNhanVien.NhanVien;
=======
import java.util.List;
import QuanLyNhanVien.NhanVien;
<<<<<<< HEAD
>>>>>>> d5106294992485f0ae5360b5f928989a4ada8548
import QuanLyNhanVien.demo;
import static com.sun.xml.internal.ws.encoding.policy.FastInfosetFeatureConfigurator.enabled;
import controller.DAO;
import dangnhap.MenuChinh;
import dangnhap.dangnhap;
import java.lang.reflect.Member;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
<<<<<<< HEAD
=======
=======
import static com.sun.xml.internal.ws.encoding.policy.FastInfosetFeatureConfigurator.enabled;
import controller.DAO;
import dangnhap.dangnhap;
import java.lang.reflect.Member;
import java.sql.Connection;
>>>>>>> 6ee39a48a58289ea2f1e4b28911c9f72b024d7c0
>>>>>>> d5106294992485f0ae5360b5f928989a4ada8548
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
<<<<<<< HEAD
import java.util.Scanner;
=======
<<<<<<< HEAD
import java.util.Scanner;
=======
>>>>>>> 6ee39a48a58289ea2f1e4b28911c9f72b024d7c0
>>>>>>> d5106294992485f0ae5360b5f928989a4ada8548
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import static org.junit.Assert.assertNotEquals;
<<<<<<< HEAD
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
=======
<<<<<<< HEAD
import static org.junit.Assert.fail;
=======
>>>>>>> 6ee39a48a58289ea2f1e4b28911c9f72b024d7c0
import org.junit.Before;
import org.junit.BeforeClass;
>>>>>>> d5106294992485f0ae5360b5f928989a4ada8548
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.testng.annotations.*;






public class Testing {
    Connection conn= null;
    public static ResultSet rst;
    public static PreparedStatement ptmt = null;
<<<<<<< HEAD
    private int soBan;
    private String maBan;
    private int sucChua;
   
    private  int dem = 0;
    {
       
        setDem(getDem() + 1);
    }
    
    
=======
<<<<<<< HEAD
   
    /*public ArrayList<String> getAIDS(){
=======
    public ArrayList<String> getAIDS(){
>>>>>>> 6ee39a48a58289ea2f1e4b28911c9f72b024d7c0
        ArrayList<String> arr = new ArrayList<String>();
        try{
            String tmp;
            ptmt = DAO.ketNoi().prepareStatement("SELECT * from Login");
            rst = ptmt.executeQuery();
            while(rst.next()){
                tmp  = rst.getString("Username")+"-"+ rst.getString("PassWord");
                arr.add(tmp);
            }
        }catch(Exception e){
        }
                
        return arr;
         
<<<<<<< HEAD
    }*/
=======
    }
>>>>>>> 6ee39a48a58289ea2f1e4b28911c9f72b024d7c0
    
     private int n;
>>>>>>> d5106294992485f0ae5360b5f928989a4ada8548
    
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
<<<<<<< HEAD
            System.out.print("Test Thành công\n");
        
    }
//Test Chức Năng Đăng Nhập 
    @Ignore
=======
<<<<<<< HEAD
            System.out.print("Test Connect Thành công\n");
        
    }
//Test Chức Năng Đăng Nhập 
>>>>>>> d5106294992485f0ae5360b5f928989a4ada8548
    @Test //test fail
    public void testdangnhap() throws SQLException, ClassNotFoundException{
          demo dm = new demo();
          dm.codeDangNhap();
<<<<<<< HEAD
=======
          
          
>>>>>>> d5106294992485f0ae5360b5f928989a4ada8548
          Assert.assertEquals("long", dm.getUser());
          Assert.assertEquals("456", dm.getPassWord()); 
          
          
<<<<<<< HEAD
            return ;
=======
          
        // return ;
>>>>>>> d5106294992485f0ae5360b5f928989a4ada8548
    }
    
    
//Test Chức Năng Thêm Nhân Viên
<<<<<<< HEAD
@Ignore
=======

>>>>>>> d5106294992485f0ae5360b5f928989a4ada8548
    @Test
    public void testthemNhanVien() throws ParseException, ClassNotFoundException{
       
        demo dm =new demo();
        String actual =dm.testthemNhanVien() ;
<<<<<<< HEAD
        String expected ="INSERT INTO dbo.NhanVien(MaNV,HoTen,GioiTinh,QueQuan,NgaySinh,NgayVaoLam) VALUES(2,'an','nam','dl','12/12/2012','01/12/2011');";
=======
        String expected ="INSERT INTO dbo.NhanVien(MaNV,HoTen,GioiTinh,QueQuan,NgaySinh,NgayVaoLam) VALUES(3,'','nam','dl','12/12/2012','01/12/2011');";
>>>>>>> d5106294992485f0ae5360b5f928989a4ada8548
        Assert.assertEquals(expected,actual);
        System.out.print("Test Thêm Nhân Viên Pass \n");
       
    }
<<<<<<< HEAD
  // Test Chức Năng XÓa Nhân Viên
    @Ignore
=======
//  // Test Chức Năng XÓa Nhân Viên
>>>>>>> d5106294992485f0ae5360b5f928989a4ada8548
    @Test
    public void XoaNhanVien(){        
        demo dm =new demo();
        String actual =dm.xoaNhanVIen() ;
<<<<<<< HEAD
        String expected = "DELETE FROM NhanVien where MaNv =2";
=======
        String expected = "DELETE FROM NhanVien where MaNv =?";
>>>>>>> d5106294992485f0ae5360b5f928989a4ada8548
        Assert.assertEquals(expected,actual);
        System.out.print("Test Xóa Nhân Viên Pass \n");    
        
    }
<<<<<<< HEAD
    @Ignore
=======
>>>>>>> d5106294992485f0ae5360b5f928989a4ada8548
     @Test
    public void UpdateNhanVien() throws ParseException{        
        demo dm =new demo();
        String actual =dm.capNhatNhanVien() ;
<<<<<<< HEAD
        String expected = "UPDATE NhanVien set HoTen ='linh' , GioiTinh = 'nu', QueQuan ='hcm' "  + " where MaNv =2" ;
=======
        String expected = "UPDATE NhanVien set HoTen = Khang , GioiTinh = nam, QueQuan =dl "  + " where MaNv =1" ;
>>>>>>> d5106294992485f0ae5360b5f928989a4ada8548
        Assert.assertEquals(expected,actual);
        System.out.print("Test Update Nhân Viên Pass \n");    
        
    }
<<<<<<< HEAD
    //@Ignore
    @Test
    public void testqlyban(){
        demotestBan dmtb = new demotestBan();
        String actual = dmtb.demotestBan();
        String expected = "INSERT INTO dbo.Ban(MaBan,SoBan,SucChua) VALUES (3,4,5);";
        Assert.assertEquals(expected,actual);
        
        System.out.print("Test Thành Công Quản  Lý Bàn\n");
             
    }
        
      
=======

        
        
>>>>>>> d5106294992485f0ae5360b5f928989a4ada8548
              
              
            
        
        
    
        
       
    
  

    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        {
            
             
           org.junit.runner.Result result = JUnitCore.runClasses(Testing.class);
<<<<<<< HEAD
=======
=======
            System.out.print("Test Thành công\n");
        
    }
    @Test
    public void testdangnhap() throws SQLException, ClassNotFoundException{
        dangnhap dn = new dangnhap();
        Testing test= new Testing();
        
        for(int i = 0; i < test.getAIDS().size();i++){
            String[] tam =test.getAIDS().get(i).split("");
            for (int j = 0; j < tam.length; j++){
                assertNotEquals("sai user or password",null,dn.codeDangNhap(tam[0],tam[1]));
           
        
         
    }
    
        }      
       
    
}
    
        
          
          
          
          
        
       
       
       
        
        
 
       
        
        
        
    
    public static void main(String[] args) {
        {
            org.junit.runner.Result result = JUnitCore.runClasses(Testing.class);
>>>>>>> 6ee39a48a58289ea2f1e4b28911c9f72b024d7c0
>>>>>>> d5106294992485f0ae5360b5f928989a4ada8548

            if (!result.wasSuccessful()) {
                    result.getFailures().forEach((failure) -> {
                    System.err.println(failure);
<<<<<<< HEAD
                    
=======
<<<<<<< HEAD
                    
=======
>>>>>>> 6ee39a48a58289ea2f1e4b28911c9f72b024d7c0
>>>>>>> d5106294992485f0ae5360b5f928989a4ada8548
                });
            } else {
                System.err.println("success");
            }
        }
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> d5106294992485f0ae5360b5f928989a4ada8548

    private String getUser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getPassWord() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
<<<<<<< HEAD

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
=======
=======
>>>>>>> 6ee39a48a58289ea2f1e4b28911c9f72b024d7c0
>>>>>>> d5106294992485f0ae5360b5f928989a4ada8548
    
}
