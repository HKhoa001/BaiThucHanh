import java.util.ArrayList;

public class Slide16 {
    public static void main(String[] args) {
        ArrayList<String> arrSt = new ArrayList<>();
        arrSt.add("JAVA");
        arrSt.add("PHP");
        arrSt.add("C#");
        arrSt.add("C++");
        System.out.println("Cac phan tu trong arrListString la: ");
        for(int i = 0; i <arrSt.size(); i++) {
            System.out.print(arrSt.get(i) +"\t");
        }
    }
}
