package HinhHoc;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc{
    public static Scanner sc = new Scanner(System.in);
    float dai;
    float rong;

    public HinhChuNhat() {
        ten = "Hinh chu nhat";
    }

    public void nhapChieuDai() {
        System.out.println("Hay nhap vao chieu dai hinh chu nhat: ");
        dai = sc.nextFloat();
    }

    public void nhapChieuRong() {
        System.out.println("Hay nhap vao chieu rong hinh chu nhat: ");
        rong = sc.nextFloat();
    }

    public void tinhChuvi() {
        chuVi = 2 * (dai + rong);
    }

    public void tinhDienTich() {
        dienTich = dai * rong;
    }

}