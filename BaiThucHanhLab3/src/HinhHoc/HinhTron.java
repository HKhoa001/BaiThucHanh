package HinhHoc;

import java.util.Scanner;

public class HinhTron extends HinhHoc {
    public static Scanner sc = new Scanner(System.in);
    public float banKinh;

    public HinhTron(){
        ten = "Hinh tron";
    }

    public void nhapBanKinh()
    {
        System.out.print("Nhap ban kinh r: "); 
        banKinh = sc.nextFloat();
    }

    public void tinhChuvi()
    {
        chuVi = 2 * banKinh * Pi;
    }    

    public void tinhDienTich()
    {
        dienTich = banKinh * banKinh * Pi;
    }
}