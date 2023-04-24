package HinhHoc;

import java.util.Scanner;

public class HinhTru extends HinhTron {
    public static Scanner sc = new Scanner(System.in);
    public float chieucao;
    public HinhTru() {
        ten = "Hinh tru";
    }
    
    public void nhapChieuCao() {
        nhapBanKinh();
        System.out.print("Nhap chieu cao: "); 
        chieucao = sc.nextFloat();
    }

    public void tinhTheTich() {
        tinhDienTich();
        theTich = dienTich * chieucao; 
    }

}