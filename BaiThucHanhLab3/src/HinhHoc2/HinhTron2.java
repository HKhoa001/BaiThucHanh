package HinhHoc2;

import java.util.Scanner;


public class HinhTron2 extends HinhHoc2 {


    private final float Pi = 3.14f;
    private float bankinh;

    public float getbankinh() {
         return bankinh;
    }
    public void HinhTron() {
        super.setTen("Hinh Tron");
    }

    public void  Nhapbankinh(Scanner sc) {
        System.out.print("Nhap ban kinh: ");
        setbankinh(sc.nextFloat());
    }

    public void Tinhchuvi() {
            float chuvi = 2 * bankinh * super.getPi();
            super.setchuvi(chuvi);
    }
    
    public void Tinhdientich() {
        float dientich = (float) Math.pow(bankinh, 2) * super.getPi();
        super.setdientich(dientich);
    }
}