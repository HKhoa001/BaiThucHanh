import java.util.Scanner;
import java.util.ArrayList;

public class Student {
    public static Scanner sc = new Scanner(System.in)
    int Age;
    String FullName;

    public void nhapThongTinSv()
    {
        System.out.print("FullName: "); FullName = sc.nextLine();
        System.out.print("Age: "); Age = sc.nextInt();
    }

    public void inThongTinSv()
    {
        System.out.printf("\nSinh vien vua nhap co thong tin la:\nFullName: %d\nAge: %d", FullName, Age);
    }
    
    public static void Insert (List Student;int n ){
        Student Std = new Student();
        System.out.println("Nhap vao so sinh vien can them: ");
        n = sc.nextInt()
        for (int i = 0; i< n ; i++){
            StdArrayList.add(Std.nhapThongTinSv(););
        }
    }

}


