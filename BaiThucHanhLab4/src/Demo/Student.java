package Demo;

import java.util.Scanner;
import java.util.Map;

public class Student {
    public static Scanner sc = new Scanner(System.in);
    public String Msv,ten,lop;

    void nhap(Map<String,Student> Sv,Scanner sc,int n){
        for(int i = 0;i<n;i++){
            Student sv = new Student();
            Msv=sc.nextLine();
            ten=sc.nextLine();
            lop=sc.nextLine();
            Sv.put(sv.Msv,sv);
        }
    }

    
}