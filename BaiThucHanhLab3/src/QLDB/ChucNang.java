package QLDB;

import java.util.Scanner;

public interface ChucNang {
    public abstract void Nhapthongtin(Scanner sc);
    public abstract void Update(Scanner sc);
    public abstract void Delete(Scanner sc);
    public abstract void Search(Scanner sc);
    public abstract void Indanhsach(Scanner sc);
}