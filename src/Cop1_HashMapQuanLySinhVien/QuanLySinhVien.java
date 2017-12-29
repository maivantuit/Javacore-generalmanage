package Cop1_HashMapQuanLySinhVien;

import Cop2_QuanLySinhVien.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class QuanLySinhVien {

    public static void main(String[] args) {
        HashMap danhsachsv = new HashMap();
        int Arrayn[] = null;
        int luachon = 0;
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Nhập n danh sách sinh viên");
            System.out.println("2. Hiển thị thông tin sinh viên");
            System.out.println("3. Kết thúc");

            System.out.println("Mời bạn chọn giá trị");
            luachon = Integer.parseInt(sc.nextLine());

            switch (luachon) {
                case 1: {
                    System.out.println("Mời bạn nhập số sinh viên: ");
                    n = Integer.parseInt(sc.nextLine());
                    Arrayn = new int[n];
                    for (int i = 0; i < Arrayn.length; i++) {
                        System.out.println("----------->Nhập sinh viên thứ: " + (i + 1));
                        SinhVien sv = new SinhVien();
                        sv.NhapTT();
                        danhsachsv.put(i + 1, sv);
                    }
                    System.out.println();
                    break;
                }
                case 2: {
                    System.out.println("-----Thông tin danh sách sinh viên------");
                    System.out.printf(" %-20s %-20s %-20s", "Mã Sinh Viên", "Họ Tên", "Năm Sinh");
                    Set set = danhsachsv.entrySet();
                    Iterator i = set.iterator();
                    while (i.hasNext()) {
                        Map.Entry me = (Map.Entry) i.next();
                        danhsachsv.get(i);
                    }
                    System.out.println();
                    break;
                }

                case 3: {
                    break;
                }
            }
        } while (luachon != 3);
    }
}
