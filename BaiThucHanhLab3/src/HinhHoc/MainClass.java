package HinhHoc;
import java.util.Scanner;

public class MainClass {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int Chon;
           
        System.out.println("Chon hinh ban muon: \n 1 Hinh Tron. \n 2 Hinh Tru. \n 3 Hinh Chu Nhat.  \n 4 Hinh Vuong.");
        Chon = sc.nextInt();
        switch(Chon){
        case 1:
        HinhTron hinhTron = new HinhTron();
        hinhTron.xuatTen();
        hinhTron.nhapBanKinh();
        hinhTron.tinhChuvi();
        hinhTron.tinhDienTich();
        hinhTron.inChuVi();
        hinhTron.inDientich();
        break;
        case 2:
        HinhTru hinhTru = new HinhTru();
        hinhTru.xuatTen();
        hinhTru.nhapChieuCao();
        hinhTru.tinhTheTich();
        hinhTru.inTheTich();
        break;
        case 3:
        HinhChuNhat hinhChuNhat = new HinhChuNhat();
        hinhChuNhat.xuatTen();
        hinhChuNhat.nhapChieuDai();
        hinhChuNhat.nhapChieuRong();
        hinhChuNhat.tinhChuvi();
        hinhChuNhat.tinhDienTich();
        hinhChuNhat.inChuVi();
        hinhChuNhat.inDientich();
        break;
        case 4:
        HinhVuong hinhVuong = new HinhVuong();
        hinhVuong.xuatTen();
        hinhVuong.nhapCanh();
        hinhVuong.tinhChuvi();
        hinhVuong.tinhDienTich();
        hinhVuong.inDientich();
        break;


    }
}
}   