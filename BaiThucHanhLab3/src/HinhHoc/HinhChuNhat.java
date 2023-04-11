package HinhHoc;

import java.util.Scanner;

public class HinhChuNhat {
public static Scanner sc = new Scanner(System.in);
    float a,b,P,S;
public void NhapCacCanh()
{
    System.out.println("Nhap vao chieu dai: ");
    a = sc.nextFloat();
    System.out.println("Nhap vao chieu rong: ");
    b = sc.nextFloat();
}
public void TinhChuVi() 
{
    P=(a+b)*2;
}

public void TinhDienTich() 
{
    S= a*b;
}
public void InThongTin(int hcn)
{
    System.out.printf("Hinh chu nhat %d chieu dai %f chieu rong %f co \nChu vi = %f \nDien tich = %f",hcn, a, b, P, S);
}
}
