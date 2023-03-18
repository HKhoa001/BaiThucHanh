package baithuchanh;

import java.util.Scanner;

public class Slide74 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        int Tong = 0,n,i;
        int[] arrA = new int[10];
        do{
        System.out.print( "Nhap vao kich thuoc cua mang: ");
        n = sc.nextInt();
        }while(n <= 0);

        for(i = 0; i < n;i++){
        System.out.print("Nhap vao phan tu thu "+ (i+1)+ " :" );
        arrA[i] = sc.nextInt();
            if (arrA[i] %2 ==0){
                Tong = Tong + arrA[i];
            }
        }
        System.out.println("Tong cua cac so chan la: "+ Tong);
    }    
}
