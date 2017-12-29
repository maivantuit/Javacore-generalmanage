
package Cop3_QuanLyKhachHang;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyKhachHang {
    public static void main(String[] args) {
        int Arrayn[]=null;
        ArrayList<KhachHang> danhsachkh = new ArrayList<KhachHang>();
        int luachon=0;
        int n;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("------------QUẢN LÝ KHÁCH HÀNG------------");
            System.out.println("1. Nhập n danh sách khách hàng");
            System.out.println("2. Hiển thị danh sách khách hàng");
            System.out.println("3. Tìm tổng lương khách hàng >N(N: tổng lương nhập từ bàn phím)");
            System.out.println("4. Kết thúc");
            
            System.out.println("Mời bạn nhập lựa chọn: ");
            luachon = Integer.parseInt(sc.nextLine());
            
            switch(luachon){
                case 1:{
                    System.out.println("-------> Số khách hàng cần nhập: ");
                    n = Integer.parseInt(sc.nextLine());
                    Arrayn  = new int[n];// tạo n đối tượng ô nhớ để lưu n khách hàng nhập vào
                    for(int i=0;i<Arrayn.length;i++){
                        System.out.println("------> Nhập khách hàng thứ: "+(i+1));
                        KhachHang kh = new KhachHang();
                        kh.Nhap();
                        danhsachkh.add(kh);
                    }
                    System.out.println();
                    break;
                }
                case 2:{
                    System.out.println("----------DANH SÁCH KHÁCH HÀNG------------");
                    System.out.printf("\n%-10s %-25s %-10s %-20s","Mã KH","Tên KH","Năm Sinh","Tổng Lương");
                    for(int i=0;i<danhsachkh.size();i++){
                        danhsachkh.get(i).Xuat();
                    }
                    System.out.println();
                    break;
                }
                case 3:{
                    int x;                    
                    System.out.println("Mời bạn nhập x (Tổng Lương): ");
                    x=Integer.parseInt(sc.nextLine());
                    
                    System.out.println("----------DANH SÁCH KHÁCH HÀNG CÓ TỔNG LƯƠNG > X------------");
                    System.out.printf("\n%-10s %-25s %-10s %-20s","Mã KH","Tên KH","Năm Sinh","Tổng Lương>x");
                    for(int i=0;i<danhsachkh.size();i++){
                        if(x<danhsachkh.get(i).getTongLuong()){                            
                            danhsachkh.get(i).Xuat();
                        }
                    }
                    break;
                }
                case 4:{
                    break;
                }
            }
        }while(luachon!=4);
        
    }
}
