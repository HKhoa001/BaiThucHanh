package Slide;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;

public class Slide110 {
    public static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    ArrayList<Integer> DSN = new ArrayList<>();

    System.out.print("Nhap vao so phan tu: ");
    int n = sc.nextInt();
    Nhap(DSN, n, sc);
    Max(DSN);
    Xoa(DSN, sc);
    SapXep(DSN);
    }

    public static void Nhap(List<Integer>List, int n, Scanner sc){
        for (int i = 0; i < n; i++){
            System.out.print("So thu "+(i+1)+": ");
            int x = sc.nextInt();
            List.add(x);
    }
    }

    public static void Max(List<Integer>List){
        int max = List.get(0);
        for (int i = 0;i< List.size(); i++) {
            if (List.get(i).compareTo(max) > 0) {
                max = List.get(i);
            }
        }
        System.out.println("So lon nhat la: "+ max);
    }

    public static void Xoa(List<Integer>List, Scanner sc){
        System.out.print("Nhap vao so can xoa: ");
        int xoa = sc.nextInt();
        int dem = 0;
        for (int i = 0; i < List.size(); i++){
            if(List.get(i)== xoa){
                List.remove(List.get(i));
                dem++;
            }
        }
        if (dem==0){
            System.out.println("so vua nhap k co trong danh sach");
        }
    System.out.println("Cac phan tu con lai trong DSN: ");
    System.out.println(List);
    }

    public static void SapXep(List<Integer>List){
        Collections.sort(List);
        System.out.println("Danh sach tu be den lon la: ");
        System.out.println(List);
    }
}

