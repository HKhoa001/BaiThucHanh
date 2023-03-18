import java.util.Scanner;

public class Bai10 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String a = new String();
        System.out.println("Nhap chuoi: ");
        a = sc.nextLine();
        
        System.out.printf("Chuoi co %d ky tu\n" ,a.length());
        
    }
}