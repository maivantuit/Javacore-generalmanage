/*
1. Nhập vào n khách hàng(MaKH,HoTenKh,NamSinh,TongLuong)
2. Hiển thị thông tin khách hàng        
3. Hiển thị khách hàng có tổng lương lớn hơn X(X; nhập từ bàn phím)        
*/
package Cop3_QuanLyKhachHang;

import java.util.Scanner;

public class KhachHang {
    private String maKH;
    private String hoTen;
    private int namSinh;
    private int tongLuong;

    public KhachHang() {
    }

    public KhachHang(String maKH, String hoTen, int namSinh, int tongLuong) {
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.tongLuong = tongLuong;
    }

    public String getMaKH() {
        return maKH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public int getTongLuong() {
        return tongLuong;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void setTongLuong(int tongLuong) {
        this.tongLuong = tongLuong;
    }
    public void Nhap(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập mã KH: ");
        maKH =sc.nextLine();
        System.out.println("Nhập họ tên KH: ");
        hoTen=sc.nextLine();
        System.out.println("Nhập năm sinh KH: ");
        namSinh =Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tổng lương KH: ");
        tongLuong =Integer.parseInt(sc.nextLine());        
    }
    public void Xuat(){
        System.out.printf("\n%-10s %-25s %-10d %-20d",maKH,hoTen,namSinh,tongLuong);
    }
}
