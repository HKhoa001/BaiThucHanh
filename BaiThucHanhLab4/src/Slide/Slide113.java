package Slide;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;
import java.util.List;

public class Slide113 {
    public static  Scanner sc = new Scanner(System.in);
    String Name;
    public static void main(String[] args) {
        HashSet<String> TraiCay = new HashSet<>();
        Slide113 tc = new Slide113();
        tc.Nhap(TraiCay,sc);
        tc.Tim(TraiCay,sc);
        tc.Xoa(TraiCay,sc);

        List<String> HoaQua = new ArrayList<>();
        HoaQua.add("cam");
        HoaQua.add("tao");
        HoaQua.add("man");
        HoaQua.add("vai");
        
        TraiCay.addAll(HoaQua);
        System.out.println("");
        System.out.println("Danh sach sau khi them: ");
        System.out.println(TraiCay);

        System.out.println("Danh sach sau khi sua: ");
        Iterator<String> itr = TraiCay.iterator();
        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.println(element);
        }
        
        System.out.println("");
        System.out.println("Cac phan tu cua hashset sau khi xoa phan tu cua list trong hashset la: ");
        TraiCay.removeAll(HoaQua);
        for (String x : TraiCay) {
            System.out.println(x);
        }
    }

    public void Nhap(HashSet<String> Ds,Scanner sc){
        int Dem=0;
        while (true){ 
            System.out.print("Nhap ten trai cay: ");
            String Name = sc.nextLine();
            Ds.add(Name);
            if (Name.equals("")) {
            break;
            }
            Dem++;
        }
        System.out.println("Da nhap " +Dem+" loai trai cay ");
    }

    public void Tim(HashSet<String> Ds,Scanner sc){
        int Dem=0;
        System.out.println("");
        System.out.print("Nhap ten loai trai cay muon tim: ");
        String Ten = sc.nextLine();
        if (Ds.contains(Ten)) {
            System.out.println("trai cay ban tim da co trong danh sach");
            Dem++;
        }
        if(Dem==0) {
            System.out.println("Khong tim thay trai cay trong danh sach");
        }
    }

    public void Xoa(HashSet<String> Ds,Scanner sc){
        int Dem=0;
        System.out.println("");
        System.out.print("Nhap ten loai trai cay muon xoa: ");
        String Ten = sc.nextLine();
        for (int i = 0; i < Ds.size(); i++){
            if (Ds.contains(Ten)) {
                Ds.remove(Ten);
                Dem++;
            }
        } 
        if(Dem>0) {
            System.out.println("Da xoa thanh cong trai cay");
        } else {
            System.out.println("Khong tim thay trai cay can xoa");
        }
        System.out.println("Cac phan tu con lai trong DS: ");
        System.out.println(Ds);
    }

}
