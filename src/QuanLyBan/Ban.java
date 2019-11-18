/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyBan;

import controller.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Ban {
     Connection conn= null;
   private PreparedStatement ptmt = null;


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
        Scanner scanner = new Scanner(System.in);
        String hungNextline1 = scanner.nextLine();
        this.maBan = String.format("B%03d", dem);
        this.soBan = dem;
        this.sucChua = sucChua;
        DAO t = new DAO();
        conn = t.ketNoi();
          
        System.out.print("Mã Bàn: ");
        this.maBan = scanner.nextLine();
        System.out.print("Số bàn: ");
        this.soBan = scanner.nextInt();
        System.out.print("Sức chứa: ");
        this.sucChua = scanner.nextInt();
        
        String sql = "INSERT INTO dbo.Ban(MaBan,SoBan,SucChua) VALUES(?,?,?);";
        try {
            ptmt = conn.prepareStatement(sql);
            ptmt.setString(1, this.getMaBan());
            ptmt.setInt(2, this.getSoBan());
            ptmt.setInt(3, this.getSucChua());
            
            
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
        }
       
           
    }
<<<<<<< HEAD
    
    public void Nhap(Scanner scanner) {
        //String hungNextline1 = scanner.nextLine();
=======

<<<<<<< HEAD
=======
    public int Nhap(Scanner scanner) {
        String hungNextline1 = scanner.nextLine();
        System.out.print("Mã Bàn: ");
        this.maBan = scanner.nextLine();
        System.out.print("Số bàn: ");
        this.soBan = scanner.nextInt();
>>>>>>> d5106294992485f0ae5360b5f928989a4ada8548
        System.out.print("Sức chứa: ");
        this.sucChua = scanner.nextInt();
        return 0;
    }
>>>>>>> 6ee39a48a58289ea2f1e4b28911c9f72b024d7c0



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
