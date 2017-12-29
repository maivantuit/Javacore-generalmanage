package Cop4_QuanLySanPham;


import java.util.Scanner;

/*
        System.out.println("1. Nhập danh sách sản phẩm(Tên và Giá)");
        System.out.println("2. Hiển thị danh sách sản phẩm giảm dần theo giá");
        System.out.println("3. Tìm và xóa sản phẩm theo tên");
        System.out.println("4. Xuất giá trị trung bình các sản phẩm");
        System.out.println("5. Tìm và hiển thị sản phẩm theo tên( và giá)");
        System.out.println("6. Sửa thông tin sản phẩm theo tên");
        System.out.println("7. Thoát chương trình");

*/
public class SanPham{
    private String maSP;
    private String tenSP;
    private int gia;

    public SanPham() {
    }

    public SanPham(String maSP, String tenSP, int gia) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.gia = gia;
    }

    public String getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public int getGia() {
        return gia;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sản phẩm: ");        
        maSP=sc.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        tenSP=sc.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        gia=Integer.parseInt(sc.nextLine());
    }
    public void Xuat(){
        System.out.printf("\n%-15s %-20s %-20d",maSP,tenSP,gia);
    }
    
}
