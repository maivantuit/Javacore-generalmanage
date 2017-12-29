
package Cop6_QuanLyHoDan;

import java.util.Scanner;

public class HoDan extends NhanSu{
    private String soNha;
    private int soTV;
    NhanSu danhsachns[]=null;

    public HoDan() {
    }

    public HoDan(String soNha, int soTV, String hoTen, int namSinh, String ngheNghiep) {
        super(hoTen, namSinh, ngheNghiep);
        this.soNha = soNha;
        this.soTV = soTV;
    }

    public String getSoNha() {
        return soNha;
    }

    public int getSoTV() {
        return soTV;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public void setSoTV(int soTV) {
        this.soTV = soTV;
    }
    @Override
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nhà của hộ dân: ");
        soNha=sc.nextLine();
        
        System.out.println("Nhập số thành viên trong hộ dân: ");
        soTV=Integer.parseInt(sc.nextLine());
        danhsachns = new NhanSu[soTV];
        for(int i=0;i<danhsachns.length;i++){
            System.out.println("-------> Nhập thành viên thứ: "+(i+1));
            danhsachns[i]=new NhanSu();
            danhsachns[i].Nhap();
        }
    }
    @Override
    public void Xuat(){
        /*
        ----------DANH SÁCH HỘ DÂN----------
        ----Hộ dân 1:
        So Nha          SoThanhVien
        44Thanh Long    7
        Ho Ten      Nam Sinh    Nghe Nghiep
        ----Hộ dân 2:
        So Nha: 43 Nguyen Thanh Binh
        So Thanh Vien: 3
        Ho Ten      Nam Sinh    Nghe Nghiep
        -------------------------------------
        */  
        System.out.printf("\n%-20s %-10d",soNha,soTV);
        System.out.printf("\n%-20s %-20s %-20s","Họ Tên","Năm Sinh","Nghề Nghiệp");
        for(int i=0;i<danhsachns.length;i++){
            System.out.println("-------DANH SÁCH THÀNH VIÊN-->");
            danhsachns[i].Xuat();
        }
        
    }
    
}
