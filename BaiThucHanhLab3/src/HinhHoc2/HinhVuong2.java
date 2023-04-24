package HinhHoc2;

import java.util.Scanner;

public class HinhVuong2 extends HinhChuNhat2 {
    public HinhVuong2(){
        super.setTen("Hinh vuong");
    }

    public void Nhapcanh(Scanner sc ) {
        System.out.print("Nhap canh: ");
        super.setdai(sc.nextFloat());
        super.setrong(sc.nextFloat());
    }
}