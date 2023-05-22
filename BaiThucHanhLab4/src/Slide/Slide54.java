package Slide;
import java.util.HashSet;
import java.util.Scanner;


public class Slide54 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int number;
        HashSet<Integer> hashSI = new HashSet<>();

        hashSI.add(0);
        hashSI.add(3);
        hashSI.add(1);
        hashSI.add(4);
        hashSI.add(2);
        hashSI.add(8);

        System.out.println("cac phan tu trong hashSI: ");
        System.out.println(hashSI);
        System.out.println("nhap phan tu can them: ");
        number = sc.nextInt();


        if (hashSI.contains(number)) {
            hashSI.add(number);
            System.out.println("them thanh cong: ");
            System.out.println("cac phan tu trong hashSI sau khi them: ");
            System.out.println(hashSI);
        } else {
            System.out.println("phan tu" + number + " da ton tai!");
        }
    }
}