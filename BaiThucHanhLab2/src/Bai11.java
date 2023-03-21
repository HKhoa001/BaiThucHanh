import java.util.Scanner;
 
public class Bai11 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhap vao kich thuoc mang: ");
        int n = sc.nextInt();

        int [] arrA = new int [n];
        System.out.println("Nhap vao cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i+1);
            arrA[i] = sc.nextInt();
        }
        System.out.println("Mang ban dau la: ");
        for (int x : arrA ){
            System.out.print( x +" ");
        }
        System.out.println( );
        System.out.println("Mang theo thu tu tang dan: ");

        int temp;
        for (int i = 0 ; i < arrA.length - 1; i++) {
            for (int j = i + 1; j < arrA.length; j++) {
                if (arrA[i] > arrA[j]) {
                    temp = arrA[j];
                    arrA[j] = arrA[i];
                    arrA[i] = temp;
                }
            }
        }

        for (int i = 0; i < arrA.length; i++) {
            System.out.print(arrA[i] + " ");
        }
    }
}