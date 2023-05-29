package Slide;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import Student.SinhVien;

public class Slide114 {
    public static  Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    Map<String,SinhVien> Dssv = new HashMap<>();
    SinhVien Sv = new SinhVien();
    System.out.print("Nhap so luong sinh vien: ");
    int n = Integer.parseInt(sc.nextLine());

    Sv.Nhap(Dssv, n, sc);
    Sv.HienThi(Dssv);
    Sv.TimLop(Dssv, sc);
    Sv.TimSV(Dssv, sc);
    }
}

