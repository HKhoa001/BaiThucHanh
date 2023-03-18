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
        sortASC(arrA);
        System.out.println("Day so theo thu tu tang dan: ");
        show(arrA);
    }

    public static void sortASC(int [] arrA) {
        int temp = arrA[0];
        for (int i = 0 ; i < arrA.length - 1; i++) {
            for (int j = i + 1; j < arrA.length; j++) {
                if (arrA[i] > arrA[j]) {
                    temp = arrA[j];
                    arrA[j] = arrA[i];
                    arrA[i] = temp;
                }
            }
        }
    }
    
    public static void show(int [] arrA) {
        for (int i = 0; i < arrA.length; i++) {
            System.out.print(arrA[i] + " ");
        }
    }
}