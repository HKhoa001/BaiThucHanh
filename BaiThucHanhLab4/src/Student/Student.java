package Student;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Student {
    public String FullName;
    public int Age;
    Scanner sc = new Scanner(System.in);

    public void nhap(Student st, Scanner sc) {
        System.out.print("Ho va ten: ");
        st.FullName = sc.nextLine();
        System.out.print("Tuoi: ");
        st.Age = Integer.parseInt(sc.nextLine());
    }

    // list
    public void NhapThongTin(List<Student> std, int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh vien thu " + (i + 1)+":");
            Student student = new Student();
            nhap(student, sc);
            std.add(student);
        }
    }

    // set
    public void NhapThongTin(Set<Student> std, int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh vien thu " + (i + 1)+":");
            Student student = new Student();
            nhap(student, sc);
            std.add(student);
        }
    }

    public void hienthi() {
        System.out.print("Ho ten: " + FullName + "\nTuoi: " + Age);
        System.out.println("");
    }

    // list
    public void HienThiThongTin(List<Student> std) {
        System.out.println("=======Danh sach sinh vien=======");
        for (Student student : std) {
            student.hienthi();
        }
    }

    // set
    public void HienThiThongTin(Set<Student> std) {
        System.out.println("=======Danh sach sinh vien=======");
        for (Student student : std) {
            student.hienthi();
        }
    }

    // list
    public void SuaThongTin(List<Student> std, Scanner sc) {
        System.out.print("Sinh vien can sua: ");
        String tim = sc.nextLine();
        Student stTim = null;
        for (Student student : std) {
            if (student.FullName.contains(tim)) {
                stTim = student;
                break;
            }
        }
        if (stTim != null) {
            System.out.print("Nhap Ho Ten: ");
            String ten = sc.nextLine();
            System.out.print("Nhap tuoi: ");
            int tuoi = Integer.parseInt(sc.nextLine());
            stTim.FullName = ten;
            stTim.Age = tuoi;

        } else {
            System.out.println("Khong tim thay sinh vien can sua!");
        }
    }

    // set
    public void SuaThongTin(Set<Student> std, Scanner sc) {
        System.out.print("Sinh vien can sua: ");
        String tim = sc.nextLine();
        Student stTim = null;
        for (Student student : std) {
            if (student.FullName.contains(tim)) {
                stTim = student;
                break;
            }
        }
        if (stTim != null) {
            System.out.print("Nhap Ho Ten: ");
            String ten = sc.nextLine();
            System.out.print("Nhap tuoi: ");
            int tuoi = Integer.parseInt(sc.nextLine());
            stTim.FullName = ten;
            stTim.Age = tuoi;

        } else {
            System.out.println("Khong tim thay sinh vien can sua!");
        }
    }

    // list
    public void XoaSinhVien(List<Student> std, Scanner sc) {
        System.out.print("Nhap ten sinh vien can xoa: ");
        String tim = sc.nextLine();
        Student stTim = null;
        for (Student student : std) {
            if (student.FullName.contains(tim)) {
                stTim = student;
                break;
            }
        }
        if (stTim != null) {
            std.remove(stTim);
            System.out.println("Da xoa thanh cong!");
        } else {
            System.out.println("Khong tim thay sinh vien can xoa!");
        }
    }

    // set
    public void XoaSinhVien(Set<Student> std, Scanner sc) {
        System.out.print("Nhap ten sinh vien can xoa: ");
        String tim = sc.nextLine();
        Student stTim = null;
        for (Student student : std) {
            if (student.FullName.contains(tim)) {
                stTim = student;
                break;
            }
        }
        if (stTim != null) {
            std.remove(stTim);
            System.out.println("Da xoa thanh cong!");
        } else {
            System.out.println("Khong tim thay sinh vien can xoa!");
        }
    }

}