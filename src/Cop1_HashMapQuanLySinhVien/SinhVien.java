
package Cop1_HashMapQuanLySinhVien;

import Cop2_QuanLySinhVien.*;
import java.util.Scanner;

public class SinhVien {
    private String hoTen;
    private String maSV;
    private int namSinh;

    public SinhVien() {
    }

    public SinhVien(String hoTen, String maSV, int namSinh) {
        this.hoTen = hoTen;
        this.maSV = maSV;
        this.namSinh = namSinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getMaSV() {
        return maSV;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
    public void NhapTT(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên: ");
        maSV=sc.nextLine();
        System.out.println("Nhập họ tên sinh viên: ");
        hoTen= sc.nextLine();
        System.out.println("Nhập năm sinh: ");
        namSinh =Integer.parseInt(sc.nextLine());
    }
    public void XuatTT(){      
        System.out.printf("\n%-20s %-20s %20d",maSV,hoTen,namSinh);
    }
}
