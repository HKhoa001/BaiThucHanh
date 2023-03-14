import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float TBC =0;
        int n,i;
        int[] arrA = new int[10];

        do{
            System.out.print("Nhap kich thuoc cua mang: ");
            n = sc.nextInt();
        }while(n <= 0);

        for(i = 0; i < n;i++){
        System.out.print("Nhap vao phan tu thu "+ (i+1)+ " :" );
        arrA[i] = sc.nextInt();
           
                TBC = (TBC + arrA[i]);
        }
        System.out.println("Trung binh cong cua mang la: "+ TBC/n );
    }    
}