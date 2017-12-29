
package Cop7_QuanLyTienDien;

import java.util.Scanner;

public class BienLaiThuTien extends KhachHang {
    private int soCu;
    private int soMoi;
    private int soTienTra;    
    public BienLaiThuTien(){// nếu bên cha không có hàm contructor thì con không thể tạo ra đc.
        
    }
    public BienLaiThuTien(int soCu, int soMoi, int soTienTra, String maKH, String tenKH, String soNha, int maCongTo) {
        super(maKH, tenKH, soNha, maCongTo);
        this.soCu = soCu;
        this.soMoi = soMoi;
        this.soTienTra = soTienTra;
    }

    public int getSoCu() {
        return soCu;
    }

    public int getSoMoi() {
        return soMoi;
    }

    public int getSoTienTra() {
        return soTienTra;
    }
    public void setSoCu(int soCu) {
        this.soCu = soCu;
    }
    public void setSoMoi(int soMoi) {
        this.soMoi = soMoi;
    }
    public void setSoTienTra(int soTienTra) {
        this.soTienTra = soTienTra;
    }
    @Override
    public void Nhap(){
        Scanner sc= new Scanner(System.in);
        super.Nhap();
        System.out.println("Nhập chỉ số cũ: ");
        soCu =Integer.parseInt(sc.nextLine());
        System.out.println("Nhập chỉ số mới: ");
        soMoi =Integer.parseInt(sc.nextLine());        
    }
    public int TienTra(){
        return (soCu+soMoi)*3000;
    }
    public void Xuat(){
        super.Xuat();
        System.out.printf("%-10d %-10d %-15s",soCu,soMoi,TienTra());
    }
   
}
