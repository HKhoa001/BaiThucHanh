import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int x;

        System.out.print("Nhap vao ten cua ban: ");
        name = sc.next();
        System.out.print("Nhap vao so nam sinh: ");
        x = sc.nextInt();

        if (2023-x < 16){
            System.out.println("Ban "+ name + " o do tuoi vi thanh nien");
        }
        else if (2023-x >=18){
            System.out.println("Ban "+ name + " da gia");
            }
        else {System.out.println("Ban "+ name + " o do tuoi truong thanh");
        }

    }
}
