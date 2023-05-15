import java.util.HashSet;
import java.util.Scanner;

public class Slide56 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String name;
        HashSet<String> hashSSt = new HashSet<>();

        hashSSt.add("Wilson");
        hashSSt.add("Nike");
        hashSSt.add("Volvo");
        hashSSt.add("Lenovo");
        hashSSt.add("Kia");
        hashSSt.add("Lenovo");

        System.out.println("cac phan tu co trong hashSSt:");
        System.out.println(hashSSt);
        System.out.println("nhap phan tu can xoa: ");
        name = sc.nextLine();

        if (hashSSt.contains(name)) {
            hashSSt.remove(name);
            System.out.println("xoa thanh cong!");
            System.out.println("cac phan tu con lai trong hashSSt: ");
            System.out.println(hashSSt);
        } else {
            System.out.println("xoa khong thanh cong!");
        }
    }
}   