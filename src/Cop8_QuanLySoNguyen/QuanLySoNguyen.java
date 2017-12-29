package Cop8_QuanLySoNguyen;

import Cop4_QuanLySanPham.SanPham;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuanLySoNguyen {

    public static void main(String[] args) {
        int luachon = 0;
        int n;
        ArrayList<SoNguyen> danhsachsn = new ArrayList<SoNguyen>();
        Scanner sc = new Scanner(System.in);
        int Arrayn[];
        do {
            System.out.println("--------------QUẢN LÝ SỐ NGUYÊN-------------");
            System.out.println("1. Nhập mảng số nguyên");
            System.out.println("2. Hiển thị mảng số nguyên đó");
            System.out.println("3. Tìm một phần tử trong mảng");
            System.out.println("4. Chèn một phần tử trong mảng");
            System.out.println("5. Xóa 1 phần tử trong mảng");
            System.out.println("6. Sắp xếp giảm dần");
            System.out.println("7. Sắp xếp tăng dần");
            System.out.println("8. Kết thúc");

            try {
                System.out.println("Mời bạn nhập lựa chọn!");
                luachon = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Bạn vui lòng chọn từ 1-8!, xin cảm ơn!");
            }

            switch (luachon) {
                case 1: {
                    System.out.println("Nhập số lượng phần tử trong mảng số nguyên: ");
                    n = Integer.parseInt(sc.nextLine());
                    Arrayn = new int[n];

                    for (int i = 0; i < Arrayn.length; i++) {
                        System.out.println("Nhập phần tử thứ: " + (i + 1));
                        SoNguyen sn = new SoNguyen();
                        sn.Nhap();
                        danhsachsn.add(sn);
                    }

                    break;
                }
                case 2: {
                    System.out.println("----------DANH SÁCH SỐ NGUYÊN--------------");
                    for (int i = 0; i < danhsachsn.size(); i++) {
                        danhsachsn.get(i).Xuat();

                    }

                    System.out.println();
                    break;
                }
                case 3: {
                    int so;
                    int dem = 0;
                    System.out.println("Nhập số cần tìm: ");
                    so = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < danhsachsn.size(); i++) {
                        if (so == danhsachsn.get(i).getSoNguyen()) {
                            System.out.println("Có số " + so + " trong danh sách");
                            dem++;
                        }
                    }
                    if (dem == 0) {
                        System.out.println("Không có số " + so + " trong danh sách");
                    }
                    break;
                }
                case 4: {
                    int so;
                    System.out.println("Chỉ số muốn chèn vào và số cần chèn");
                    so = Integer.parseInt(sc.nextLine());
                    danhsachsn.get(so).Nhap();
                    System.out.println("----------------DANH SÁCH SAU KHI CHÈN----------------");
                    for (int i = 0; i < danhsachsn.size(); i++) {
                        danhsachsn.get(i).Xuat();
                    }
                    System.out.println();
                    break;
                }
                case 5: {
                    int so;
                    int dem = 0;
                    System.out.println("Nhập số cần xóa: ");
                    so = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < danhsachsn.size(); i++) {
                        if (so == danhsachsn.get(i).getSoNguyen()) {
                            danhsachsn.remove(danhsachsn.get(i));// nếu xóa: danhsachsn.get(i).getSoNguyen() thì nó xóa theo index
                            dem++;
                        }
                    }
                    if (dem == 0) {
                        System.out.println("Trong danh sách không có phần tử: " + so);
                    }
                    System.out.println("------------DANH SÁCH SAU KHI XÓA------------");
                    for (int i = 0; i < danhsachsn.size(); i++) {
                        danhsachsn.get(i).Xuat();
                    }
                    System.out.println();
                    break;
                }
                case 6: {                    
                     Collections.sort(danhsachsn, (SoNguyen sn1, SoNguyen sn2) -> {
                        if (sn1.getSoNguyen()< sn2.getSoNguyen()) {
                            return 1;
                        } else if (sn1.getSoNguyen()== sn2.getSoNguyen()) {
                            return 0;
                        } else {
                            return -1;
                        }
                    });
                    System.out.println("------------SAU KHI SẮP XẾP GIẢM DẦN-----------------");                    
                    for (int i = 0; i < danhsachsn.size(); i++) {
                        danhsachsn.get(i).Xuat();
                    }
                    System.out.println();
                    break;
                }
                case 7: {
                    Collections.sort(danhsachsn, (SoNguyen sn1, SoNguyen sn2) -> {
                        if (sn1.getSoNguyen()> sn2.getSoNguyen()) {
                            return 1;
                        } else if (sn1.getSoNguyen()== sn2.getSoNguyen()) {
                            return 0;
                        } else {
                            return -1;
                        }
                    });
                    System.out.println("------------SAU KHI SẮP XẾP TĂNG DẦN-----------------");                    
                    for (int i = 0; i < danhsachsn.size(); i++) {
                        danhsachsn.get(i).Xuat();
                    }
                    System.out.println();
                    break;                   
                }
                case 8: {
                    break;
                }
            }
        } while (luachon != 8);
    }
}
