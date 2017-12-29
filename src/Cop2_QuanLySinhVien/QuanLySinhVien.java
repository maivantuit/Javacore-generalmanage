
package Cop2_QuanLySinhVien;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySinhVien {
    public static void main(String[] args) {
        SinhVien danhsachsv[]=null;        
        int luachon=0;
        int n;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1. Nhập n danh sách sinh viên");
            System.out.println("2. Hiển thị thông tin sinh viên");
            System.out.println("3. Kết thúc");
            
            System.out.println("Mời bạn chọn giá trị");
            luachon =Integer.parseInt(sc.nextLine());
            
            switch(luachon){
                case 1:{
                    System.out.println("Mời bạn nhập số sinh viên: ");
                    n=Integer.parseInt(sc.nextLine());
                    danhsachsv = new SinhVien[n];
                    
                    for(int i=0;i<danhsachsv.length;i++){
                        System.out.println("----------->Nhập sinh viên thứ: "+(i+1));
                        danhsachsv[i]= new SinhVien();
                        danhsachsv[i].NhapTT();
                    }
                    System.out.println();
                    break;
                }
                case 2:{
                    System.out.println("-----Thông tin danh sách sinh viên------");
                    System.out.printf(" %-20s %-20s %-20s","Mã Sinh Viên","Họ Tên","Năm Sinh");
                    for(int i=0;i<danhsachsv.length;i++){
                        danhsachsv[i].XuatTT();
                    }
                    System.out.println();
                    break;
                }
                
                case 3:{
                    break;
                }
            }          
        }while(luachon!=3);
    }
}
