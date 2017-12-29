
package Cop8_QuanLySoNguyen;

import java.util.Scanner;

public class SoNguyen {
    private int soNguyen;

    public SoNguyen() {
    }

    public SoNguyen(int soNguyen) {
        this.soNguyen = soNguyen;
    }

    public int getSoNguyen() {
        return soNguyen;
    }

    public void setSoNguyen(int soNguyen) {
        this.soNguyen = soNguyen;
    }
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        soNguyen=Integer.parseInt(sc.nextLine());
    }
    public void Xuat(){
        System.out.printf("\t"+soNguyen);
    }
}
