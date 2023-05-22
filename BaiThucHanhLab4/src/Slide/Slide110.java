package Slide;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Slide110 {
    public static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    ArrayList<Integer> DSN = new ArrayList<>();

    System.out.print("Nhap vao so phan tu: ");
    int n = sc.nextInt();

    for (int i = 0; i < n; i++){
        System.out.print("Phan tu thu "+(i+1)+": ");
        int x = sc.nextInt();
        DSN.add(x);
    }

    int max = DSN.get(0);
    for (int i = 0;i< DSN.size(); i++) {
        if (DSN.get(i).compareTo(max) > 0) {
            max = DSN.get(i);
        }
    }
    System.out.println("Phan tu lon nhat la: "+ max);

    System.out.print("Nhap phan tu can xoa: ");
    int xoa = sc.nextInt();
    for (int i = 0; i < n; i++){
        if(DSN.get(i)== xoa){
            DSN.remove(DSN.get(i));
        }
    }
    System.out.println("Cac phan tu con lai trong DSN: ");
    System.out.println(DSN);

    Collections.sort(DSN);
    System.out.println("Danh sach tu be den lon la: ");
    System.out.println(DSN);

}
}
