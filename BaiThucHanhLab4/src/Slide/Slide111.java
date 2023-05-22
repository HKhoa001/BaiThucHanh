package Slide;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.List;

public class Slide111 {
    public static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    LinkedList<Integer> BSN = new LinkedList<>();
    System.out.print("Nhap so phan tu: ");
    int n = sc.nextInt();

    Nhap(BSN,n,sc);
    TBC(BSN);
    }

    public static void Nhap(List<Integer>List,int n, Scanner sc){
        for (int i = 0; i < n; i++){
            System.out.print("Phan tu thu "+(i+1)+": ");
            int x = sc.nextInt();
            List.add(x);
        }
    }

    public static void TBC(List<Integer>List){
        double Sum=0,Dem=0;
        for (int i = 0; i < List.size(); i++){
            if(List.get(i)%2==0){
                Sum = Sum + List.get(i);
                Dem++;
            }
        }
        double TBC = Sum / Dem;
        System.out.print("Trung bình cong cua cac so chan la: "+ TBC);
    }
}
