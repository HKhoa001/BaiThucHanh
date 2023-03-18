import java.util.Scanner;

public class Bai6 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        int x;
        int n=1;

        do {System.out.print("Nhap vao so nguyen duong: ");
        x = sc.nextInt();
        }while(x<=0);
            for(int i = 1; i <=x; i++){
                n = n*i;
            }
        System.out.print( x + "! = " + n);
    }
}
