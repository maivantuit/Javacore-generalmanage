package Cop4_QuanLySanPham;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLySanPham {

    public static void main(String[] args) {
        int Arrayn[] = null;
        ArrayList<SanPham> danhsachsp = new ArrayList<SanPham>();
        int luachon = 0;
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("--------------------QUẢN LÝ SẢN PHẨM--------------------");
            System.out.println("1. Nhập n danh sách sản phẩm");
            System.out.println("2. Hiển thị danh sách sản phẩm đã nhập");
            System.out.println("3. Sắp xếp danh sách sản phẩm giảm theo giá");
            System.out.println("4. Sắp xếp danh sách sản phẩm tăng dần theo giá");
            System.out.println("5. Tìm và xóa sản phẩm theo tên");
            System.out.println("6. Sửa thông tin sản phẩm theo tên");
            System.out.println("7. Thoát chương trình");
            System.out.println("--------------------------------------------------------");

            try {
                System.out.println("Mời bạn chọn số thích hợp: ");
                luachon = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Bạn vui lòng nhập đúng dữ liệu tư 1 -> 7, xin cảm ơn!");
            }

            switch (luachon) {
                case 1: {
                    System.out.println("Số sản phẩm cần nhập là: ");
                    n = Integer.parseInt(sc.nextLine());
                    Arrayn = new int[n];// tạo đối tượng ô nhớ lưu n sản phẩm

                    for (int i = 0; i < Arrayn.length; i++) {
                        System.out.println("--------------> Nhập sản phẩm :" + (i + 1));
                        SanPham sp = new SanPham();
                        danhsachsp.add(sp);
                        danhsachsp.get(i).Nhap();

                    }
                    System.out.println();
                    break;
                }
                case 2: {
                    System.out.println("------------------DANH SÁCH SẢN PHẨM--------------------");
                    System.out.printf("%-15s %-20s %-20s", "Mã Sản Phẩm", "Tên Sản Phẩm", "Giá");

                    for (int i = 0; i < danhsachsp.size(); i++) {
                        danhsachsp.get(i).Xuat();
                    }

                    System.out.println();
                    break;
                }
                case 3: {
                    System.out.println("-------------------DANH SÁCH SẢN PHẨM SẮP XẾP THEO GIÁ GIẢM DẦN-----------------------");
                    System.out.printf("%-15s %-20s %-20s", "Mã Sản Phẩm", "Tên Sản Phẩm", "Giá");
                    Collections.sort(danhsachsp, (SanPham sp1, SanPham sp2) -> {
                        if (sp1.getGia() < sp2.getGia()) {
                            return 1;
                        } else if (sp1.getGia() == sp2.getGia()) {
                            return 0;
                        } else {
                            return -1;
                        }

                    });
                    for (int i = 0; i < danhsachsp.size(); i++) {
                        danhsachsp.get(i).Xuat();
                    }
                    System.out.println();
                    break;
                }
                case 4: {
                    System.out.println("-------------------DANH SÁCH SẢN PHẨM SẮP XẾP THEO GIÁ TĂNG DẦN-----------------------");
                    System.out.printf("%-15s %-20s %-20s", "Mã Sản Phẩm", "Tên Sản Phẩm", "Giá");
                    Collections.sort(danhsachsp, (SanPham sp1, SanPham sp2) -> {
                        if (sp1.getGia() > sp2.getGia()) {
                            return 1;
                        } else if (sp1.getGia() == sp2.getGia()) {
                            return 0;
                        } else {
                            return -1;
                        }

                    });
                    for (int i = 0; i < danhsachsp.size(); i++) {
                        danhsachsp.get(i).Xuat();
                    }
                    System.out.println();
                    break;
                }

                case 5: {
                    String tenSP;
                    int dem = 0;
                    System.out.println("Nhập vào tên sản phẩm cần xóa: ");
                    tenSP = sc.nextLine();
                    for (int i = 0; i < danhsachsp.size(); i++) {
                        if (tenSP.equalsIgnoreCase(danhsachsp.get(i).getTenSP())) {
                            danhsachsp.remove(danhsachsp.get(i));
                            dem++;
                        }
                    }
                    if (dem == 0) {
                        System.out.println("Không có sản phẩm theo tìm kiếm của bạn");
                    }
                    System.out.println("-----------DANH SÁCH SẢN PHẨM SAU KHI XÓA------------");
                    for (int i = 0; i < danhsachsp.size(); i++) {
                        danhsachsp.get(i).Xuat();
                    }
                    System.out.println();
                    break;
                }
                case 6: {
                    String tenSP;
                    int dem = 0;
                    System.out.println("Nhập vào tên sản phẩm cần sữa: ");
                    tenSP = sc.nextLine();
                    for (int i = 0; i < danhsachsp.size(); i++) {
                        if (tenSP.equalsIgnoreCase(danhsachsp.get(i).getTenSP())) {
                            danhsachsp.get(i).Nhap();
                        }
                    }
                    System.out.println("-----------DANH SÁCH SẢN PHẨM SAU KHI SỬA------------");
                    for (int i = 0; i < danhsachsp.size(); i++) {
                        danhsachsp.get(i).Xuat();
                    }
                    System.out.println();
                    break;
                }

                case 7: {
                    break;
                }
                case 8: {
                    break;
                }
                case 9: {
                    break;
                }

            }
        } while (luachon != 7);
    }
}
