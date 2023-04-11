import HinhHoc.HinhTron;
import HinhHoc.HinhChuNhat;
import HinhHoc.HinhTruTron;
import HinhHoc.HinhVuong;

import java.util.Scanner;

public class Demo {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int HH;
           
        System.out.println("Chon hinh ban muon: \n 1 Hinh Tron. \n 2 Hinh Chu Nhat. \n 3 Hinh Tru Tron. \n 4 Hinh Vuong.");
        HH = sc.nextInt();
        switch(HH){
        case 1:
        HinhTron ht = new HinhTron();
        ht.NhapBanKinh();
        ht.TinhChuVi();
        ht.TinhDienTich();
        ht.InThongTin(1);
        break;
        case 2:
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.NhapCacCanh();
        hcn.TinhChuVi();
        hcn.TinhDienTich();
        hcn.InThongTin(1);
        break;
        case 3:
        HinhTruTron htt = new HinhTruTron();
        htt.NhapBanKinh();
        htt.TinhChuVi();
        htt.TinhDienTich();
        htt.TinhTheTich();
        htt.InThongTin(1);
        break;
        case 4:
        HinhVuong hv = new HinhVuong();
        hv.NhapCacCanh();
        hv.TinhChuVi();
        hv.TinhDienTich();
        hv.InThongTin(1);
        break;


    }
}
}   

