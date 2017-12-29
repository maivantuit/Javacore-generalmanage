
package Cop5_QuanLySach;
import java.util.Scanner;
import java.util.Vector;
public class QuanLySach {
    public static void main(String[] args) {
        Vector<Sach> danhsachs = new Vector<Sach>();
        int luachon=0;
        int n;
        int Arrayn[]=null;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("------------------------QUẢN LÝ SÁCH--------------------");
            System.out.println("1. Nhập n danh sách sách");
            System.out.println("2. Hiển thị danh sách sách");
            System.out.println("3. Tìm danh sách sách có năm > N(N: năm nhập vào)");
            System.out.println("4. Kết thúc");
            System.out.println("Mời bạn lựa chọn phù hợp từ 1-4: ");
            luachon =Integer.parseInt(sc.nextLine());
            
            switch(luachon){
                case 1:{
                    System.out.println("Nhập vào n số sách: ");
                    n=Integer.parseInt(sc.nextLine());
                    Arrayn = new int[n];                    
                    for(int i=0;i<Arrayn.length;i++){
                        System.out.println("-------> Mời bạn nhập sách: "+(i+1));
                        Sach s = new Sach();
                        s.Nhap();
                        danhsachs.add(s);                        
                    }
                    System.out.println();
                    break;
                }
                case 2:{
                    System.out.println("----------------DANH SÁCH SÁCH------------------");
                    System.out.printf("%-10s %-20s %-10s","Mã Sách","Tên Sách","Năm Xuất Bản");
                    for(int i=0;i<danhsachs.size();i++){
                        danhsachs.get(i).Xuat();//vậy là vector phải có <> gennegic mới gọi lại method Nhập. chú ý                     
                    }
                    System.out.println();
                    break;
                }
                case 3:{
                    int nam;
                    int dem=0;
                    System.out.println("Nhập vào năm bạn cần tìm: ");
                    nam = Integer.parseInt(sc.nextLine());
                     System.out.println("----------------DANH SÁCH SÁCH SAU KHI KIỂM TRA------------------");
                    System.out.printf("%-10s %-20s %-10s","Mã Sách","Tên Sách","Năm Xuất Bản");
                    for(int i=0;i<danhsachs.size();i++){
                        if(nam<danhsachs.get(i).getNamXB()){
                            danhsachs.get(i).Xuat();
                            dem++;
                        }
                    }
                    if(dem==0){
                        System.out.println("\n Không có năm > năm bạn cần tìm");
                    }
                    System.out.println();
                    break;
                }
                case 4:{
                    break;
                }
            }
        }while(luachon!=4);
    }
}
