/*
 * Để quản lý các hộ dân trong một khu phố, người ta quản lý các thông tin như sau:
    -	Với mỗi hộ dân, có các thuộc tính:
            + Số thành viên trong hộ ( số người).Ho
            + Số nhà của hộ dân đó ( Số nhà được gắn cho mỗi hộ dân)
            + Thông tin về mỗi cá nhân trong hộ gia đình.
    -	Với mỗi cá nhân, người ta quản lý các thông tin như: họ và tên, tuổi, năm sinh, nghề nghiệp.
1. Hãy xây dựng các lớp: NhanSu để quản lý thông tin về mỗi cá nhân; lớp HoDan để quản lý thông tin về các hộ gia đình. Viết các phương thức để nhập, hiển thị thông tin cho mỗi cá nhân.
2. Cài đặt chương trình thực hiện các công việc sau:
+ Nhập vào một dãy gồm n hộ dân (n - nhập từ bàn phím).
+ Hiển thị ra màn hình thông tin về các hộ trong khu phố.
 	Yêu cầu : Xử lí ngoại lệ .
+Khu phố: có n hộ dân, trong mỗi hộ dân có n thành viên.

 */
package Cop6_QuanLyHoDan;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyHoDan {

    public static void main(String[] args) {
        int luachon = 0;
        int n;
        int Arrayhd[] = null;
        ArrayList<HoDan> danhsachhd = new ArrayList<HoDan>();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("---------------------QUẢN LÝ HỘ DÂN------------------------");
            System.out.println("1. Nhập n danh sách hộ dân trong khu phố");
            System.out.println("2. Hiển thị danh sách hộ dân đã nhập");
            System.out.println("3. Kết thúc");

            try {
                System.out.println("Mời bạn chọn mục phù hợp 1-3: ");
                luachon = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Vui lòng nhập số từ 1-3, xin cảm ơn!");
            }

            switch (luachon) {
                case 1: {

                    try {
                        System.out.println("Nhập số hộ dân trong khu phố: ");
                        n = Integer.parseInt(sc.nextLine());
                        Arrayhd = new int[n];
                        
                    } catch (NullPointerException e){
                        System.out.println("Bạn vui lòng nhập số hộ dân chính xác, là 1 số nguyên dương");
                    }catch(Throwable e){
                        System.out.println("Bạn vui lòng nhập lại");
                        break;
                        
                    }
                    
                    for (int i = 0; i < Arrayhd.length; i++) {
                        System.out.println("------> Nhập hộ dân thứ: " + (i + 1));
                        HoDan hd = new HoDan();
                        hd.Nhap();
                        danhsachhd.add(hd);
                    }
                    System.out.println();
                    break;
                }
                case 2: {
                    System.out.println("---------------------DANH SÁCH HỘ DÂN------------------------");
                    System.out.printf("%20s %-10S", "SỐ NHÀ", "SỐ THÀNH VIÊN");
                    for (int i = 0; i < danhsachhd.size(); i++) {
                        System.out.println("-------HỘ DÂN: " + (i + 1));
                        danhsachhd.get(i).Xuat();
                    }
                    System.out.println("-------------------------------------------------------------");
                    System.out.println();
                    break;
                }
            }

        } while (luachon != 3);
    }
}
