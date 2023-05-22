package Slide;
import java.util.LinkedList;
import java.util.Scanner;

public class Slide111 {
    public static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    int Sum=0,Dem=0;
    LinkedList<Integer> BSN = new LinkedList<>();

    System.out.print("Nhap so phan tu: ");
    int n = sc.nextInt();

    for (int i = 0; i < n; i++){
        System.out.print("Phan tu thu "+(i+1)+": ");
        int x = sc.nextInt();
        BSN.add(x);
    }
    for (int i = 0; i < n; i++){
        if(BSN.get(i)%2==0){
            Sum = Sum + BSN.get(i);
            Dem++;
        }
    }
    int TBC = Sum / Dem;
    System.out.print("Trung bình cong cua cac so chan la: "+ TBC);
    }
}
