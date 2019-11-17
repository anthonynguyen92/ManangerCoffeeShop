/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import QuanLyNhanVien.NhanVien;
import static com.sun.xml.internal.ws.encoding.policy.FastInfosetFeatureConfigurator.enabled;
import controller.DAO;
import dangnhap.dangnhap;
import java.lang.reflect.Member;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import static org.junit.Assert.assertNotEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.testng.annotations.*;






public class Testing {
    Connection conn= null;
    public static ResultSet rst;
    public static PreparedStatement ptmt = null;
    public ArrayList<String> getAIDS(){
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
         
    }
    
     private int n;
    
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

            if (!result.wasSuccessful()) {
                    result.getFailures().forEach((failure) -> {
                    System.err.println(failure);
                });
            } else {
                System.err.println("success");
            }
        }
    }
    
}
