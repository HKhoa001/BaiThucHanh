import java.util.ArrayList;

public class Slide17 {

    public static void main(String[] args) {
        ArrayList<Integer> arrInt = new ArrayList<>();
        arrInt.add(0);
        arrInt.add(7);
        arrInt.add(1);
        arrInt.add(9);
        System.out.println("Cac phan tu trong ArrayLIstInteger la: ");
        for (int number : arrInt) {
            System.out.print(number + "\t");
        }
    }
}
