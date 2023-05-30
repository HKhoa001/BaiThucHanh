import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class HDK700Student {
      
    public String Ten,lop;
    public int tuoi;

    public static void Nhap (ArrayList<HDK700Student> Sv ,int n){
        Scanner sc = new Scanner(System.in);
        HDK700Student St = new HDK700Student();

        for(int i=0;i<n;i++){
        System.out.println("Nhap vao ten sinh vien");
        St.Ten = sc.nextLine();
        System.out.println("Nhap vao tuoi sinh vien");
        St.tuoi = sc.nextInt();
        System.out.println("Nhap vao lop sinh vien");
        St.lop = sc.nextLine();

        Sv.add(St);
        }
    }

    public static void Hienthi (){
        HDK700Student St = new HDK700Student();
        System.out.println("Ten: "+St.Ten+"Tuoi: "+St.tuoi+"Lop: "+St.lop);

    }
    public static void inThongTin (ArrayList<HDK700Student> Sv){

        for(HDK700Student x:Sv){
            x.Hienthi();
        }
    }

    public static void Delete (ArrayList<HDK700Student> Sv){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao sinh vien muón x");
        St.tuoi = sc.nextInt();
    }
}

