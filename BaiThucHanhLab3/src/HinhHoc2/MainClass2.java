package HinhHoc2;
import java.util.Scanner;

public class MainClass2 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int Chon;
           
        System.out.println("Chon hinh ban muon: \n 1 Hinh Tron. \n 2 Hinh Tru. \n 3 Hinh Chu Nhat.  \n 4 Hinh Vuong.");
        Chon = sc.nextInt();
        switch(Chon){
        case 1:
        HinhTron2 ht = new HinhTron2();
        ht.Xuatten();
        ht.Nhapbankinh(sc);
        ht.Tinhchuvi();
        ht.Tinhdientich();
        ht.Inchuvi();
        ht.Indientich();
        break;
        case 2:
        HinhTru2 hTru = new HinhTru2();
        hTru.Xuatten();
        hTru.Nhapchieucao(sc);
        hTru.Tinhthetich();
        hTru.Inthetich();
        hTru.bankinh();
        break;
        case 3:
        HinhChuNhat2 hcn = new HinhChuNhat2();
        hcn.Xuatten();
        hcn.Nhapchieudai(sc);
        hcn.Nhapchieurong(sc);
        hcn.Tinhchuvi();
        hcn.Tinhdientich();
        hcn.Inchuvi();
        hcn.Indientich();
        break;
        case 4:
        HinhVuong2 hv = new HinhVuong2();
        hv.Xuatten();
        hv.Nhapcanh(sc);
        hv.Tinhchuvi();
        hv.Tinhdientich();
        hv.Inchuvi();
        hv.Indientich();
        break;


    }
}
}   