import java.util.ArrayList;
import java.util.Iterator;
public class Slide18 {

    public static void main(String[] args) {
        ArrayList<Float> arrFl = new ArrayList<>();
        arrFl.add(0.7f);
        arrFl.add(7.26f);
        arrFl.add(1.02f);
        arrFl.add(9.3f);
        arrFl.add(5.0f);

        Iterator<Float> it = arrFl.iterator();
        
        System.out.println("Cac phan tu co trong arrFl la: ");
        while (it.hasNext()) {
            System.out.print(it.next() + "\t");
        }
    }
}
