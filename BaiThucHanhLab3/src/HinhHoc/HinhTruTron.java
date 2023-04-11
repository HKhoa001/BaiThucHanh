package HinhHoc;

import java.util.Scanner;

public class HinhTruTron extends HinhTron {
    public static Scanner sc = new Scanner(System.in);
    float h,V;
    public void NhapChieuCao()
    {
        System.out.print("Nhap vao ban kinh r: ");
        h = sc.nextFloat();
    }
    public void TinhTheTich()
    {
        V= h*S;
    }
    public void InThongTin(int ht)
    {
        System.out.printf("Hinh tron %d the tich = %f",ht, V);
    }
}
