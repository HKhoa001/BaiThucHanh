import java.util.Scanner;

public class Bai5 {
    public static Scanner sc = new Scanner(System.in);
    public static void main (String[] args){
        int a; int tong = 0;
        
        System.out.print("Nhap so nguyen: " );
        a = sc.nextInt();
        do {
            tong = tong + a;
            System.out.println("Tong so vua nhap la: " +tong );
                if(tong > 100)
                    break;
            System.out.println("Tong chua lon hon 100, vui long nhap tiep so nguyen: ");
            a =sc.nextInt();

        }
        while(tong < 100);
    }
}