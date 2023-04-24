package HinhHoc2;

public class HinhHoc2 {

    private final float Pi = 3.14f;
    private float rong;
    private float dai;
    private float bankinh;
    private String ten;
    private float chuvi;
    private float dientich;
    private float thetich;


    public float getrong() {
        return rong;
    }

    public void setrong(float rong) {
        this.rong = rong;
    }
    public float getdai() {
        return dai;
    }

    public void setdai(float dai) {
        this.dai = dai;
    }

     public float getbankinh() { 
        return bankinh;
     }

     public void setbankinh(float bankinh) {
        this.bankinh = bankinh;
     }   

    public float getPi() {
        return Pi;
    }

    public String getten() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public float getchuvi() {
        return chuvi;
    }

    public void setchuvi(float chuvi) {
        this.chuvi = chuvi;
    }

    public float getdientich() {
        return dientich;
    }

    public void setdientich(float dientich) {
        this.dientich = dientich;
    }
    
    public float getthetich() {
        return thetich;
    }

    public void setthetich(float thetich) {
        this.thetich = thetich;
    }

    public HinhHoc2() {}

    public void Xuatten() {
        System.out.println("===="+this.ten+"====");
    }
    public void Inchuvi() {
        System.out.println("Chu vi ="+this.chuvi);
    }
    public void Indientich() {
        System.out.println("Dien tich ="+this.dientich);
    }
    public void Inthetich() {
        System.out.println("The tich ="+this.thetich);
    }
    public void bankinh() {
        System.out.println("Ban kinh ="+this.bankinh);
    } 

}