import java.util.Scanner;

public class Bai10 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String chuoi;
        char Kytu;
        int Dem = 0;
        do{
            System.out.println("Nhap chuoi: ");
        chuoi = sc.nextLine();
        }while (chuoi.length()>80 );
        System.out.println("Nhap ki tu can tim: ");
        Kytu = sc.next().charAt(0);

        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == Kytu) {
                Dem++;
            }
        }
             
        System.out.println("So lan xuat hien cua ky tu " + Kytu +
            " trong chuoi la " + Dem);
    }
}
