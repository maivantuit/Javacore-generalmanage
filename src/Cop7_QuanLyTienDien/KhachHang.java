/*
    Quản lý tiền điện của của khách hàng.
1. Khách hàng: Mã KH,Tên KH,Số Nhà, Mã Công Tơ
2. Biên Lai Tính Tiền: Số củ, số mới, số tiền trả.
3. Viết chương trình quản lý biên lai tính tiền điện
    + Nhập vào n danh sach khách hàng sử dụng điện
    --------Nhap Khach Hang 1:
        Họ Tên      
        Số Nhà      
        Mã Công Tơ      
        Chỉ số Cũ       
        Chỉ sô Mới
    --------Nhap Khach Hang 2:
        Họ Tên      
        Số Nhà      
        Mã Công Tơ      
        Chỉ số Cũ       
        Chỉ sô Mới
        
    + Hiển thị danh sách khách hàng có SỬ DỤNG ĐIỆN
    ----------------------DANH SÁCH KHÁCH HÀNG SỬ DỤNG ĐIỆN----------------------------
    STT     Họ Tên      Số Nhà      Mã Công Tơ      Chỉ số Cũ       Chỉ sô Mới      Số Tiền Trả
     1       A           12          666             10              20              60000
     2       B           12          666             10              20              60000
     3       C           12          666             10              20              60000
4. Phân tích
    + Ta có Khách Hàng đã có các thuộc tính đó.
    + Biên Lai chứa những thông tin khách hàng, suy ra Bien Lai phải thừa kề lại Khách Hàng, khi nhập danh sách Khách Hàng
    + Có 1 mảng Khach Hang.
    + Số tiền trả = (chisomoi-chisocu)*3000
*/ 
package Cop7_QuanLyTienDien;

import java.util.Scanner;

public class KhachHang {
    private String maKH;
    private String tenKH;
    private String soNha;
    private int maCongTo;   

    public KhachHang() {
    }
    
    public KhachHang(String maKH, String tenKH, String soNha, int maCongTo) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.soNha = soNha;
        this.maCongTo = maCongTo;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public void setMaCongTo(int maCongTo) {
        this.maCongTo = maCongTo;
    }

    public String getMaKH() {
        return maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public String getSoNha() {
        return soNha;
    }

    public int getMaCongTo() {
        return maCongTo;
    }
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã khách hàng: ");
        maKH = sc.nextLine();
        System.out.println("Nhập họ tên khách hàng: ");
        tenKH =sc.nextLine();
        System.out.println("Nhập số nhà của khách hàng: ");
        soNha=sc.nextLine();
        System.out.println("Nhập số công tơ của khách hàng: ");
        maCongTo =Integer.parseInt(sc.nextLine());
    }
    public void Xuat(){
        System.out.printf("\n%-10s %-25s %-20s %-10d",maKH,tenKH,soNha,maCongTo);
    }
}
