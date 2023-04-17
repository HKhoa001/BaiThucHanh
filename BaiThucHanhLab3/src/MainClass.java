import HinhHoc.HinhChuNhat;
import HinhHoc.HinhTru;
import HinhHoc.HinhVuong;
import HinhHoc.HinhTron;

public class MainClass {
    public static void main(String[] args) {
        HinhTron hinhTron = new HinhTron();
        hinhTron.xuatTen();
        hinhTron.nhapBanKinh();
        hinhTron.tinhChuvi();
        hinhTron.tinhDienTich();
        hinhTron.inChuVi();
        hinhTron.inDientich();

        HinhTru hinhTru = new HinhTru();
        hinhTru.xuatTen();
        hinhTru.nhapChieuCao();
        hinhTru.tinhTheTich();
        hinhTru.inTheTich();

        HinhChuNhat hinhChuNhat = new HinhChuNhat();
        hinhChuNhat.xuatTen();
        hinhChuNhat.nhapChieuDai();
        hinhChuNhat.nhapChieuRong();
        hinhChuNhat.tinhChuvi();
        hinhChuNhat.tinhDienTich();
        hinhChuNhat.inChuVi();
        hinhChuNhat.inDientich();

        HinhVuong hinhVuong = new HinhVuong();
        hinhVuong.xuatTen();
        hinhVuong.nhapCanh();
        hinhVuong.tinhChuvi();
        hinhVuong.tinhDienTich();
        hinhVuong.inDientich();
    }
}