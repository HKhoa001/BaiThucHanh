import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
      
        ArrayList <HDK700Student> List = new ArrayList<>(); 
    System.out.println("Nhap vao so sinh vien muon tao");
    int n = sc.nextInt();

    HDK700Student St = new HDK700Student();

    St.Nhap(List,n);
    St.inThongTin(List);
    }
}
