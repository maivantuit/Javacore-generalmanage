
package Cop7_QuanLyTienDien;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyTienDien {
    public static void main(String[] args) {
        int luachon =0;
        int n;
        int Arrayn[]=null;
        ArrayList<BienLaiThuTien>  danhsachkh = new ArrayList<BienLaiThuTien>();
        Scanner sc= new Scanner(System.in);
        do{
            System.out.println("--------------------QUẢN LÝ TIỀN ĐIỆN----------------------");
            System.out.println("1. Nhập n danh sách khách hàng sử dụng điện");
            System.out.println("2. Hiển thị danh sách khách hàng và chi tiết biên lại");
            System.out.println("3. Kết thúc");
            
            System.out.println("Mời bạn nhập lựa chon!");
            luachon =Integer.parseInt(sc.nextLine());
            
            switch(luachon){
                case 1:{
                    System.out.println("Mời bạn nhập số khách hàng sử dụng điện");
                    n=Integer.parseInt(sc.nextLine());
                    Arrayn = new int[n];
                    for(int i=0;i<Arrayn.length;i++){
                        System.out.println("---------------Nhập khách hàng thứ "+(i+1));    
                        BienLaiThuTien bl = new BienLaiThuTien();
                        bl.Nhap();
                        danhsachkh.add(bl);
                    }
                    System.out.println();
                    break;
                }
                case 2:{
                    System.out.println("---------------DANH SÁCH KHÁCH HÀNG SỬ DỤNG ĐIỆN---------------");
                    System.out.printf("%-10s %-25s %-20s %-10s %-10s %-10s %-15s","Mã KH","Tên KH","Số nhà","Mã Công Tơ","Số cũ","Số mới","Tiền điện/tháng");
                    for(int i=0;i<danhsachkh.size();i++){
                        danhsachkh.get(i).Xuat();
                    }
                    System.out.println();
                    break;
                }
                case 3:{
                    break;
                }
            }
        }while(luachon!=4);
    }
}
