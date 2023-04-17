package HinhHoc;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat {
    public static Scanner sc = new Scanner(System.in);
    public HinhVuong() {
        ten = "Hinh vuong";
    }

    public void nhapCanh(){
        System.out.println("Canh = ");
        dai = rong = sc.nextFloat();
    }
}