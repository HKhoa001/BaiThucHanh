import java.util.Scanner;

public class Bai1 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        float x,y;

        System.out.print("Nhap vao so thu nhat: ");
        x = sc.nextFloat();
        System.out.print("Nhap vao so thu hai: ");
        y = sc.nextFloat();

        System.out.println("Tong cua hai so la: " +(x+y));
        System.out.println("Hieu cua hai so la: " +(x-y));
        System.out.println("Tich cua hai so la: " +(x*y));
        System.out.println("thuong cua hai so la: " +(x/y));

        if (x-y > 0){
            System.out.println("x > y");
        }
        else if (x-y == 0){
            System.out.println("x = y");
            }
        else {System.out.println("x < y");
        }
       
    }
}
