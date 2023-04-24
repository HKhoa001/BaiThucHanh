package QLDB;

import java.util.Scanner;

public class MainClass {    
    public static void main(String[] args ) {
        DanhBa db = new DanhBa();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("===Quan ly danh ba===");
            System.out.println("Chon chuc nang: ");
            System.out.println("1. Tao moi. \n2. Cap nhat. \n3. Xoa. \n4. Tim kiem. ");

            String chon = sc.nextLine();
            switch (chon) {
                case "1":
                System.out.println("===Nhap thong tin===");
                db.Nhapthongtin(sc);
                System.out.println("");
                break;
                case "2":
                System.out.println("===Cap nhat thong tin===");
                db.Update(sc);
                System.out.println("");
                break;
                case "3":
                System.out.println("===Xoa contact===");
                db.Delete(sc);
                System.out.println(sc);
                break;
                case "4":
                System.out.println("=== Tim kirm va xuat contact===");
                db.Search(sc);
                System.out.println("");
                break;
                case "5":
                System.out.println("=== Tim kirm va xuat contact===");
                db.Indanhsach(sc);
                System.out.println("");
                break;
                case "0":
                System.out.println("===The end===");
                break;
                default:
                System.out.println("Khong co chuc nang nay, vui long nhap lai:");
                System.out.println("");
                break;

            }
            if(chon.equals("0")) {
                System.exit(0);
            }
        }while (true);
    }
}

