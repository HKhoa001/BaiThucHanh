import java.util.ArrayList;
import java.util.ListIterator;

public class Slide19 {
    public static void main(String[] args) {
        ArrayList<Character> arrC = new ArrayList<>();
        arrC.add('a');
        arrC.add('e');
        arrC.add('b');
        arrC.add('c');
        ListIterator<Character> lit = arrC.listIterator();

        System.out.println("Cac phan tu co trong mang la: ");
        while (lit.hasNext()) {
            System.out.print(lit.next() + "\t");
        } 
    }
}