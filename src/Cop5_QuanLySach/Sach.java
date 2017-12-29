
package Cop5_QuanLySach;

import java.util.Scanner;

public class Sach {
    private String maSach;
    private String tenSach;
    private int namXB;
    public Sach(){
        
    }
    public Sach(String maSach,String tenSach,int namXB){
        this.maSach = maSach;
        this.tenSach=tenSach;
        this.namXB = namXB;        
    }
    public String getMaSach(){
        return maSach;
    }
    public String getTenSach(){
        return tenSach;        
    }
    public int getNamXB(){
        return namXB;
    }
    public void setMaSach(String maSach){
        this.maSach=maSach;
    }
    public void setTenSach(){
        this.tenSach=tenSach;
    }
    public void setNamXB(){
        this.namXB=namXB;
    }
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sách: ");
        maSach=sc.nextLine();
        System.out.println("Nhập tên sách: ");
        tenSach=sc.nextLine();
        System.out.println("Nhập năm xuất bản: ");
        namXB=Integer.parseInt(sc.nextLine());
    }
    public void Xuat(){
        System.out.printf("\n%-10s %-20s %-10d",maSach,tenSach,namXB);
    }
}
