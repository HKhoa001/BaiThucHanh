package baithuchanh;

public class Slide55 {
    
    public static void main(String[] args) {
        System.out.println("Cac so chia het cho 5 la: ");

        for (int i = 0; i <= 20; i++) {
            if (i % 5 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}