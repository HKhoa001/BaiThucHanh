import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x;

        System.out.print("Nhap vao so can kiem tra: ");
        x = sc.nextFloat();

        if (x%2 == 0){
            System.out.println("x la so chan");
        }
        else {
            System.out.println("x là so le");
        }
    }
}