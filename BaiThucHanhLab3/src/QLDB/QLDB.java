package QLDB;

public class QLDB {
    private String tel;
    private String name;

    public String gettel(){
    return tel;
}

public void settel(String tel) {
    this.tel = tel;
}

public String getname() {
    return name;
}
public void setname(String name){
    this.name = name;
}

public QLDB(){

}

public QLDB(String name, String tel) {
    this.name = name;
    this.tel = tel;
}

public void Inthongtin() {
    System.out.println("Name"+this.name +"\tTel: " +this.tel);
}
public void Indanhsach() {
    System.out.println("Name"+this.name +"\tTel: " +this.tel);
}
}
