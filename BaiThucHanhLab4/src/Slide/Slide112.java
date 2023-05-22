package Slide;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.List;

public class Slide112 {
    public static  Scanner sc = new Scanner(System.in);
    public String Name;
    public double Diem;

    public static void main(String[] args) {
        List<Slide112> Ds = new LinkedList<>();
        Slide112 sv = new Slide112();
        sv.Nhap(Ds, sc);
        sv.Check(Ds);
        sv.DiemCao(Ds);
        sv.TimKiem(Ds, sc);
    }

    public void Nhap(List<Slide112> Ds,Scanner sc){
        while (true){ 
            Slide112 sv = new Slide112();
            System.out.print("Nhap ten sinh vien: ");
            sv.Name = sc.nextLine();
            if (sv.Name.equals("")) {
                break;
            }
            System.out.print("Nhap diem sinh vien: ");
            sv.Diem = Double.parseDouble(sc.nextLine());
            Ds.add(sv);
        }
    }

    public void Xuat(){
        System.out.println("" + this.Name + "\t" + this.Diem);
    }

    public void Check(List<Slide112> Ds){
        int Dem = 0;
        System.out.println();
        System.out.println("Sinh vien co diem <= 5 la: ");
        for (Slide112 sinhVien : Ds) {
            if (sinhVien.Diem <= 5) {
                sinhVien.Xuat();
                Dem++;
            }
        }
        System.out.println("Co tong cong " + Dem + " sinh vien truot");
    }

    public void DiemCao(List<Slide112> Ds){
        Ds.sort((o1, o2) -> (int) (o2.Diem - o1.Diem));
        double max = Ds.get(0).Diem;
        System.out.println();
        System.out.println("Sinh vien co diem cao nhat la: ");
        for (Slide112 sinhVien : Ds) {
            if (sinhVien.Diem == max) {
                sinhVien.Xuat();
            }
        }
    }

    public void TimKiem(List<Slide112> Ds, Scanner sc) {
        System.out.println();
        System.out.println("Nhap ten sinh vien can tim: ");
        String Ten = sc.nextLine();
        int Tim = 0;
        for (Slide112 sinhVien : Ds) {
            if (sinhVien.Name.contains(Ten)) {
                sinhVien.Xuat();
                Tim++;
            }
        }
        if (Tim==0){
            System.out.println("Khong tim thay sinh vien!");
        }
    }
}

