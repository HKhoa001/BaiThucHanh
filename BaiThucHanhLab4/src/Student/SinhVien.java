package Student;

import java.util.Map;
import java.util.Scanner;

public class SinhVien {
    public static  Scanner sc = new Scanner(System.in);
    public String Msv,FullName,Lop;
    
    public void Nhap(Map<String, SinhVien> Ds, int n, Scanner sc){
        SinhVien Sv = new SinhVien();
        for (int i = 0; i < n; i++) {
            System.out.println("== Nhap thong tin ==");
            System.out.print("Msv: ");
            Sv.Msv = sc.nextLine();
            System.out.print("Ho va ten: ");
            Sv.FullName = sc.nextLine();
            System.out.print("Lop: ");
            Sv.Lop = sc.nextLine();
            Ds.put(Sv.Msv,Sv);
        }
    }

    public void Xuat() {
        System.out.println("MSV: " + Msv + "\tHoten: " + FullName + "\tLop: " + Lop);
    }

    public void TimLop(Map<String, SinhVien> Ds, Scanner sc){
        int Dem=0;
        System.out.println("");
        System.out.print("Nhap ten lop muon tim: ");
        String TenL = sc.nextLine();

        System.out.println("Cac sinh vien thuoc lop " + TenL + " la:");
        for(SinhVien Sinhvien:Ds.values()){ 
            if (Sinhvien.Lop.equals(TenL)) {
                Sinhvien.Xuat();
                Dem++;
            }
        }
        if(Dem==0) {
            System.out.println("Khong tim thay lop trong danh sach");
        }
    }

    public void TimSV(Map<String, SinhVien> Ds, Scanner sc){
        int Dem=0;
        System.out.println("");
        System.out.print("Nhap ma sinh vien muon tim: ");
        String Masv = sc.nextLine();

        System.out.println("Sinh vien can tim la:");
        for(SinhVien Sinhvien:Ds.values()){ 
            if (Sinhvien.Msv.equals(Masv)) {
                Sinhvien.Xuat();
                Dem++;
            }
        }
        if(Dem==0) {
            System.out.println("Khong tim thay Msv trong danh sach");
        }
    }
}
