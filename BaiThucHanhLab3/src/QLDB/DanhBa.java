package QLDB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DanhBa implements ChucNang {
    List<QLDB> list = new ArrayList<>();

    public DanhBa() {

    }

    @Override
    public void Nhapthongtin(Scanner sc) {
        while (true) {
            System.out.print("Nhap ten: ");
            String name = sc.nextLine();
            System.out.print("Nhap sdt: ");
            String tel = sc.nextLine();
            QLDB contact = new QLDB(name, tel);
            list.add(contact);

            System.out.print("\nBan co muon nhap tiep:\n Y of N ");
            String chon = sc.nextLine();
            if (chon.equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    @Override
    public void Update(Scanner sc) {
        System.out.print("Vui long nhap ten can cap nhat: ");
        String chon = sc.nextLine();
        QLDB tim = null;
        for (QLDB contact : list) {
            if(contact.getname().contains(chon)) {
                tim = contact;
                break;
            }
        }

        if(tim == null) {
            System.out.println("Khong tim thay vui long nhap moi:");
            Nhapthongtin(sc);
        } else {
            System.out.println("Cap nhap so dien thoai: ");
            tim.settel(sc.nextLine());
            System.out.println("Da cap nhap so dien thoai!");
            System.out.println("");
        }
    }

    @Override
    public void Delete(Scanner sc) {
        System.out.print("Vui long nhap ten can xoa: ");
        String chon = sc.nextLine();
        QLDB tim = null;
        for (QLDB contact : list) {
            if(contact.getname().contains(chon)) {
                tim = contact;
                break;
            }
        }
        if(tim == null) {
            System.out.println("Khong tim thay contact!");
        } else {
            list.remove(tim);
            System.out.println("Da xoa thanh cong danh ba!");
        }


    }

    @Override
    public void Search(Scanner sc) {
        System.out.print("Vui long nhap ten can tim: ");
        String chon = sc.nextLine();
        QLDB tim = null;
        for (QLDB contact : list) {
            if(contact.getname().contains(chon)) {
                tim = contact;
                break;
            }
        }
        if(tim == null) {
            System.out.println("Khong tim thay contact");
        } else {
            System.out.println("Thong tin contact ban tim: ");
            tim.Inthongtin();
            
        }
        

    }

    @Override
    public void Indanhsach(Scanner sc) {
        QLDB qldb = new QLDB();
        Collections.shuffle(list, null);
        qldb.Inthongtin();
    }

}