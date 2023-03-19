import java.util.Scanner;

public class Bai9 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        String str;
        int KTT=0,So=0,KTH=0;

        System.out.println("Nhap chuoi: ");
        str = sc.nextLine();

        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c>='a'&& c<='z') KTT++;
            else if(Character.isDigit(c)) So++;
            else KTH++;                     
        }

        System.out.print("Co "+KTT+" ky tu thuong, ");
        System.out.print(KTH+" ky tu hoa ");
        System.out.print("va "+So+" so.");
    }
}