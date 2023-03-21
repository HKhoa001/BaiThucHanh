import java.util.Scanner;

public class Student {
    public static Scanner sc = new Scanner(System.in);
        String Ten,Lop;
        int Tuoi;
    void NhapThongTin()
    {
        System.out.println("Nhap vao thong tin sinh vien: ");
        System.out.print("Ten: ");
        Ten = sc.next();
        System.out.print("Tuoi: ");
        Tuoi = sc.nextInt();
        System.out.print("Lop: ");
        Lop = sc.next();
    }
    void InThongTin()
    {
        System.out.printf("Ten Sv: %s \nTuoi: %d \nLop: %s",Ten, Tuoi, Lop);
    }
}
