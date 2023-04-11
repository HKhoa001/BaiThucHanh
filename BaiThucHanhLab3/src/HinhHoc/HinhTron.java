package HinhHoc;

import java.util.Scanner;

public class HinhTron {
    public static Scanner sc = new Scanner(System.in);
    final float PI = 3.14f;
    float r,P,S;
    public void NhapBanKinh()
    {
        System.out.print("Nhap vao ban kinh r: ");
        r = sc.nextFloat();
    }
    public void TinhChuVi() 
    {
        P = 2*r* PI;
    }
    public void TinhDienTich() 
    {
        S = r*r* PI ;
    }
    public void InThongTin(int ht)
    {
        System.out.printf("Hinh tron %d ban kinh %f co \nChu vi = %f \nDien tich = %f",ht, r, P, S);
    }
}


