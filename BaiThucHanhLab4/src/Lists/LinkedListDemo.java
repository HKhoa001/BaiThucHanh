package Lists;
import java.util.LinkedList;
import java.util.Scanner;
import Student.Student;

public class LinkedListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Student> std = new LinkedList<>();
        Student st = new Student();

        do {
            System.out.println ("===Quan ly sinh vien===");
            System.out.println ("1. Tao n sinh vien\n2. Sua thong sinh vien\n3. Xoa mot sinh vien\n4. In thong tin toan bo sinh vien\n0. Thoat");
            System.out.println ("Vui long chon chuc nang");
            String chon = sc.nextLine();
            switch (chon) {
                case "1":
                    System.out.println("====Nhap thong tin====");
                    System.out.print("Nhap so luong sinh vien: ");
                    int n = Integer.parseInt(sc.nextLine());
                    st.NhapThongTin(std, n, sc);
                    break;
                case "2":
                    st.SuaThongTin(std, sc);
                    break;
                case "3":
                    st.XoaSinhVien(std, sc);
                    break;
                case "4":
                    st.HienThiThongTin(std);
                    break;
                default:
                    System.out.println("Khong co chuc nang nay, vui long nhap lai!");
                    System.out.println("");
                    break;

            }
            if (chon.equals("0")) {
                System.exit(0);
            }
        } while (true);

    }
}