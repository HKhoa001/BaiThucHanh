import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        ArrayList<Integer> arrList = new ArrayList<>();
        int number;
        String k;

        System.out.print("nhap vao kich thuoc mang: ");
        int n = sc.nextInt();

        for (int i = 0;i < n; i++) {
            do{
                k=null;
                try {
                    System.out.printf("Nhap vao phan tu a[%d]: ", (i+1));
                    number = sc.nextInt();
                    arrList.add(number);
                }catch(Exception e ){
                    System.out.println(e);
                    k ="A";
                }
            }while(k=="A");
        }
        System.out.println(arrList);
    }
}