
package Cop6_QuanLyHoDan;

import java.util.Scanner;

public class NhanSu {
    private String hoTen;
    private int namSinh;
    private String ngheNghiep;

    public NhanSu() {
    }

    public NhanSu(String hoTen, int namSinh, String ngheNghiep) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.ngheNghiep = ngheNghiep;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }
    
    
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ tên thành viên: ");
        hoTen =sc.nextLine();
        System.out.println("Nhập năm sinh thành viên: ");
        namSinh=Integer.parseInt(sc.nextLine());
        System.out.println("Nhập nghề nghiệp của thành viên: ");
        ngheNghiep = sc.nextLine();
    }
    public void Xuat(){
        System.out.printf("\n%-20s %-20d %-20s",hoTen,namSinh,ngheNghiep);
    }
}
